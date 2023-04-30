package com.iugmali.roomapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.iugmali.roomapp.R
import com.iugmali.roomapp.database.Book

class BookListAdapter (
    val booksList: List<Book>
    ) : RecyclerView.Adapter<BookListAdapter.BookViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(
                R.layout.item_book,
                parent,
                false
            )
            return BookViewHolder(view)
        }

        override fun getItemCount(): Int = booksList.count()

        override fun onBindViewHolder(viewHolder: BookViewHolder, position: Int) {
            viewHolder.bind(booksList[position])
        }

        inner class BookViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            private val tvName : TextView = view.findViewById(R.id.tvName)
            private val tvPages : TextView = view.findViewById(R.id.tvPages)

            fun bind(book: Book) {
                tvName.text = book.name
                tvPages.text = "${book.pageCount} páginas"
            }
        }
}
