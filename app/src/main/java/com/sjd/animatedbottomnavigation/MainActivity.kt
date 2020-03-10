package com.sjd.animatedbottomnavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import androidx.transition.TransitionManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        home_action.setOnClickListener { select(R.id.home_action) }
        likes_action.setOnClickListener { select(R.id.likes_action) }
        search_action.setOnClickListener { select(R.id.search_action) }
        profile_action.setOnClickListener { select(R.id.profile_action) }
    }

    private fun select(id: Int) {
        TransitionManager.beginDelayedTransition(bottom_bar)
        val cs = ConstraintSet()
        cs.clone(home_action)
        if (id == R.id.home_action) {
            DrawableCompat.setTint(
                home_action.background,
                ContextCompat.getColor(this, R.color.home_color)
            )
            cs.setVisibility(home_icon_text.id, ConstraintSet.VISIBLE)
        } else {
            DrawableCompat.setTint(
                home_action.background,
                ContextCompat.getColor(this, android.R.color.transparent)
            )
            cs.setVisibility(home_icon_text.id, ConstraintSet.GONE)
        }
        cs.applyTo(home_action)

        cs.clone(likes_action)
        if (id == R.id.likes_action) {
            DrawableCompat.setTint(
                likes_action.background,
                ContextCompat.getColor(this, R.color.likes_color)
            )
            cs.setVisibility(likes_icon_text.id, ConstraintSet.VISIBLE)
        } else {
            DrawableCompat.setTint(
                likes_action.background,
                ContextCompat.getColor(this, android.R.color.transparent)
            )
            cs.setVisibility(likes_icon_text.id, ConstraintSet.GONE)
        }
        cs.applyTo(likes_action)

        cs.clone(search_action)
        if (id == R.id.search_action) {
            DrawableCompat.setTint(
                search_action.background,
                ContextCompat.getColor(this, R.color.search_color)
            )
            cs.setVisibility(search_icon_text.id, ConstraintSet.VISIBLE)
        } else {
            DrawableCompat.setTint(
                search_action.background,
                ContextCompat.getColor(this, android.R.color.transparent)
            )
            cs.setVisibility(search_icon_text.id, ConstraintSet.GONE)
        }
        cs.applyTo(search_action)

        cs.clone(profile_action)
        if (id == R.id.profile_action) {
            DrawableCompat.setTint(
                profile_action.background,
                ContextCompat.getColor(this, R.color.profile_color)
            )
            cs.setVisibility(profile_icon_text.id, ConstraintSet.VISIBLE)
        } else {
            DrawableCompat.setTint(
                profile_action.background,
                ContextCompat.getColor(this, android.R.color.transparent)
            )
            cs.setVisibility(profile_icon_text.id, ConstraintSet.GONE)
        }
        cs.applyTo(profile_action)
    }
}
