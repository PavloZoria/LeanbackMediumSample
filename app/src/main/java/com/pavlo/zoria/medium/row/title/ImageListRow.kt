package com.pavlo.zoria.medium.row.title

import androidx.leanback.widget.ListRow
import androidx.leanback.widget.ObjectAdapter

class ImageListRow(id: Long? = null, header: ImageHeaderItem? = null, adapter: ObjectAdapter) :
    ListRow(header, adapter) {
    constructor(adapter: ObjectAdapter) : this(null, null, adapter)

    constructor(header: ImageHeaderItem?, adapter: ObjectAdapter) : this(null, header, adapter)
}