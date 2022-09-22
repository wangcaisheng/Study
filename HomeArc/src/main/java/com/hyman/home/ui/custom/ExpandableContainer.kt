package com.hyman.home.ui.custom

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.view.ViewTreeObserver
import android.widget.LinearLayout
import android.widget.Toast
import androidx.annotation.MainThread
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

abstract class ExpandableContainer(context: Context?, attrs: AttributeSet?) : LinearLayout(context, attrs) {

    var mExpandView : View? = null
    init {
        removeAllViews()
        addView(getChildView())
        mExpandView = getExpandView()
        Log.d("ExpandableContainer","mExpandView.heigh:${mExpandView?.height}")
        dealCoroutine()

    }

    private fun dealCoroutine() {
        GlobalScope.launch(Dispatchers.Main){
            Log.d("ExpandableContainer",Thread.currentThread().name)
            Toast.makeText(context, "高度${getHeigh()}", Toast.LENGTH_SHORT).show()
        }

    }

    fun getExpandViewHeight(){
        if(mExpandView != null) {
            mExpandView!!.viewTreeObserver.addOnGlobalLayoutListener(object : ViewTreeObserver.OnGlobalLayoutListener{
                override fun onGlobalLayout() {
                    mExpandView!!.height //223
                    Log.d("ExpandableContainer"," mExpandView!!.height:${ mExpandView!!.height}")
                    mExpandView!!.viewTreeObserver.removeGlobalOnLayoutListener(this)
                }

            })
        }
    }

    suspend fun getHeigh():Int{
       return suspendCoroutine { continuation ->
           if(mExpandView != null) {
               mExpandView!!.viewTreeObserver.addOnGlobalLayoutListener(object : ViewTreeObserver.OnGlobalLayoutListener{
                   override fun onGlobalLayout() {
                       continuation.resume(mExpandView!!.height)  //223
                       Log.d("ExpandableContainer"," mExpandView!!.height:${ mExpandView!!.height}")
                       mExpandView!!.viewTreeObserver.removeGlobalOnLayoutListener(this)
                   }

               })
           }
       }
    }

    abstract fun getExpandView(): View?

    abstract fun getChildView(): View?
}