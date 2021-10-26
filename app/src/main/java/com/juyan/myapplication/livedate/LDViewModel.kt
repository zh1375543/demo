package com.juyan.myapplication.livedate

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LDViewModel:ViewModel() {

    val nameld:MutableLiveData<String> by lazy { MutableLiveData<String>() }

    fun updateName(name:String){
        nameld.value=name
    }

    //在线程用更新值，用这个方法
    fun postupdateNameThread(name:String){
        nameld.postValue(name)
    }
}