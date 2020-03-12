package com.sjd.animatedbottomnavigation.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sjd.animatedbottomnavigation.R
import com.sjd.animatedbottomnavigation.library.OnItemSelectedListener
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationBar.setOnItemSelectedListener(object : OnItemSelectedListener {
            override fun onItemSelect(position: Int) {

            }
        })
    }
}
