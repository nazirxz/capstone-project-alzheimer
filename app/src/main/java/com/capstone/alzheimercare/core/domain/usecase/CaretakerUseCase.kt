package com.capstone.alzheimercare.core.domain.usecase

import com.capstone.alzheimercare.core.network.Resource
import com.capstone.alzheimercare.core.domain.model.Caretaker
import kotlinx.coroutines.flow.Flow

interface CaretakerUseCase {
    fun getCaretaker(): Flow<List<Caretaker>>
    fun getCaretakerDetail(id: String): Flow<Resource<Caretaker>>
    fun getCaretaker(email: String): Flow<Resource<Caretaker>>
    suspend fun insertCaretaker(caretaker: Caretaker): String
    fun updateCaretaker(caretaker: Caretaker)
    fun updatePictureCaretaker(id: String, url: String)
    fun deleteCaretaker(id: String)
}