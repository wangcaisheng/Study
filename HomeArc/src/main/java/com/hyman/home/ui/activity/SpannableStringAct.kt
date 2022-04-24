package com.hyman.home.ui.activity

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.style.BackgroundColorSpan
import android.text.style.UnderlineSpan
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.hyman.home.R

class SpannableStringAct : AppCompatActivity() {

    private val list = listOf("我参加工作时间", "2015.7", "至2019.8", "获得工资300万")

    //    private lateinit var contentBinding: ActSpannableBinding
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        contentBinding =
//            DataBindingUtil.setContentView<ActSpannableBinding>(this, R.layout.act_spannable)
        setContentView(R.layout.act_spannable);
        var spannableStringBuilder = SpannableStringBuilder();
        spannableStringBuilder.apply {
            append(list[0])
                //可以点击，字体蓝色
                .append(list[1], BackgroundColorSpan(Color.BLUE), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
                .setSpan(UnderlineSpan(),0,list[1].length,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
                .append(list[2])
                .append(list[3], UnderlineSpan(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        }

        findViewById<TextView>(R.id.textView).text = spannableStringBuilder
    }


}