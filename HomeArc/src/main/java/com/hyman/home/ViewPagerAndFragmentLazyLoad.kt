package com.hyman.home

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.hyman.home.adapter.VpAdapter
import com.hyman.home.fragment.Fragment1
import com.hyman.home.fragment.Fragment2
import com.hyman.home.fragment.Fragment3
import com.hyman.home.fragment.Fragment4
import kotlinx.android.synthetic.main.activity_vp_fragment.*

/**
 *@author: Hyman
 *time: 2021/1/6 下午7:54
 *des:
 */
class ViewPagerAndFragmentLazyLoad : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vp_fragment)
        //1,vp设置adapter
        val adapter:VpAdapter= VpAdapter(supportFragmentManager)
        vp.adapter=adapter

        //2,adapter添加数据
        val fragment1:Fragment= Fragment1()
        val fragment2:Fragment= Fragment2()
        val fragment3:Fragment= Fragment3()
        val fragment4:Fragment= Fragment4()
        adapter.addFragment(fragment1)
        adapter.addFragment(fragment2)
        adapter.addFragment(fragment3)
        adapter.addFragment(fragment4)
        adapter.notifyDataSetChanged()

        tv1.setOnClickListener{
            vp.setCurrentItem(0,false)
        }

        tv2.setOnClickListener{
            vp.setCurrentItem(1,false)
        }

        tv3.setOnClickListener{
            vp.setCurrentItem(2,false)
        }

        tv4.setOnClickListener{
            vp.setCurrentItem(3,false)
        }
    }

    companion object {
        @JvmStatic
        fun startMe(contex: HomeActivity) {
            val intnet=Intent(contex,ViewPagerAndFragmentLazyLoad::class.java)
            contex.startActivity(intnet)

        }
    }
}