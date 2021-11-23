package com.example.carservice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent as Intent

class Android1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android1)
    }

    fun btn1(view: View) {
        val intent = Intent(this, Android2::class.java)
        startActivity(intent)
    }
}