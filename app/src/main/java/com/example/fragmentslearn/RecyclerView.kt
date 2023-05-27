package com.example.fragmentslearn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.fragmentslearn.databinding.ActivityRecyclerViewBinding

class RecyclerView : AppCompatActivity() {
    private lateinit var binding : ActivityRecyclerViewBinding
    private  lateinit var  rvAdapter: RvAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        rvAdapter = RvAdapter(Constant.getData(),this)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
     //  binding.recyclerView.layoutManager = GridLayoutManager(this,3)
     // binding.recyclerView.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        //binding.recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerView.adapter = rvAdapter

    }
}