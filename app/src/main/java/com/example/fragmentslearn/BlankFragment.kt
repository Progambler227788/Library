package com.example.fragmentslearn

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.widget.*
import android.view.ViewGroup



class BlankFragment : Fragment() {

    private val my = "Fragment number 1"
    private lateinit var Adapter : ArrayAdapter<String>
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i(my,"onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(my,"onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i(my,"onCreateView")
        val view = inflater.inflate(R.layout.fragment_blank,container,false)
        val myListView = view.findViewById<ListView>(R.id.listView)
        val myData = arrayOf("Talha","Haroon","Farman","Arslan","Noman","Ismail","Jonny Bai","Hadia","Janam")
        Adapter = ArrayAdapter(activity as Context,android.R.layout.simple_selectable_list_item,myData)
        myListView.adapter = Adapter
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.i(my,"onViewCreated")
        super.onViewCreated(view, savedInstanceState)

    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.i(my,"onActivityCreated")
        super.onActivityCreated(savedInstanceState)
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
        Log.i(my,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(my,"onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i(my,"onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(my,"onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i(my,"onDetach")
    }

}