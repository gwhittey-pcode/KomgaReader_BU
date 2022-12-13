package org.maddiesoftware.komgareader.feature_reader.domain.model

data class ReadProgress(
    val completed: Boolean?,
    val created: String?,
    val lastModified: String?,
    val page: Int?,
    val readDate: String?
)