package com.sjd.animatedbottomnavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import me.ibrahimsn.lib.OnItemSelectedListener

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        smoothBottomBar.setOnItemSelectedListener(object : OnItemSelectedListener {
            override fun onItemSelect(pos: Int) {
                
            }
        })
    }
}
