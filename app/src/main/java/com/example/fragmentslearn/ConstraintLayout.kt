package com.example.fragmentslearn

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class ConstraintLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_layout)
    }
    fun loadMenu(view : View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}