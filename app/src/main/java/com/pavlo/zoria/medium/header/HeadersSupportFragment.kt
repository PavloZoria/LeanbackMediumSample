package com.pavlo.zoria.medium.header

import androidx.leanback.app.HeadersSupportFragment
import androidx.leanback.widget.ClassPresenterSelector
import androidx.leanback.widget.DividerPresenter
import androidx.leanback.widget.DividerRow
import androidx.leanback.widget.Row
import androidx.leanback.widget.RowHeaderPresenter
import androidx.leanback.widget.SectionRow
import com.pavlo.zoria.medium.R
import com.pavlo.zoria.medium.row.title.ImageListRow
import com.pavlo.zoria.medium.row.title.RowIconHeaderPresenter

class HeadersSupportFragment : HeadersSupportFragment() {
    init {
        presenterSelector = ClassPresenterSelector()
            .addClassPresenter(DividerRow::class.java, DividerPresenter())
            .addClassPresenter(
                SectionRow::class.java,
                RowHeaderPresenter(R.layout.lb_section_header, false)
            )
            .addClassPresenter(ImageListRow::class.java, RowIconHeaderPresenter())
            .addClassPresenter(Row::class.java, RowHeaderPresenter(R.layout.lb_header));
    }
}