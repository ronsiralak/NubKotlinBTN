package com.example.fakechat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Map_food : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.map_food)
        val txthello : TextView = findViewById(R.id.map_food)
        txthello.setText("this is map food")
    }
}