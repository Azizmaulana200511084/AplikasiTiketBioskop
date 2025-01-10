package com.aziz.aplikasitiketbioskop

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class FilmAdapter (
    private val data: MutableList<Films>,
    private val listener: (Films) -> Unit
) : RecyclerView.Adapter<FilmViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder =
        FilmViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.daftar_film, parent, false)
        )

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        holder.onBind(data[position])
        holder.itemView.setOnClickListener {
            listener(data[position])
        }
    }
    override fun getItemCount(): Int = data.size
}