package com.wanderlog.agencies

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class managePackageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_manage_package)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val ivGoBackManagePackage = findViewById<ImageView>(R.id.imageView)
        ivGoBackManagePackage.setOnClickListener {
            finish()
        }
        val ivGoViewSales = findViewById<ImageView>(R.id.ivViewSales)
        ivGoViewSales.setOnClickListener {
            val intent = Intent(this, viewSalesActivity::class.java)
            startActivity(intent)
        }
    }
}