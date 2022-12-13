package org.maddiesoftware.komgareader.feature_reader.data.remote.dto

data class SeriesDto(
    val booksCount: Int?,
    val booksInProgressCount: Int?,
    val booksMetadata: BookMetadataAggregationDto?,
    val booksReadCount: Int?,
    val booksUnreadCount: Int?,
    val created: String?,
    val deleted: Boolean?,
    val fileLastModified: String?,
    val id: String?,
    val lastModified: String?,
    val libraryId: String?,
    val metadata: SeriesMetadataDto?,
    val name: String?,
    val url: String?
)