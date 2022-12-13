package org.maddiesoftware.komgareader.domain.model

data class Series(
    val booksCount: Int?,
    val booksInProgressCount: Int?,
    val booksMetadata: org.maddiesoftware.komgareader.domain.model.BookMetadataAggregation?,
    val booksReadCount: Int?,
    val booksUnreadCount: Int?,
    val created: String?,
    val deleted: Boolean?,
    val fileLastModified: String?,
    val id: String?,
    val lastModified: String?,
    val libraryId: String?,
    val metadata: org.maddiesoftware.komgareader.domain.model.SeriesMetadata?,
    val name: String?,
    val url: String?
)
