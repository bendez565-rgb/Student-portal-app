package com.example.studentportal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val resultsBtn = findViewById<Button>(R.id.resultsBtn)

        resultsBtn.setOnClickListener {
            startActivity(Intent(this, ResultsActivity::class.java))
        }
    }
}