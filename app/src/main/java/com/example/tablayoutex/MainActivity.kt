package com.example.tablayoutex

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("TabLayout with Collapsing Toolbar")

        setSupportActionBar(toolbar)
        setTitle("TabLayout")
        vp.adapter = FragmentPagerAdaptor_(supportFragmentManager)
        tl.setupWithViewPager(vp)


    }
}