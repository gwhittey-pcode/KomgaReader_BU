package org.maddiesoftware.komgareader.feature_reader.data.remote.dto

data class SeriesMetadataDto(
    val ageRating: Int?,
    val ageRatingLock: Boolean?,
    val created: String?,
    val genres: List<String?>?,
    val genresLock: Boolean?,
    val language: String?,
    val languageLock: Boolean?,
    val lastModified: String?,
    val publisher: String?,
    val publisherLock: Boolean?,
    val readingDirection: String?,
    val readingDirectionLock: Boolean?,
    val status: String?,
    val statusLock: Boolean?,
    val summary: String?,
    val summaryLock: Boolean?,
    val tags: List<String?>?,
    val tagsLock: Boolean?,
    val title: String?,
    val titleLock: Boolean?,
    val titleSort: String?,
    val titleSortLock: Boolean?,
    val totalBookCount: Int?,
    val totalBookCountLock: Boolean?
)