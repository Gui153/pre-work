package com.example.world2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val but = findViewById<Button>(R.id.clickmeb)
        but.setOnClickListener{
            Log.v("Hi from Gui","Clicked!")
            Toast.makeText(this, "Hello from Guilherme and Honey", Toast.LENGTH_SHORT).show()
        }

    }
}