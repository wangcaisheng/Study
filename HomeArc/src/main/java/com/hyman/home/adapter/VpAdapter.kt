package com.hyman.home.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter


class VpAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {


    var data :MutableList<Fragment> =ArrayList<Fragment>()

    override fun getCount(): Int {
      return data.size
    }

    override fun getItem(position: Int): Fragment {
      return  data.get(position)
    }

    fun addFragment(fragment: Fragment) {
      data.add(fragment)
    }

}
