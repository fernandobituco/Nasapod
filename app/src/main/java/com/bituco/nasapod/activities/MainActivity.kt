package com.bituco.nasapod.activities

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.lifecycle.lifecycleScope
import com.bituco.nasapod.R
import com.bituco.nasapod.interfaces.ApodInstance

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nasaLogo = findViewById<ImageView>(R.id.nasaLogo)
        nasaLogo.setOnClickListener { startActivity(Intent(this, ApodAcitivity::class.java)) }

        val githubLogo = findViewById<ImageView>(R.id.githubLogo)
        githubLogo.setOnClickListener { openGithub("https://github.com/fernandobituco") }
    }

    private fun openGithub(url : String) {
        val webpage: Uri = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, webpage)
        startActivity(intent)
    }
}