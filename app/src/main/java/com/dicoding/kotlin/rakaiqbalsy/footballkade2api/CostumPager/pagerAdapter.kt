package com.dicoding.kotlin.rakaiqbalsy.footballkade2api.CostumPager

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v7.widget.DialogTitle

class pagerAdapter (fm:FragmentManager):FragmentPagerAdapter(fm){
    var Fm = fm
    var ItemFragement : ArrayList<Fragment> = ArrayList()
    var JudulFragment : ArrayList<String> = ArrayList()

    fun addFragments(fragmentItem:Fragment, fragmentTitle: String) {
        ItemFragement.add(fragmentItem)
        JudulFragment.add(fragmentTitle)
    }

    override fun getItem(position: Int): Fragment {
        return ItemFragement[position]
    }

    override fun getCount(): Int {
        return ItemFragement.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
      return JudulFragment[position]
    }
}