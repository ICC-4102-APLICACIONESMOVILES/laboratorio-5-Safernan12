package com.example.santiago.lab3;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;


@Database(entities = {Forms.class}, version = 1, exportSchema = false)
public abstract class FormsDatabase extends RoomDatabase {
    public abstract DaoForms daoAccess();
}
