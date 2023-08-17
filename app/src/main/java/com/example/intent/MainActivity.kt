package com.example.intent

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openSecondActivityTextClick(view: View) {
        val intent = Intent(this@MainActivity, MainActivity2::class.java)
        startActivity(intent)
    }
}