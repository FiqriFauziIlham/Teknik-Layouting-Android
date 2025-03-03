package com.example.tekniklayoutfiqrifauziilham

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Log.d("SplashActivity", "Splash screen started") // Log untuk cek

        Handler(Looper.getMainLooper()).postDelayed({
            Log.d("SplashActivity", "Navigating to LoginActivity") // Log untuk cek
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000) // Splash screen tampil selama 2 detik
    }
}