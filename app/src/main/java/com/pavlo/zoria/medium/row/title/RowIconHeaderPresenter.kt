package com.pavlo.zoria.medium.row.title

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isGone
import androidx.leanback.widget.Presenter
import androidx.leanback.widget.RowHeaderPresenter
import com.pavlo.zoria.medium.R

class RowIconHeaderPresenter : RowHeaderPresenter() {

    private var mUnselectAlpha = 0f
    override fun onCreateViewHolder(parent: ViewGroup?): Presenter.ViewHolder {
        Log.d("RowHeaderPresenter", "CustomRowHeaderPresenter is on onCreateViewHolder")
        val view = LayoutInflater.from(parent?.context)
            .inflate(R.layout.icon_header_item, parent, false)

        mUnselectAlpha = view.resources.getFraction(
            androidx.leanback.R.fraction.lb_browse_header_unselect_alpha, 1, 1
        )
        return RowImageHeaderViewHolder(view)
    }

    override fun onBindViewHolder(
        viewHolder: Presenter.ViewHolder?,
        item: Any?,
        payloads: MutableList<Any>?
    ) {
        onBindViewHolder(viewHolder, item)
    }

    //item is ImageListRow
    override fun onBindViewHolder(viewHolder: Presenter.ViewHolder?, item: Any?) {
        val header = (item as ImageListRow).headerItem as ImageHeaderItem
        (viewHolder as RowImageHeaderViewHolder).bind(header)
    }

    override fun onSelectLevelChanged(holder: ViewHolder?) {
        super.onSelectLevelChanged(holder)
        (holder as RowImageHeaderViewHolder).selectLevelChange()
    }

    inner class RowImageHeaderViewHolder(root: View) : RowHeaderPresenter.ViewHolder(root) {
        private val title: TextView = root.findViewById(R.id.title)
        private val textSize = title.textSize
        private val imageView: ImageView = root.findViewById(R.id.icon)

        fun bind(item: ImageHeaderItem) {
            title.text = item.title
            imageView.setImageResource(item.icon)

            if (item.icon == 0) {
                title.layoutParams =
                    (title.layoutParams as? ViewGroup.MarginLayoutParams)?.apply {
                        marginStart = 0
                        marginEnd = 0
                    }
            }
        }

        fun selectLevelChange() {
            val alpha = mUnselectAlpha + selectLevel * 1f - mUnselectAlpha
            imageView.alpha = alpha
            title.textSize = textSize + 0.5f * textSize * selectLevel
            // icon.isGone = alpha == 0f
        }
    }
}