package org.maddiesoftware.komgareader.data.remote.dto

data class PageableDto(
    val offset: Int?,
    val pageNumber: Int?,
    val pageSize: Int?,
    val paged: Boolean?,
    val sort: org.maddiesoftware.komgareader.data.remote.dto.SortDtoX?,
    val unpaged: Boolean?
)
