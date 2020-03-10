package com.sjd.animatedbottomnavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import me.ibrahimsn.lib.OnItemSelectedListener

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val colorHome = ContextCompat.getColor(this, R.color.home_color)
        val colorLikes = ContextCompat.getColor(this, R.color.likes_color)
        val colorSearch = ContextCompat.getColor(this, R.color.search_color)
        val colorProfile = ContextCompat.getColor(this, R.color.profile_color)

        val colorHomeAlpha = ContextCompat.getColor(this, R.color.home_color_alpha)
        val colorLikesAlpha = ContextCompat.getColor(this, R.color.likes_color_alpha)
        val colorSearchAlpha = ContextCompat.getColor(this, R.color.search_color_alpha)
        val colorProfileAlpha = ContextCompat.getColor(this, R.color.profile_color_alpha)

        val colors = arrayOf(colorHome, colorLikes, colorSearch, colorProfile)
        val colorsAlpha =
            arrayOf(colorHomeAlpha, colorLikesAlpha, colorSearchAlpha, colorProfileAlpha)

        smoothBottomBar.setOnItemSelectedListener(object : OnItemSelectedListener {
            override fun onItemSelect(pos: Int) {
                smoothBottomBar.setItemIndicatorColor(colorsAlpha[pos])
                smoothBottomBar.setItemTextColor(colors[pos])
                smoothBottomBar.setIconTintActive(colors[pos])

                appBarLayout.setBackgroundColor(colors[pos])
            }
        })
    }
}
