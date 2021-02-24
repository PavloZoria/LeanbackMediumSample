package com.pavlo.zoria.medium.card.grid

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.leanback.widget.VerticalGridView
import com.pavlo.zoria.medium.R
import com.pavlo.zoria.medium.card.base.BaseCardView
import com.pavlo.zoria.medium.data.Movie
import kotlin.math.ceil

class GridCardView @JvmOverloads constructor(context: Context?, private val rowHeight: Float = 0f) :
    BaseCardView<List<Movie>>(context) {
    override fun bind(data: List<Movie>) {

    }
    //
    // private var verticalGridView: VerticalGridView
    //
    // private val horizontalSpacing =
    //     resources.getDimension(R.dimen.lb_browse_item_horizontal_spacing).toInt()
    // private val verticalSpacing =
    //     resources.getDimension(R.dimen.vertical_grid_items_vertical_spacing).toInt()
    //
    // private val columns = resources.getInteger(R.integer.vertical_grid_columns_number)
    //
    // init {
    //     LayoutInflater.from(context).inflate(R.layout.search_category_grid, this)
    //     verticalGridView = findViewById<VerticalGridView>(R.id.verticalGridView).apply {
    //         horizontalSpacing = this@GridCardView.horizontalSpacing
    //         verticalSpacing = this@GridCardView.verticalSpacing
    //
    //         setColumnWidth(ViewGroup.LayoutParams.WRAP_CONTENT)
    //         setNumColumns(columns)
    //     }
    //     descendantFocusability = FOCUS_AFTER_DESCENDANTS
    // }
    //
    // private val adapter = HorizontalProgramsAdapter(context!!).apply {
    //     onItemClick = {
    //     }
    // }
    //
    // override fun bind(data: List<Movie>) = with(verticalGridView) {
    //     adapter = this@GridCardView.adapter.also {
    //         it.programs = data
    //         it.notifyDataSetChanged()
    //     }
    //
    //     val rowsNumber = ceil(data.size.toDouble() / columns).toInt()
    //     layoutParams = calculateLayoutParams(rowsNumber, verticalSpacing)
    // }
    //
    // private fun calculateLayoutParams(rowsNumber: Int, verticalSpacing: Int): LayoutParams {
    //     val rowHeight = rowHeight + verticalSpacing
    //     return LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, (rowsNumber * rowHeight).toInt())
    // }
}