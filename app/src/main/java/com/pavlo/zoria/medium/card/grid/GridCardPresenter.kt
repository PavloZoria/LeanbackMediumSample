package com.pavlo.zoria.medium.card.grid

import android.content.Context
import com.pavlo.zoria.medium.card.base.BaseItemCardPresenter
import com.pavlo.zoria.medium.card.grid.GridCardView
import com.pavlo.zoria.medium.data.Movie

class GridCardPresenter(private val rowHeight: Float) : BaseItemCardPresenter<List<Movie>, GridCardView>() {

    override fun onCreateView(context: Context?) = GridCardView(context, rowHeight)
}