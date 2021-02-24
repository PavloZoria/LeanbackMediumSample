package com.pavlo.zoria.medium.card.base

import android.content.Context
import androidx.leanback.widget.BaseCardView

abstract class BaseCardView<Data>(context: Context?) : BaseCardView(context) {
    abstract fun bind(data: Data)
}