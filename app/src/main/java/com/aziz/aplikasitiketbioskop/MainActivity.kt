package com.aziz.aplikasitiketbioskop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var flm1: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        flm1 = findViewById(R.id.flm1)

        val data = mutableListOf<Films>(
            Films(getString(R.string.namajudul1), getString(R.string.desk1), getString(R.string.pmrn1), getString(R.string.rls1), getString(R.string.stdr1), getString(R.string.genre1), getString(R.string.durasi1), R.drawable.photo1),
            Films(getString(R.string.namajudul2), getString(R.string.desk2), getString(R.string.pmrn2), getString(R.string.rls2), getString(R.string.stdr2), getString(R.string.genre2), getString(R.string.durasi2), R.drawable.photo2),
            Films(getString(R.string.namajudul3), getString(R.string.desk3), getString(R.string.pmrn3), getString(R.string.rls3), getString(R.string.stdr3), getString(R.string.genre3), getString(R.string.durasi3), R.drawable.photo3),
            Films(getString(R.string.namajudul4), getString(R.string.desk4), getString(R.string.pmrn4), getString(R.string.rls4), getString(R.string.stdr4), getString(R.string.genre4), getString(R.string.durasi4), R.drawable.photo4),
            Films(getString(R.string.namajudul5), getString(R.string.desk5), getString(R.string.pmrn5), getString(R.string.rls5), getString(R.string.stdr5), getString(R.string.genre5), getString(R.string.durasi5), R.drawable.photo5),
            Films(getString(R.string.namajudul6), getString(R.string.desk6), getString(R.string.pmrn6), getString(R.string.rls6), getString(R.string.stdr6), getString(R.string.genre6), getString(R.string.durasi6), R.drawable.photo6),
            Films(getString(R.string.namajudul7), getString(R.string.desk7), getString(R.string.pmrn7), getString(R.string.rls7), getString(R.string.stdr7), getString(R.string.genre7), getString(R.string.durasi7), R.drawable.photo7),
            Films(getString(R.string.namajudul8), getString(R.string.desk8), getString(R.string.pmrn8), getString(R.string.rls8), getString(R.string.stdr8), getString(R.string.genre8), getString(R.string.durasi8), R.drawable.photo8),
            Films(getString(R.string.namajudul9), getString(R.string.desk9), getString(R.string.pmrn9), getString(R.string.rls9), getString(R.string.stdr9), getString(R.string.genre9), getString(R.string.durasi9), R.drawable.photo9),
            Films(getString(R.string.namajudul10), getString(R.string.desk10), getString(R.string.pmrn10), getString(R.string.rls10), getString(R.string.stdr10), getString(R.string.genre10), getString(R.string.durasi10), R.drawable.photo10),
        )
        val adapter = FilmAdapter(data) { myData ->
            Intent(this, FilmPilihan::class.java).apply {
                putExtra("film", myData)
                startActivity(this)
            }
        }

        flm1?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        flm1?.adapter = adapter
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_list -> {
                flm1?.layoutManager = LinearLayoutManager(this)
            }
            R.id.action_grid -> {
                flm1?.layoutManager = GridLayoutManager(this, 2)
            }
            R.id.about_page -> {
                val intent = Intent(this, AboutActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}