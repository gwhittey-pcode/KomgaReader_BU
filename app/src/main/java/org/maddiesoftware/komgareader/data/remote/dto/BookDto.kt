package org.maddiesoftware.komgareader.data.remote.dto

data class BookDto(
    val created: String?,
    val deleted: Boolean?,
    val fileHash: String?,
    val fileLastModified: String?,
    val id: String?,
    val lastModified: String?,
    val libraryId: String?,
    val media: org.maddiesoftware.komgareader.data.remote.dto.MediaDto?,
    val metadata: org.maddiesoftware.komgareader.data.remote.dto.BookMetadataDto?,
    val name: String?,
    val number: Int?,
    val readProgress: org.maddiesoftware.komgareader.data.remote.dto.ReadProgressDto?,
    val seriesId: String?,
    val seriesTitle: String?,
    val size: String?,
    val sizeBytes: Int?,
    val url: String?
)
