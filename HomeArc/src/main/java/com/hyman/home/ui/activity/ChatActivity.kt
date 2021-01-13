package com.hyman.home.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hyman.home.R

/**
 *@author: Hyman
 *time: 2021/1/13 下午8:45
 *des:
 */
class ChatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)
        //recycleView有两种条目类型，一种展示好友的消息，一种展示我回复的消息

    }
}