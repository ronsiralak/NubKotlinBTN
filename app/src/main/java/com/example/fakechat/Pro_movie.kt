package com.example.fakechat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Pro_movie : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pro_movie)
        val txthello : TextView = findViewById(R.id.pro_movie)
        txthello.setText("this is pro movie")
    }
}