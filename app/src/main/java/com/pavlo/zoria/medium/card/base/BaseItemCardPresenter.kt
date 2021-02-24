package com.pavlo.zoria.medium.card.base

import android.content.Context
import android.view.ViewGroup
import androidx.leanback.widget.Presenter

abstract class BaseItemCardPresenter<Data : Any, T : BaseCardView<Data>?> :
    Presenter() {

    override fun onCreateViewHolder(parent: ViewGroup): ViewHolder {
        val cardView = onCreateView(parent.context)
        return ViewHolder(cardView)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, item: Any) {
        (item as? Data?)?.let {
            (viewHolder.view as T)?.bind(it)
        }
    }

    override fun onUnbindViewHolder(viewHolder: ViewHolder) {
        onUnbindViewHolder(viewHolder.view as T)
    }

    fun onUnbindViewHolder(cardView: T) {
        // Nothing to clean up. Override if necessary.
    }

    /**
     * Invoked when a new view is created.
     *
     * @return Returns the newly created view.
     */
    protected abstract fun onCreateView(context: Context?): T

    companion object {
        private const val TAG = "BaseItemCardPresenter"
    }
}