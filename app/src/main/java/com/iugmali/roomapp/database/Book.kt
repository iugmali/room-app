package com.iugmali.roomapp.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Book(
    @PrimaryKey(autoGenerate = true) val id : Int? = null,
    @ColumnInfo(name = "name") val name : String,
    @ColumnInfo(name = "page_count") val pageCount : Int
)

