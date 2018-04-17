package com.example.santiago.lab3;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface DaoUsers {
    @Insert
    void insertOnlySingleUser (Users user);
    @Insert
    void insertMultipleUsers (List<Users> usersList);
    @Query("SELECT * FROM Users WHERE userId = :userId")
    Users fetchOneUserbyUserId (int userId);
    @Update
    void updateUser(Users users);
    @Delete
    void deleteForm(Users users);
}
