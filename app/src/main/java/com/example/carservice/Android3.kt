package com.example.carservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Android3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android3)
    }

    fun bnt3(view: View) {
        val intent = Intent(this, reg::class.java)
        startActivity(intent)
    }
}