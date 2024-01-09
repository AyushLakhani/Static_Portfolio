package com.example.application1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val skillsB = findViewById<Button>(R.id.button1)

        skillsB.setOnClickListener {
            intent = Intent(this, Skills::class.java)
            startActivity(intent)
        }

        val educationB = findViewById<Button>(R.id.button2)

        educationB.setOnClickListener {
            intent = Intent(this, Education::class.java)
            startActivity(intent)
        }

        val workB = findViewById<Button>(R.id.button3)

        workB.setOnClickListener {
            intent = Intent(this, Work::class.java)
            startActivity(intent)
        }

        val achivementsB = findViewById<Button>(R.id.button4)

        achivementsB.setOnClickListener {
            intent = Intent(this, Achivements::class.java)
            startActivity(intent)
        }
    }
}