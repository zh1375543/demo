package com.juyan.myapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel:ViewModel() {

    var num:Int=0

     val count = MutableLiveData<Int>(0)


    fun add(n:Int){
        count.value=n;
    }

}