package com.example.campsitecommander

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAddGear= findViewById<Button>(R.id.button)
        val txtOutput= findViewById<TextView>(R.id.textView)

        btnAddGear.setOnClickListener {
            txtOutput.text = "Tent added to camping gear list!"
        }

    }
}