package com.iugmali.roomapp.ui

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.iugmali.roomapp.R
import com.iugmali.roomapp.adapters.BookListAdapter
import com.iugmali.roomapp.database.MyDb

class ListBookActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_book)

        val books = MyDb.getInstance(this).bookDao().getBooks()
        val bookListView : RecyclerView = findViewById(R.id.rvBookList)

        bookListView.adapter = BookListAdapter(books)
        bookListView.layoutManager = LinearLayoutManager(this)
    }
}