package org.maddiesoftware.komgareader.feature_reader.domain.model

data class Book(
    val created: String?,
    val deleted: Boolean?,
    val fileHash: String?,
    val fileLastModified: String?,
    val id: String?,
    val lastModified: String?,
    val libraryId: String?,
    val media: Media?,
    val metadata: BookMetadata?,
    val name: String?,
    val number: Int?,
    val readProgress: ReadProgress?,
    val seriesId: String?,
    val seriesTitle: String?,
    val size: String?,
    val sizeBytes: Int?,
    val url: String?
)