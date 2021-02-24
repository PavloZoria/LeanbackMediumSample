package com.pavlo.zoria.medium.row

import androidx.leanback.widget.InvisibleRowPresenter
import androidx.leanback.widget.ListRow
import androidx.leanback.widget.ListRowPresenter
import androidx.leanback.widget.Presenter
import androidx.leanback.widget.PresenterSelector
import androidx.leanback.widget.Row
import com.pavlo.zoria.medium.row.title.ImageListRow

abstract class BaseRowPresenterSelector : PresenterSelector() {

    private var presentersArray = mapOf<Class<out Any>, Presenter>(
        ImageListRow::class.java to ImageTitleRowPresenter(),
        ListRow::class.java to ListRowPresenter()
    )

    override fun getPresenter(row: Any?): Presenter {
        if (row == null) return InvisibleRowPresenter()
        return getRowPresenter(row as Row)
    }

    abstract fun getRowPresenter(row: Row): Presenter

    override fun getPresenters(): Array<Presenter> {
        return presentersArray.values.toTypedArray()
    }
}