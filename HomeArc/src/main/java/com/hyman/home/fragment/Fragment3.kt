package com.hyman.home.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment

class Fragment3 : Fragment() {

    lateinit var mContext: Context
    var textView :TextView?=null

    override fun setUserVisibleHint(isVisibleToUser: Boolean) {
        super.setUserVisibleHint(isVisibleToUser)
        if(textView!=null && isVisibleToUser ){
            Toast.makeText(context,"当前是Fragment3", Toast.LENGTH_SHORT).show()
        }
        Log.d("Fragment3","setUserVisibleHint $isVisibleToUser")
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        this.mContext =context
        Log.d("Fragment3","onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Fragment3","onCreate")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d("Fragment3","onCreateView")
        textView= TextView(context)
        textView?.text="Fragment3"
        return textView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("Fragment3","onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Fragment3","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Fragment3","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Fragment3","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Fragment3","onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Fragment3","onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Fragment3","onDestroy")
    }
}
