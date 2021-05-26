package com.example.fakechat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Pro_food : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pro_food)
        val txthello : TextView = findViewById(R.id.pro_food)
        txthello.setText("this is pro food")
    }
}