package com.example.carservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class reg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)
    }

    fun login(view: View) {
        val intent = Intent(this@reg, Menu1::class.java)
        startActivity(intent)
    }


}