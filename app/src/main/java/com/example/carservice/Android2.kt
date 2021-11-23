package com.example.carservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Android2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android2)
    }

    fun btn2(view: View) {
        val intent = Intent(this, Android3::class.java)
        startActivity(intent)
    }
}