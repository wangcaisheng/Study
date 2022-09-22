package com.hyman.home.ui.custom

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import androidx.databinding.DataBindingUtil
import com.hyman.home.databinding.ViewJdviewBinding

class JdView(context: Context?, attrs: AttributeSet?) : ExpandableContainer(context, attrs) {

    constructor(context: Context?):this(context,null)

    init {
        Log.d("ExpandableContainer","JdView init{}")
    }

    lateinit var binding: ViewJdviewBinding

    override fun getExpandView(): View? {
       return binding.llDes
    }

    override fun getChildView(): View? {
        binding = ViewJdviewBinding.inflate(LayoutInflater.from(context))
        return binding.root
    }

    fun setData(s: String) {
        binding.tvExpand.text = s
        binding.tvDes.visibility = View.VISIBLE //370

//        requestLayout()
    }


}