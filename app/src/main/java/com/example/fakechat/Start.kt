package com.example.fakechat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Start : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start)
        val BTNmap : Button = findViewById(R.id.buttonMap)
        BTNmap.setOnClickListener{
            val intent = Intent(this, Map :: class.java)
            startActivity(intent)
        }
        val BTNpro : Button = findViewById(R.id.buttonPro)
        BTNpro.setOnClickListener{
            val intent = Intent(this, Pro :: class.java)
            startActivity(intent)
        }
    }
}