package com.juyan.myapplication;


import android.os.Build;

import androidx.annotation.RequiresApi;

import java.io.IOException;


/**
 * on 2021/10/19
 *
 * @Author zhanghui
 * @Description
 */
public class Base64 {
    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String encodeToString(byte[] input) {
        return java.util.Base64.getEncoder().encodeToString(input);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static byte[] decode(String str) {
        return java.util.Base64.getDecoder().decode(str);
    }
}
