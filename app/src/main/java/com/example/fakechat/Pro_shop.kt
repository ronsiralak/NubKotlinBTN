package com.example.fakechat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Pro_shop : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pro_shop)
        val txthello : TextView = findViewById(R.id.pro_shop)
        txthello.setText("this is pro shop")
    }
}