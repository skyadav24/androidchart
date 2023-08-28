package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)


        val open = findViewById<Button>(R.id.button14)
        open.setOnClickListener {
            var intent = Intent(this@Signup,MainActivity::class.java)
            startActivity(intent)
        }
    }
}