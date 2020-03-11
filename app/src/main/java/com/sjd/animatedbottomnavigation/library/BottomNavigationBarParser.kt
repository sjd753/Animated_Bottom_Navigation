package com.sjd.animatedbottomnavigation.library

import android.content.Context
import android.content.res.Resources
import android.content.res.XmlResourceParser
import android.graphics.drawable.Drawable
import androidx.annotation.XmlRes
import androidx.core.content.ContextCompat

class BottomNavigationBarParser(private val context: Context, @XmlRes res: Int) {

    private val parser: XmlResourceParser = context.resources.getXml(res)

    fun parse(): List<BottomNavigationBarItem> {
        val items: MutableList<BottomNavigationBarItem> = mutableListOf()
        var eventType: Int?

        do {
            eventType = parser.next()
            if (eventType == XmlResourceParser.START_TAG && parser.name == Constants.ITEM_TAG) {
                items.add(getTabConfig(parser))
            }
        } while (eventType != XmlResourceParser.END_DOCUMENT)

        return items
    }

    private fun getTabConfig(parser: XmlResourceParser): BottomNavigationBarItem {
        val attributeCount = parser.attributeCount
        var itemText: String? = null
        var itemDrawable: Drawable? = null

        for (index in 0 until attributeCount) {
            when (parser.getAttributeName(index)) {
                Constants.ICON_ATTRIBUTE ->
                    itemDrawable = ContextCompat.getDrawable(
                        context,
                        parser.getAttributeResourceValue(index, 0)
                    )
                Constants.TITLE_ATTRIBUTE -> {
                    itemText = try {
                        context.getString(parser.getAttributeResourceValue(index, 0))
                    } catch (notFoundException: Resources.NotFoundException) {
                        parser.getAttributeValue(index)
                    }
                }
            }
        }

        if (itemDrawable == null)
            throw Throwable("Item icon can not be null!")

        return BottomNavigationBarItem(itemText ?: "", itemDrawable, alpha = 0)
    }
}