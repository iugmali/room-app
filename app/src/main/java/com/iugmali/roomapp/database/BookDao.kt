package com.iugmali.roomapp.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface BookDao {
    @Query("SELECT * FROM book")
    fun getBooks() : List<Book>

    @Insert
    fun insertBook(book: Book)
}