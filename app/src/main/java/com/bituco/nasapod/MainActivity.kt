package com.bituco.nasapod

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nasaLogo = findViewById<ImageView>(R.id.nasaLogo)
        nasaLogo.setOnClickListener { apodActivity() }

        val githubLogo = findViewById<ImageView>(R.id.githubLogo)
        githubLogo.setOnClickListener { openGithub() }
    }

    private fun openGithub() {
        /*"Open github on web browser"*/
    }

    private fun apodActivity() {
        /*"Call the get and the next activity"*/
    }
}