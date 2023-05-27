package com.example.fragmentslearn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.databinding.DataBindingUtil
import androidx.activity.result.contract.ActivityResultContracts
import com.example.fragmentslearn.databinding.ActivityLayoutsBinding


//import androidx.fragment.app.Fragment
//import androidx.databinding.DataBindingUtil
//import com.example.fragmentslearn.databinding.ActivityLayoutBinding


class Layouts : AppCompatActivity() {
    private lateinit var binding : ActivityLayoutsBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityLayoutsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Toast.makeText(this,"${intent.getStringExtra("name")}",Toast.LENGTH_SHORT).show()
     binding.constraint.setOnClickListener {
         startActivity(Intent(this,ConstraintLayout::class.java))
     }
     binding.table.setOnClickListener {
         startActivity(Intent(this,TableLayout::class.java))
     }
     binding.storage.setOnClickListener {
         onButtonClick()
     }


    }
    private fun onButtonClick (){
        when {
            checkSelfPermission(PERMISSION) == PackageManager.PERMISSION_GRANTED ->
            {
                Toast.makeText(this,"Tera kam hugya",Toast.LENGTH_SHORT).show()
            }
            shouldShowRequestPermissionRationale(PERMISSION) -> {
                Toast.makeText(this," Beta tu chutti kr ab ",Toast.LENGTH_SHORT).show()
            }
            else -> {
            requestPermissionLauncher.launch(PERMISSION)
            }

        }
    }

    private val requestPermissionLauncher : ActivityResultLauncher<String> =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) {
            if(it){
                Toast.makeText(this,"Granted!!",Toast.LENGTH_SHORT).show()
            }
            else
                Toast.makeText(this,"Not Granted!!",Toast.LENGTH_SHORT).show()
        }
    companion object {
        private val PERMISSION = "android.permission.READ_EXTERNAL_STORAGE"
        private const val ACTION = Intent.ACTION_OPEN_DOCUMENT_TREE
        private val uri = Uri.parse("file:///data/data/com.example.fragmentslearn/files/myfile.txt")


    }
}