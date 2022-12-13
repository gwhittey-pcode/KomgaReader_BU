package org.maddiesoftware.komgareader.feature_reader.domain.model

data class Page(
    val fileName: String?,
    val height: Int?,
    val mediaType: String?,
    val number: Int?,
    val size: String?,
    val sizeBytes: Int?,
    val width: Int?
)