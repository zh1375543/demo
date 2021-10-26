package com.juyan.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import com.juyan.myapplication.livedate.LDViewModel


/**
 * livedate 使用
 */
class MainActivity2 : AppCompatActivity(),View.OnClickListener{

    private lateinit var textview:TextView
    private lateinit var button: Button

    private val model:LDViewModel by viewModels<LDViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        button=findViewById(R.id.button)
        textview=findViewById(R.id.tv_view)
        button.setOnClickListener(this)

         model.nameld.observe(this){

             textview.text=it;
         }
    }

    override fun onClick(v: View?) {
       when(v?.id){

           R.id.button->{
               val change=(0..100).random();
                var  str="我的金额是 $change"

               model.updateName(str)

           }
       }
    }
}