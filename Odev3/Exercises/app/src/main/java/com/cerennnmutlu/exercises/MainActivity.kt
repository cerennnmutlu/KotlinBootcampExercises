package com.cerennnmutlu.exercises

import android.os.Bundle
import android.widget.Button
import android.widget.Toast

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.addToCartBtn).setOnClickListener {
            Toast.makeText(this, getString(R.string.add_to_cart), Toast.LENGTH_SHORT).show()
        }
    }
}