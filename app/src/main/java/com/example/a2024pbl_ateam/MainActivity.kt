package com.example.a2024pbl_ateam

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btLogin: Button
    private lateinit var btSubscribe: Button
    private lateinit var tvLabelInput: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find views by ID
        btLogin = findViewById(R.id.btLogin)
        btSubscribe = findViewById(R.id.btSubscribe)
        tvLabelInput = findViewById(R.id.tvLabelInput)

        // Set click listeners for buttons
        btLogin.setOnClickListener {
            // Handle login button click
            tvLabelInput.text = "Login clicked"
        }

        btSubscribe.setOnClickListener {
            // Handle subscribe button click
            tvLabelInput.text = "Subscribe clicked"
        }
    }
}