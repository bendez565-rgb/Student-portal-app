package com.example.illickwelsapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val user = intent.getStringExtra("user")

        val txt = findViewById<TextView>(R.id.txtProfile)
        txt.text = "Profile of: $user\n\nEmail: $user@gmail.com\nRole: Student/Admin"
    }
}