package com.example.fakechat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Map_shop : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.map_shop)
        val txthello : TextView = findViewById(R.id.map_shop)
        txthello.setText("this is map shop")
    }
}