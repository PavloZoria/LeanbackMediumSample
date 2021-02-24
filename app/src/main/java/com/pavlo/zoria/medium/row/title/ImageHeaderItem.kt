package com.pavlo.zoria.medium.row.title

import androidx.annotation.DrawableRes
import androidx.leanback.widget.HeaderItem

data class ImageHeaderItem(
    val identifier: Long = 0L,
    val title: String?,
    @DrawableRes val icon: Int = 0
) : HeaderItem(identifier, title)