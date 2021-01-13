package com.hyman.home.adapter

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hyman.home.R
import com.hyman.home.bean.Msg

/**
 *@author: Hyman
 *time: 2021/1/13 下午9:01
 *des:
 */
class MsgAdapter(private val msgList: List<Msg>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = if (viewType == Msg.TYPE_SEND) {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.msg_right_item, parent, false)
        RightViewHolder(view)
    } else {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.msg_left_item, parent, false)
        LeftViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val msg=msgList[position]
        when(holder){
            is LeftViewHolder ->{

            }
            is RightViewHolder->{

            }
        }
    }

    override fun getItemCount(): Int {
        return msgList.size
    }


    /**
     * 获取条目类型
     */
    override fun getItemViewType(position: Int): Int {
        return msgList[position].type
    }

    inner class LeftViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val leftMes: TextureView = itemView.findViewById(R.id.leftMsg)
    }

    inner class RightViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val rightMes: TextureView = itemView.findViewById(R.id.rightMsg)
    }
}