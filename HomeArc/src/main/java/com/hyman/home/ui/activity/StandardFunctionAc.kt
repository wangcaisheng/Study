package com.hyman.home.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hyman.home.R
import kotlinx.android.synthetic.main.ac_standar_fun.*
import java.lang.StringBuilder

class StandardFunctionAc : AppCompatActivity() {

    private val list= listOf("apple","Banana","Orange","Pear")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ac_standar_fun);

        dealClick()
    }

    private fun dealClick() {
        bt_origin.setOnClickListener{
            //原始方法
            originFun()
        }

        bt_with.setOnClickListener {
            withFun()
        }
    }

    private fun withFun() {
       val builder=StringBuilder()
       val result= with(builder){
            append("开始遍历集合")
            append("with函数拼接字符串")
            for (fruit in list){
                append(fruit)
            }
            builder.append("集合遍历完毕")
            toString()
        }
        tv1.text=result;
    }

    //遍历字符集合，拼接字符串
    private fun originFun() {
        val builder=StringBuilder() //调用java类
        builder.append("开始遍历集合")
        for (fruit in list){
            builder.append(fruit).append("\n")
        }
        builder.append("集合遍历完毕")
        val result=builder.toString()
        tv1.text = result

    }

    companion object{
        @JvmStatic
        fun startMe(context: AppCompatActivity) {
            val intent= Intent(context,StandardFunctionAc::class.java)
            context.startActivity(intent)
        }
    }
}