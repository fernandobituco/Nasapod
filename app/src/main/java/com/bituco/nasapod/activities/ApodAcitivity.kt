package com.bituco.nasapod.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import com.bituco.nasapod.R
import com.bituco.nasapod.interfaces.ApodInstance
import com.bituco.nasapod.models.ApodModel
import com.bumptech.glide.Glide

class ApodAcitivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apod_acitivity)

        var apod : ApodModel? = null
        val title = findViewById<TextView>(R.id.imageTitle)
        val image = findViewById<ImageView>(R.id.apodImage)
        val description = findViewById<TextView>(R.id.description)

        val key = "40WMIJvYh87RFLNgGSfAaxPiWqWbmi5oRS2gjLOX"
        lifecycleScope.launchWhenCreated {
            apod = ApodInstance.api.getApod(key).body()
            title.text = apod!!.title
            description.text = apod!!.explanation
            Glide.with(this@ApodAcitivity).load(apod!!.url).into(image)
        }
    }
}