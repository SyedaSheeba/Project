package com.example.roomdatabaseapp;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface MyDao {

    @Insert
    public void insert(Book book);

    @Query("select * from Book")
    public List<Book> retrieve();
}
