package org.maddiesoftware.komgareader.feature_reader.data.remote.dto

data class BookMetadataAggregationDto(
    val authors: List<AuthorDto?>?,
    val created: String?,
    val lastModified: String?,
    val releaseDate: String?,
    val summary: String?,
    val summaryNumber: String?,
    val tags: List<String?>?
)