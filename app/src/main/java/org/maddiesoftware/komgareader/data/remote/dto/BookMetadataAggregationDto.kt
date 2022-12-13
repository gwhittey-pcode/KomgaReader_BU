package org.maddiesoftware.komgareader.data.remote.dto

data class BookMetadataAggregationDto(
    val authors: List<org.maddiesoftware.komgareader.data.remote.dto.AuthorDto?>?,
    val created: String?,
    val lastModified: String?,
    val releaseDate: String?,
    val summary: String?,
    val summaryNumber: String?,
    val tags: List<String?>?
)
