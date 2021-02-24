package com.pavlo.zoria.medium.data

import java.io.Serializable

data class Feedback(
    var id: Long = 0,
    var author: String? = null,
    var feedback: String? = null,
    var backgroundImageUrl: String? = null,
    var avatarImageUrl: String? = null,
    var likes: Int = 0,
    var dislikes: Int = 0
) : CategoryItem, Serializable