package com.example.fakechat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Pro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pro)
        val txthello : TextView = findViewById(R.id.pro)
        txthello.setText("this is pro")
        val BTNproFood : Button = findViewById(R.id.buttonProFood)
        BTNproFood.setOnClickListener{
            val intent = Intent(this, Pro_food :: class.java)
            startActivity(intent)
        }
        val BTNproShop : Button = findViewById(R.id.buttonProShop)
        BTNproShop.setOnClickListener{
            val intent = Intent(this, Pro_shop :: class.java)
            startActivity(intent)
        }
        val BTNproMovie : Button = findViewById(R.id.buttonProMovie)
        BTNproMovie.setOnClickListener{
            val intent = Intent(this, Pro_movie :: class.java)
            startActivity(intent)
        }
    }
}