package com.example.tekniklayoutfiqrifauziilham

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnClose = findViewById<Button>(R.id.btn_keluar)
        val btnOpenCalculator = findViewById<Button>(R.id.btn_open_calculator)
        val btnOpenNote = findViewById<Button>(R.id.btn_open_note)

        btnClose.setOnClickListener {
            finish()
        }

        btnOpenCalculator.setOnClickListener {
            try {
                val intent = Intent(this, CalculatorActivity::class.java)
                startActivity(intent)
            } catch (e: Exception) {
                Log.e("MainActivity", "Error opening CalculatorActivity", e)
            }
        }

        btnOpenNote.setOnClickListener {
            try {
                val intent = Intent(this, NoteActivity::class.java)
                startActivity(intent)
            } catch (e: Exception) {
                Log.e("MainActivity", "Error opening NoteActivity", e)
            }
        }
    }
}
