package com.pavlo.zoria.medium.row

import android.view.ViewGroup
import androidx.leanback.widget.FocusHighlight.ZOOM_FACTOR_NONE
import androidx.leanback.widget.ListRowPresenter
import androidx.leanback.widget.RowPresenter
import com.pavlo.zoria.medium.row.title.RowIconHeaderPresenter

class ImageTitleRowPresenter(
    focusZoomFactor: Int = ZOOM_FACTOR_NONE,
    useFocusDimmer: Boolean = false
) : ListRowPresenter(focusZoomFactor, useFocusDimmer) {

    override fun createRowViewHolder(parent: ViewGroup?): RowPresenter.ViewHolder {
        shadowEnabled = false
        // selectEffectEnabled = false
        enableChildRoundedCorners(false)
        headerPresenter = RowIconHeaderPresenter()
        return super.createRowViewHolder(parent)
    }
}