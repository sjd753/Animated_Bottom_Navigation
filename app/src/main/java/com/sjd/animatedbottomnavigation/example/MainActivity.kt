package com.sjd.animatedbottomnavigation.example

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.sjd.animatedbottomnavigation.R
import com.sjd.animatedbottomnavigation.library.OnItemSelectedListener
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility =
            View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_STABLE

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = Color.TRANSPARENT
            window.navigationBarColor = Color.TRANSPARENT
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            window.decorView.systemUiVisibility += View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        }

        val colors = resources.getIntArray(R.array.menuItemColors)

        bottomNavigationBar.setOnItemSelectedListener(object : OnItemSelectedListener {
            override fun onItemSelect(position: Int) {
                appBarLayout.setBackgroundColor(colors[position])
                frameLayout.setBackgroundColor(colors[position])
            }
        })
    }
}
