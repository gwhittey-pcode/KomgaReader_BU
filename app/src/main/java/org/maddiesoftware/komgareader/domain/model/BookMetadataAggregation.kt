package org.maddiesoftware.komgareader.domain.model

data class BookMetadataAggregation(
    val authors: List<org.maddiesoftware.komgareader.domain.model.Author?>?,
    val created: String?,
    val lastModified: String?,
    val releaseDate: String?,
    val summary: String?,
    val summaryNumber: String?,
    val tags: List<String?>?
)
