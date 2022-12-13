package org.maddiesoftware.komgareader.data.remote.dto

import org.maddiesoftware.komgareader.domain.model.Series

data class SeriesDto(
    val booksCount: Int?,
    val booksInProgressCount: Int?,
    val booksMetadata: org.maddiesoftware.komgareader.data.remote.dto.BookMetadataAggregationDto?,
    val booksReadCount: Int?,
    val booksUnreadCount: Int?,
    val created: String?,
    val deleted: Boolean?,
    val fileLastModified: String?,
    val id: String?,
    val lastModified: String?,
    val libraryId: String?,
    val metadata: org.maddiesoftware.komgareader.data.remote.dto.SeriesMetadataDto?,
    val name: String?,
    val url: String?
){

}
