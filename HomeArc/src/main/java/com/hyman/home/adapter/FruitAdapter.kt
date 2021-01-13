package com.hyman.home.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.hyman.home.R

class FruitAdapter(activity: Activity, private val resId: Int, private val data: List<String>) : ArrayAdapter<String>(activity, resId, data) {

    /**
     *重写改方法
     */
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View
        val viewHolder: ListViewHolder
        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(resId, parent, false)
            val iv: ImageView = view.findViewById(R.id.item_iv)
            val tv: TextView = view.findViewById(R.id.item_tv)
            viewHolder = ListViewHolder(iv, tv)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ListViewHolder
        }

        val itemData = data[position]
        viewHolder.tv.text = itemData

        return view
    }


    inner class ListViewHolder(val iv: ImageView, val tv: TextView)

}
