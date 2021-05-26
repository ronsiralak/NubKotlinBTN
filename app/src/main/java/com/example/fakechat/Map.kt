package com.example.fakechat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.collections.Map

class Map : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.map)
        val txthello : TextView = findViewById(R.id.map)
        txthello.setText("this is map")
        val BTNmapFood : Button = findViewById(R.id.buttonMapFood)
        BTNmapFood.setOnClickListener{
            val intent = Intent(this, Map_food :: class.java)
            startActivity(intent)
        }
        val BTNmapShop : Button = findViewById(R.id.buttonMapShop)
        BTNmapShop.setOnClickListener{
            val intent = Intent(this, Map_shop :: class.java)
            startActivity(intent)
        }
        val BTNmapMovie : Button = findViewById(R.id.buttonMapMovie)
        BTNmapMovie.setOnClickListener{
            val intent = Intent(this, Map_movie :: class.java)
            startActivity(intent)
        }
    }

}