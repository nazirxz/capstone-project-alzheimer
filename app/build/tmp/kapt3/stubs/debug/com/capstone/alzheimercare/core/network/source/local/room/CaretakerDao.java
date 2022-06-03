package com.capstone.alzheimercare.core.network.source.local.room;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\'J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\n\u001a\u00020\u0005H\'J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\'J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH\'J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\tH\'J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\'\u00a8\u0006\u0013"}, d2 = {"Lcom/capstone/alzheimercare/core/network/source/local/room/CaretakerDao;", "", "deleteCaretaker", "", "id", "", "getCaretaker", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/capstone/alzheimercare/core/network/source/local/entity/CaretakerEntity;", "email", "password", "getCaretakerDetail", "insertCaretaker", "", "caretaker", "updateCaretaker", "updatePictureCaretaker", "url", "app_debug"})
public abstract interface CaretakerDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM caretaker ORDER BY name")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.capstone.alzheimercare.core.network.source.local.entity.CaretakerEntity>> getCaretaker();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM caretaker WHERE id=:id")
    public abstract kotlinx.coroutines.flow.Flow<com.capstone.alzheimercare.core.network.source.local.entity.CaretakerEntity> getCaretakerDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM caretaker WHERE email=:email")
    public abstract kotlinx.coroutines.flow.Flow<com.capstone.alzheimercare.core.network.source.local.entity.CaretakerEntity> getCaretaker(@org.jetbrains.annotations.NotNull()
    java.lang.String email);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM caretaker WHERE email=:email AND password=:password")
    public abstract kotlinx.coroutines.flow.Flow<com.capstone.alzheimercare.core.network.source.local.entity.CaretakerEntity> getCaretaker(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract long insertCaretaker(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.network.source.local.entity.CaretakerEntity caretaker);
    
    @androidx.room.Update()
    public abstract void updateCaretaker(@org.jetbrains.annotations.NotNull()
    com.capstone.alzheimercare.core.network.source.local.entity.CaretakerEntity caretaker);
    
    @androidx.room.Query(value = "UPDATE caretaker SET picture=:url WHERE id=:id")
    public abstract void updatePictureCaretaker(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String url);
    
    @androidx.room.Query(value = "DELETE FROM caretaker WHERE id=:id")
    public abstract void deleteCaretaker(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
}