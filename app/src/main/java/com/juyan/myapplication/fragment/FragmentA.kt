package com.juyan.myapplication.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import com.juyan.myapplication.MyViewModel
import com.juyan.myapplication.R

class FragmentA:Fragment(),View.OnClickListener {

    private lateinit var tvContent:TextView
    private lateinit var  btnAdd:Button
    private val viewModel: MyViewModel by activityViewModels()
    private   var  n=0;
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view=LayoutInflater.from(requireContext()).inflate(R.layout.fragment_a,container,false)

        tvContent=view.findViewById(R.id.tv_1)
        btnAdd=view.findViewById(R.id.btn_add)
        btnAdd.setOnClickListener(this)

        tvContent.text=viewModel.count.value.toString()
        return view
    }

    override fun onClick(v: View?) {
        when(v?.id){

            R.id.btn_add->{
                n++
                viewModel.count.value=n
                tvContent.text=n.toString()
            }
        }
    }
}