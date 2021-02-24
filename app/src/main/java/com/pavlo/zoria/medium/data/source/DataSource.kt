package com.pavlo.zoria.medium.data.source

interface DataSource<T> {
    fun getData(): T
    fun getById(id: Long): T?
}