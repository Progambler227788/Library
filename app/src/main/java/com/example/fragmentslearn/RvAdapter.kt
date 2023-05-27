package com.example.fragmentslearn

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import android.content.Context
import android.view.animation.AlphaAnimation
import  androidx.recyclerview.widget.RecyclerView
import com.example.fragmentslearn.databinding.RvItemsBinding

class RvAdapter(var dataList : ArrayList<RvModel>,var context : Context) : RecyclerView.Adapter<RvAdapter.MyViewHolder> () {

    inner class MyViewHolder(var binding : RvItemsBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = RvItemsBinding.inflate(LayoutInflater.from(context),parent,false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
      anim(holder.itemView)
      holder.binding.batpic.setImageResource(dataList.get(position).Profile)
      holder.binding.name.text =  dataList.get(position).bat
      holder.binding.description.text =  dataList.get(position).description
    }
    fun anim (view : View){
        var animation = AlphaAnimation(0.0f,1.0f)
        animation.duration = 3000
        view.startAnimation(animation)
    }
}