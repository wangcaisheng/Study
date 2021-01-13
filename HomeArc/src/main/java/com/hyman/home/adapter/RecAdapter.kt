package com.hyman.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hyman.home.R
import com.hyman.home.adapter.RecAdapter.NativeViewHolder
import com.hyman.home.bean.Fruit
import kotlinx.android.synthetic.main.list_item.view.*

class RecAdapter(private val fruitList :List<Fruit>) : RecyclerView.Adapter<NativeViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NativeViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item, parent, false)
        return NativeViewHolder(view)
    }

    override fun onBindViewHolder(holder: NativeViewHolder, position: Int) {
        holder.textView.text=fruitList.get(position).fruitName
    }

    override fun getItemCount(): Int {
      return fruitList.size
    }

    inner class NativeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(R.id.item_tv)
        val imageView: TextView = itemView.findViewById(R.id.item_tv)
    }

}
