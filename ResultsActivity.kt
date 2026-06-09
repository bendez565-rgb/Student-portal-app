package com.example.studentportal

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        val resultsText = findViewById<TextView>(R.id.resultsText)

        val math = 78
        val english = 82
        val ict = 90
        val science = 75

        val total = math + english + ict + science
        val average = total / 4

        val grade = when (average) {
            in 80..100 -> "A"
            in 70..79 -> "B"
            in 60..69 -> "C"
            in 50..59 -> "D"
            else -> "F"
        }

        resultsText.text = """
            STUDENT RESULTS

            Math: $math%
            English: $english%
            ICT: $ict%
            Science: $science%

            ----------------------

            Total: $total
            Average: $average
            Grade: $grade
        """.trimIndent()
    }
}