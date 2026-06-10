package com.example.illickwelsapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        val user = intent.getStringExtra("user")

        val txt = findViewById<TextView>(R.id.txtResults)
        txt.text = "Results for: $user\n\nMath: 75\nEnglish: 80\nICT: 88"
    }
}