package com.capstone.alzheimercare.di

import androidx.room.Room
import com.capstone.alzheimercare.data.Repository
import com.capstone.alzheimercare.data.source.local.LocalDataSource
import com.capstone.alzheimercare.data.source.local.room.Database
import com.capstone.alzheimercare.data.source.remote.RemoteDataSource
import com.capstone.alzheimercare.domain.repository.IRepository
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import java.util.concurrent.TimeUnit

val databaseModule = module {
    factory { get<Database>().patientDao() }
    factory { get<Database>().caretakerDao() }
    single {
        Room.databaseBuilder(
            androidContext(),
            Database::class.java, "Medical.db"
        ).fallbackToDestructiveMigration().build()
    }
}

val networkModule = module {
    single {
        OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            .connectTimeout(120, TimeUnit.SECONDS)
            .readTimeout(120, TimeUnit.SECONDS)
            .build()
    }
}

val repositoryModule = module {
    single { LocalDataSource(get(), get()) }
    single { RemoteDataSource() }
    single<IRepository> { Repository(get(), get()) }
}