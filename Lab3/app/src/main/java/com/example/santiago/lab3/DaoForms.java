package com.example.santiago.lab3;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface DaoForms {
    @Insert
    void insertOnlySingleForm (Forms forms);
    @Insert
    void insertMultipleForms (List<Forms> formsList);
    @Query("SELECT * FROM Forms WHERE formId = :formId")
    Forms fetchOneFormbyFormId (int formId);
    @Update
    void updateForm(Forms forms);
    @Delete
    void deleteForm(Forms forms);
}
