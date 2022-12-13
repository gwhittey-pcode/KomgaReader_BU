package org.maddiesoftware.komgareader.feature_reader.data.remote.dto

data class PageDto(
    val fileName: String?,
    val height: Int?,
    val mediaType: String?,
    val number: Int?,
    val size: String?,
    val sizeBytes: Int?,
    val width: Int?
)