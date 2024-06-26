package com.project.xmltestlayout

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// email
        val emailName: TextView = findViewById(R.id.email)
        emailName.setOnClickListener {
            Toast.makeText(this, "Email", Toast.LENGTH_SHORT).show()
        }

// phone
        val phoneName: TextView = findViewById(R.id.phone)
        phoneName.setOnClickListener {
            Toast.makeText(this, "Phone", Toast.LENGTH_SHORT).show()
        }
    }
}