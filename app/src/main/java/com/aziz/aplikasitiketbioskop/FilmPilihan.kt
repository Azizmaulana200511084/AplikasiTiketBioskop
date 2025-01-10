package com.aziz.aplikasitiketbioskop

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FilmPilihan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.film_pilihan)

        supportActionBar?.hide()

        val films = intent.getParcelableExtra<Films>("film")
        val image = findViewById<ImageView>(R.id.pto1)
        val title = findViewById<TextView>(R.id.namea1)
        val durasi = findViewById<TextView>(R.id.durasi)
        val descripsi = findViewById<TextView>(R.id.descripsi)
        val pemeran = findViewById<TextView>(R.id.pmr)
        val release = findViewById<TextView>(R.id.rls)
        val sutradara = findViewById<TextView>(R.id.sdr)
        val genre = findViewById<TextView>(R.id.gnr)

        title.text = films?.nama.toString()
        durasi.text = films?.durasi.toString()
        descripsi.text = films?.desCripsi.toString()
        pemeran.text = films?.pemeran.toString()
        release.text = films?.releas.toString()
        sutradara.text = films?.sutradara.toString()
        genre.text = films?.genr.toString()
        image.setImageResource(films?.img!!)

        val shareButton = findViewById<Button>(R.id.action_share)
        shareButton.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            val shareMessage = "Ayoo nonton film : " + getContentTitle()
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage)
            startActivity(Intent.createChooser(shareIntent, "Share via"))
        }
    }

    private fun getContentTitle(): CharSequence? {
        val textView1 = findViewById<TextView>(R.id.namea1)
        val textView2 = findViewById<TextView>(R.id.durasi)
        return textView1.text.toString() + " " + "Berdurasi :" + textView2.text.toString() + " "  +"Di bioskop Kesayangan Anda !!!!"
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}