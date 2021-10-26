package com.juyan.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.juyan.myapplication.databinding.ActivityMain3Binding
import com.juyan.myapplication.livedate.LDViewModel
import com.juyan.myapplication.livedate.User


/**
 * datebinding 使用 需要吧compileSdkVersion 和targetSdkVersion 改成 30
 */
class MainActivity3 : AppCompatActivity(){



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        //获取databing 对象的方式1
//        val binding=ActivityMain3Binding.inflate(layoutInflater)

        //方式2
        val binding =DataBindingUtil.setContentView<ActivityMain3Binding>(this,R.layout.activity_main3)
        binding.name="张三"
        binding.age=12

        val user=User("李四",12)
        binding.user=user

        val list= listOf(0,1,3)
        val map= mapOf(0 to "你好",1 to "大家熬好")
        binding.list=list
    }

}