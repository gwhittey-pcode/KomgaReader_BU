package org.maddiesoftware.komgareader.feature_reader.data.remote.dto

data class CollectionDto(
    val createdDate: String?,
    val filtered: Boolean?,
    val id: String?,
    val lastModifiedDate: String?,
    val name: String?,
    val ordered: Boolean?,
    val seriesIds: List<String?>?
)