package com.hyman.home.ui.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.hyman.home.R
import com.hyman.home.adapter.FruitAdapter
import com.hyman.home.adapter.RecAdapter
import com.hyman.home.adapter.RecAdapterTwo
import com.hyman.home.bean.Fruit
import kotlinx.android.synthetic.main.ac_list_rec.*

class ListRecActivity : AppCompatActivity() {

    var dataList = ArrayList<String>()
    var dataRecList = ArrayList<Fruit>()
    var dataRecListTwo = ArrayList<Fruit>()

    companion object {
        @JvmStatic
        fun startMe(context: Context) {
            val intent = Intent(context, ListRecActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ac_list_rec)
        dealListView()
        dealRecView()
        dealRecViewTwo()
    }

    private fun dealRecViewTwo() {
        //1,初始化数据
        repeat(10) {
           dataRecListTwo.add(Fruit("0",getRandom("菠萝")))
           dataRecListTwo.add(Fruit("0",getRandom("菠萝蜜")))
           dataRecListTwo.add(Fruit("0",getRandom("人参果")))
        }
        //2,设置recycleView布局管理与adapter.
        val staggeredGridLayoutManager=StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)
        recycle_view_two.layoutManager=staggeredGridLayoutManager
        val adapter= RecAdapterTwo(dataRecListTwo,R.layout.list_item_vertical)
        recycle_view_two.adapter=adapter
    }

    /**
     * s随机拼接 1-20次
     */
    private fun getRandom(s: String): String {
        val time = (1..20).random()
        val builder = StringBuilder()
        repeat(time) {
           builder.append(s)
        }
        return builder.toString()
    }

    private fun dealRecView() {
        repeat(5) {
            dataRecList.add(Fruit("0", "菠萝"))
            dataRecList.add(Fruit("0", "菠萝蜜"))
            dataRecList.add(Fruit("0", "人参果"))
        }
        val linearLM = LinearLayoutManager(this)
        linearLM.orientation = LinearLayoutManager.VERTICAL
        recycle_view.layoutManager = linearLM
        val adapter = RecAdapter(dataRecList,R.layout.list_item)
        recycle_view.adapter = adapter
    }

    private fun dealListView() {
        repeat(2) {
            dataList.add("苹果")
            dataList.add("香蕉")
            dataList.add("梨")
        }
        val adapter = FruitAdapter(this, R.layout.list_item, dataList)
        list_view.adapter = adapter
    }

}
