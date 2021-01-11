package com.hyman.home.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hyman.home.R
import com.hyman.home.ui.activity.KotlinHomeActivity.Companion.startMe
import kotlinx.android.synthetic.main.kotlin_home.*

class KotlinHomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kotlin_home)
        dealInit()
    }

    private fun dealInit() {
       bt1.setOnClickListener{
           StandardFunctionAc.startMe(this)
       }

        bt2.setOnClickListener {
          ExerciseKotlinAc.startMe(this)
        }
    }

    companion object {
        @JvmStatic
        fun startMe(context: AppCompatActivity) {
            val intent=Intent(context,KotlinHomeActivity::class.java)
            context.startActivity(intent)
        }
    }
}