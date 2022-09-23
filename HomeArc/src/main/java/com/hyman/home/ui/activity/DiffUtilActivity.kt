package com.hyman.home.ui.activity

import com.arch.demo.core.activity.MvvmActivity
import com.arch.demo.core.viewmodel.MvvmBaseViewModel
import com.hyman.home.R
import com.hyman.home.databinding.ActivityDiffBinding

class DiffUtilActivity: MvvmActivity<ActivityDiffBinding, MvvmBaseViewModel<*,*>>() {


    override fun getLayoutId(): Int {
       return R.layout.activity_diff
    }

    override fun onRetryBtnClick() {
        TODO("Not yet implemented")
    }



    override fun getBindingVariable(): Int {
        TODO("Not yet implemented")
    }

    override fun getViewModel(): MvvmBaseViewModel<*, *> {
       return MvvmBaseViewModel<Any,*>()
    }
}