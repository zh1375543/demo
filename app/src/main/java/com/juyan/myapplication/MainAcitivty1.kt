package com.juyan.myapplication

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainAcitivty1:AppCompatActivity() {

    /**
     * viewmodel 在fragment中实现 数据共享
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)
    }
}