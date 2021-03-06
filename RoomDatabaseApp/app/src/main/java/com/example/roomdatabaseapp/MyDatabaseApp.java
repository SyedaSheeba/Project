package com.example.roomdatabaseapp;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = Book.class,version = 1)
public abstract class MyDatabaseApp extends RoomDatabase {
    public abstract MyDao myDao();
}
