package com.aziz.aplikasitiketbioskop

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FilmViewHolder (private val v: View) : RecyclerView.ViewHolder(v) {
    private val image: ImageView = v.findViewById(R.id.image)
    private val nama: TextView = v.findViewById(R.id.nama)
    private val desCripsi: TextView = v.findViewById(R.id.descripsi)

    fun onBind(data: Films) {
        this.nama.text = data.nama.toString()
        this.desCripsi.text = data.desCripsi.toString()
        this.image.setImageResource(data.img)
    }
}