package com.example.illickwelsapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val user = intent.getStringExtra("user")

        val txtWelcome = findViewById<TextView>(R.id.txtWelcome)
        val btnProfile = findViewById<Button>(R.id.btnProfile)
        val btnResults = findViewById<Button>(R.id.btnResults)

        txtWelcome.text = "Welcome $user"

        btnProfile.setOnClickListener {
            val i = Intent(this, ProfileActivity::class.java)
            i.putExtra("user", user)
            startActivity(i)
        }

        btnResults.setOnClickListener {
            val i = Intent(this, ResultsActivity::class.java)
            i.putExtra("user", user)
            startActivity(i)
        }
    }
}