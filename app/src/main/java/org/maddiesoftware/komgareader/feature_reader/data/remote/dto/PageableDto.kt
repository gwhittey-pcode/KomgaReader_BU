package org.maddiesoftware.komgareader.feature_reader.data.remote.dto

data class PageableDto(
    val offset: Int?,
    val pageNumber: Int?,
    val pageSize: Int?,
    val paged: Boolean?,
    val sort: SortDtoX?,
    val unpaged: Boolean?
)