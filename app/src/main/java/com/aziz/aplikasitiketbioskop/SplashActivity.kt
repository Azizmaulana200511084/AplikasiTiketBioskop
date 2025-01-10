package com.aziz.aplikasitiketbioskop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val animZoomOut = AnimationUtils.loadAnimation(this, R.anim.zoom_out)
        val logoImageView = findViewById<ImageView>(R.id.logo)
        logoImageView.startAnimation(animZoomOut)

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 3000)
    }
}
