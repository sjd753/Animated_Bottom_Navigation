package com.sjd.animatedbottomnavigation.library

import android.graphics.RectF
import android.graphics.drawable.Drawable

data class BottomNavigationBarItem(
    var title: String,
    val icon: Drawable,
    var rect: RectF = RectF(),
    var alpha: Int
)