package com.hyman.home.util

import android.content.Context

/**
 *@author: Hyman
 *time: 2021/1/29 下午7:22
 *des:
 */
object SpUtil {

    //Koltin原生写法
    fun putValue(context: Context){
       val  sp=context.getSharedPreferences("test",Context.MODE_PRIVATE)
        sp.edit().apply {
            putString("name","Hyman")
            putInt("age",29)
            apply()
        }
    }

    fun getString(context: Context,key:String):String?{
        val  sp=context.getSharedPreferences("test",Context.MODE_PRIVATE);
       return sp.getString(key,"")
    }

}