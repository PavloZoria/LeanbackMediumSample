package com.pavlo.zoria.medium.card.feedback

import android.content.Context
import com.pavlo.zoria.medium.card.base.BaseItemCardPresenter
import com.pavlo.zoria.medium.data.Feedback

class FeedbackCardPresenter: BaseItemCardPresenter<Feedback, FeedbackCardView>() {
    override fun onCreateView(context: Context?) = FeedbackCardView(context)
}