package com.hyman.home

import android.app.Application
import android.content.Context

/**
 *@author: Hyman
 *time: 2021/1/29 下午7:43
 *des:
 */
class HomeBaseApplication : Application() {

    companion object{
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context=applicationContext
    }
}