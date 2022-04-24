package com.hyman.home.ui.activity

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.method.LinkMovementMethod
import android.text.style.*
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.hyman.home.R

class SpannableStringAct : AppCompatActivity() {

    private val list = listOf("我参加工作时间", "2015.7", "至2019.8", "获得工资300万")

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_spannable);


        var tv = findViewById<TextView>(R.id.textView)
        tv.text = nativeMethod()
        tv.movementMethod = LinkMovementMethod.getInstance()
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun nativeMethod(): SpannableStringBuilder {
        return SpannableStringBuilder().apply {
            append(list[0])
                .append(list[1], ForegroundColorSpan(Color.BLUE), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
                .append(
                    "icon",
                    ImageSpan(
                        this@SpannableStringAct,
                        R.mipmap.icon_editor,
                        DynamicDrawableSpan.ALIGN_BASELINE
                    ),
                    Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
                )
                //实现图片+list[1] 整体被点击
                .apply {
                    val end = this.length
                    var start = end - "icon".length - list[1].length
                    setSpan(object : ClickableSpan() {
                        override fun onClick(widget: View) {
                            Toast.makeText(this@SpannableStringAct, "听风吹雨", Toast.LENGTH_SHORT)
                                .show()
                        }
                    }, start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

                }
                .append(list[2])
                .append(list[3], UnderlineSpan(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        }
    }


}