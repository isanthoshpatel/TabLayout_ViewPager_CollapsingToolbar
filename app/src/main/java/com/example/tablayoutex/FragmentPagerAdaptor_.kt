package com.example.tablayoutex

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class FragmentPagerAdaptor_(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        lateinit var f: Fragment
        when (position) {
            0 -> f = Home()
            1 -> f = Videos()
            2 -> f = Home()
            3 -> f = Videos()
            4 -> f = Home()
        }
        return f
    }

    override fun getCount(): Int {
        return 5
    }

    override fun getPageTitle(position: Int): CharSequence? {
        lateinit var title:String
        when (position) {
            0 -> title = "TabOne"
            1 -> title = "TabTwo"
            2 -> title = "TabOne"
            3 -> title = "TabTwo"
            4 -> title = "TabOne"
        }
        return title
    }
}