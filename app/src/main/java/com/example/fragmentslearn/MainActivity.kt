package com.example.fragmentslearn

import android.content.Intent
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.fragmentslearn.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private val my = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(my,"onCreate")
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
             replaceFrag(BlankFragment())
        }
        binding.button4.setOnClickListener {
            replaceFrag(BlankFragment2())
        }
        binding.talha.setOnClickListener {
            startActivity(Intent(this,Layouts::class.java))
        }
        binding.loadCards.setOnClickListener {
            startActivity(Intent(this,CardViewer::class.java))
        }


    }

    private fun replaceFrag(fragment : Fragment) {
       val trans = supportFragmentManager.beginTransaction()
        trans.replace(R.id.fragment_container,fragment)
        trans.commit()

    }

    override fun onStart() {
        super.onStart()
        Log.i(my,"onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.i(my,"onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.i(my, "onPause")
    }
    override fun onStop() {
         super.onStop()
        Log.i(my, "onStop")
        }
    override  fun onDestroy(){
        super.onDestroy()
        Log.i(my,"onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(my,"onRestart")
    }
}