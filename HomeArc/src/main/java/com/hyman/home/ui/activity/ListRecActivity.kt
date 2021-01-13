package com.hyman.home.ui.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.hyman.home.R
import com.hyman.home.adapter.FruitAdapter
import com.hyman.home.adapter.RecAdapter
import com.hyman.home.bean.Fruit
import kotlinx.android.synthetic.main.ac_list_rec.*

class ListRecActivity : AppCompatActivity(){

    var dataList=ArrayList<String>()
    var dataRecList=ArrayList<Fruit>()

    companion object{
        @JvmStatic
        fun startMe(context: Context){
            val intent=Intent(context,ListRecActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ac_list_rec)
        dealListView()
        dealRecView()
    }

    private fun dealRecView() {
        repeat(5){
            dataRecList.add(Fruit("0","菠萝"))
            dataRecList.add(Fruit("0","菠萝蜜"))
            dataRecList.add(Fruit("0","人参果"))
        }
        val linearLM=LinearLayoutManager(this)
        linearLM.orientation=LinearLayoutManager.VERTICAL
        recycle_view.layoutManager=linearLM
        val adapter= RecAdapter(dataRecList)
        recycle_view.adapter=adapter
    }

    private fun dealListView() {
        repeat(2){
            dataList.add("苹果")
            dataList.add("香蕉")
            dataList.add("梨")
        }
        val adapter=FruitAdapter(this,R.layout.list_item,dataList)
        list_view.adapter=adapter
    }

}
