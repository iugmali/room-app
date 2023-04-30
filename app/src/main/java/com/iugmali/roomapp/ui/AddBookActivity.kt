package com.iugmali.roomapp.ui

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.iugmali.roomapp.R
import com.iugmali.roomapp.database.Book
import com.iugmali.roomapp.database.MyDb

class AddBookActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_book)

        val etNome = findViewById<EditText>(R.id.etNome)
        val etPaginas = findViewById<EditText>(R.id.etPaginas)

        findViewById<Button>(R.id.btnSalvar).setOnClickListener {
            MyDb.getInstance(this).bookDao().insertBook(
                Book(
                    name = etNome.text.toString(),
                    pageCount = etPaginas.text.toString().toInt())
            )
            val intent = Intent(this@AddBookActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}