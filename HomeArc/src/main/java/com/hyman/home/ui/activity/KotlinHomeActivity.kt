package com.hyman.home.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hyman.home.R
import kotlinx.android.synthetic.main.kotlin_home.*

class KotlinHomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kotlin_home)
        dealInit()
    }

    private fun dealInit() {
        bt1.setOnClickListener {
            StandardFunctionAc.startMe(this)
        }

        bt2.setOnClickListener {
            ExerciseKotlinAc.startMe(this)
        }

        bt3.setOnClickListener{
            ListRecActivity.startMe(this)
        }

        bt4.setOnClickListener{

        }
    }

    companion object {
        @JvmStatic
        fun startMe(context: AppCompatActivity) {
            val intent = Intent(context, KotlinHomeActivity::class.java)
            context.startActivity(intent)
        }
    }
}