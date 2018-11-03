package com.dicoding.kotlin.rakaiqbalsy.footballkade2api

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.kotlin.rakaiqbalsy.footballkade2api.CostumPager.pagerAdapter
import com.dicoding.kotlin.rakaiqbalsy.footballkade2api.Fragment.LastMatchFragment
import com.dicoding.kotlin.rakaiqbalsy.footballkade2api.Fragment.NextMatchFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.appbar_activity.*

class MainActivity : AppCompatActivity() {

    var adapterPage : pagerAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        adapterPage = pagerAdapter(supportFragmentManager)
        adapterPage!!.addFragments(LastMatchFragment(), "Last Match")
        adapterPage!!.addFragments(NextMatchFragment(), "Next Match")

        //tambah pageadapter ke viewpager
        vPager.adapter = adapterPage
        //set view pager with tablayout
        ctabLayout.setupWithViewPager(vPager)

    }
}