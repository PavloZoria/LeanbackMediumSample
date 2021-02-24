package com.pavlo.zoria.medium.card.feedback

import android.content.Context
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.pavlo.zoria.medium.R
import com.pavlo.zoria.medium.card.base.BaseCardView
import com.pavlo.zoria.medium.data.Feedback

class FeedbackCardView(context: Context?) : BaseCardView<Feedback>(context) {

    private val background: ImageView
    private val avatarImage: ImageView
    private val likesNumber: TextView
    private val dislikesNumber: TextView
    private val feedbackTextView: TextView

    init {
        LayoutInflater.from(context).inflate(R.layout.feedback_card_item, this)
        background = findViewById(R.id.background)
        avatarImage = findViewById(R.id.avatarImage)
        likesNumber = findViewById(R.id.likesNumber)
        dislikesNumber = findViewById(R.id.dislikesNumber)
        feedbackTextView = findViewById(R.id.feedback)
        isFocusable = true
        isFocusableInTouchMode = true
    }

    override fun bind(data: Feedback) = with(data) {
        Glide.with(context)
            .load(backgroundImageUrl)
            .centerCrop()
            .into(background)

        Glide.with(context)
            .load(avatarImageUrl)
            .circleCrop()
            .into(avatarImage)
        likesNumber.text = likes.toString()
        dislikesNumber.text = dislikes.toString()
        feedbackTextView.text = feedback
    }
}