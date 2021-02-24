package com.pavlo.zoria.medium.data

import androidx.annotation.DrawableRes

data class Category(val title: String, @DrawableRes val icon: Int, val data: List<CategoryItem>)