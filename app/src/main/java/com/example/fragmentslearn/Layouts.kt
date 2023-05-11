package com.example.fragmentslearn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
//import androidx.fragment.app.Fragment
//import androidx.databinding.DataBindingUtil
//import com.example.fragmentslearn.databinding.ActivityLayoutBinding


class Layouts : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layouts)
     val myLoadConstraint = findViewById<Button>(R.id.constraint)
     val myLoadTable= findViewById<Button>(R.id.table)
     myLoadConstraint.setOnClickListener {
         startActivity(Intent(this,ConstraintLayout::class.java))
     }
     myLoadTable.setOnClickListener {
         startActivity(Intent(this,TableLayout::class.java))
     }


    }
}