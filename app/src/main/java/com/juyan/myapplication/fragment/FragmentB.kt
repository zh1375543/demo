package com.juyan.myapplication.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import com.juyan.myapplication.MyViewModel
import com.juyan.myapplication.R

class FragmentB:Fragment() {
    private lateinit var tvContent: TextView
    private val model: MyViewModel by activityViewModels()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view=LayoutInflater.from(requireContext()).inflate(R.layout.fragment_b,container,false)

        tvContent=view.findViewById(R.id.tv_2)
        model.count.observe(viewLifecycleOwner){
            Log.e("TAG",it.toString())
            tvContent.text=it.toString()
        }
        return view
    }
}