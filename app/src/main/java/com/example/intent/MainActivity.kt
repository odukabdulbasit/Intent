package com.example.intent

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the button in your main activity layout
        // Find the button in your main activity layout
        findViewById<View>(R.id.btnOpenSecondActivity).setOnClickListener {
            openSecondActivityTextClick(it)
        }
    }

    fun openSecondActivityTextClick(view: View) {
        // Create an intent to open the new activity
        val intent = Intent(this@MainActivity, MainActivity2::class.java)
        startActivity(intent)
    }
}