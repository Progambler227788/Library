package com.example.fragmentslearn

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup




class BlankFragment2 : Fragment() {



    private val my = "Fragment number 2"

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i(my,"onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(my,"onCreate")
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.i(my,"onCreateView")
        return inflater.inflate(R.layout.fragment_blank2, container, false)
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