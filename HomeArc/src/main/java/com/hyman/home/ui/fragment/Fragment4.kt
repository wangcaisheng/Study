package com.hyman.home.ui.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.hyman.home.base.BaseLazyFragment
import com.hyman.home.base.BaseLifecycleFragment

class Fragment4 : BaseLazyFragment() {

    lateinit var mContext: Context
    var textView :TextView?=null

    override fun setUserVisibleHint(isVisibleToUser: Boolean) {
        super.setUserVisibleHint(isVisibleToUser)
        if(textView!=null && isVisibleToUser ){
            Toast.makeText(context,"当前是Fragment4", Toast.LENGTH_SHORT).show()
        }
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        this.mContext =context
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d("Fragment4","onCreateView")
        textView= TextView(context)
        textView?.text="Fragment4"
        return textView
    }

}
