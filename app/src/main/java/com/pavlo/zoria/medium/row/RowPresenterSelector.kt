package com.pavlo.zoria.medium.row

import androidx.leanback.widget.ListRow
import androidx.leanback.widget.ListRowPresenter
import androidx.leanback.widget.Presenter
import androidx.leanback.widget.Row

class RowPresenterSelector : BaseRowPresenterSelector() {

    private var presentersArray = mutableMapOf<Class<out Any>, Presenter>(
        ListRow::class.java to ListRowPresenter()
    )

    fun registerPresenter(rowClass : Class<out Any>, rowPresenter: Presenter) {
        presentersArray[rowClass] = rowPresenter
    }

    override fun getRowPresenter(row: Row): Presenter = presentersArray[row.javaClass]
        ?: throw IllegalStateException("Presenter is not registered for row: ${row.javaClass}")

    override fun getPresenters(): Array<Presenter> {
        return presentersArray.values.toTypedArray()
    }
}