package org.maddiesoftware.komgareader.feature_reader.domain.model

data class Series(
    val booksCount: Int?,
    val booksInProgressCount: Int?,
    val booksMetadata: BookMetadataAggregation?,
    val booksReadCount: Int?,
    val booksUnreadCount: Int?,
    val created: String?,
    val deleted: Boolean?,
    val fileLastModified: String?,
    val id: String?,
    val lastModified: String?,
    val libraryId: String?,
    val metadata: SeriesMetadata?,
    val name: String?,
    val url: String?
)