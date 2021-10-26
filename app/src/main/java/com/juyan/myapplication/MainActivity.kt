package com.juyan.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider


/**
 * ViewModel 使用
 */
class MainActivity : AppCompatActivity(),View.OnClickListener{

    private lateinit var textview:TextView
    private lateinit var button: Button
    lateinit var viewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button=findViewById(R.id.button)
        textview=findViewById(R.id.tv_view)
        button.setOnClickListener(this)
        viewModel=ViewModelProvider(this).get(MyViewModel::class.java)
        textview.text=viewModel.num.toString()
    }

    override fun onClick(v: View?) {
       when(v?.id){

           R.id.button->{

               var num=viewModel.num
               num++
               textview.text=num.toString()
               viewModel.num=num;
           }
       }
    }
}