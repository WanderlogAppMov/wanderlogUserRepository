package com.wanderlog.agencies

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val imageView12: ImageView = findViewById(R.id.imageView12)
        imageView12.setOnClickListener {
            val intent = Intent(this, HotelsEditorActivity::class.java)
            startActivity(intent)
        }
        val imageView13: ImageView = findViewById(R.id.imageView13)
        imageView13.setOnClickListener {
            val intent = Intent(this, FlightsEditorActivity::class.java)
            startActivity(intent)
        }
        val imageView14: ImageView = findViewById(R.id.imageView14)
        imageView14.setOnClickListener {
            val intent = Intent(this, RestaurantsEditorActivity::class.java)
            startActivity(intent)
        }
        val imageView10: ImageView = findViewById(R.id.imageView10)
        imageView10.setOnClickListener {
            val intent = Intent(this, AttractionsEditorActivity::class.java)
            startActivity(intent)
        }
        val imageView3: ImageView = findViewById(R.id.imageView3)
        imageView3.setOnClickListener {
            val intent = Intent(this, BookingCommunicationActivity::class.java)
            startActivity(intent)
        }
    }
}