package org.maddiesoftware.komgareader.data.remote.dto

data class PageBookDto(
    val content: List<org.maddiesoftware.komgareader.data.remote.dto.BookDto>?,
    val empty: Boolean?,
    val first: Boolean?,
    val last: Boolean?,
    val number: Int?,
    val numberOfElements: Int?,
    val pageable: org.maddiesoftware.komgareader.data.remote.dto.PageableDto?,
    val size: Int?,
    val sort: org.maddiesoftware.komgareader.data.remote.dto.SortDtoX?,
    val totalElements: Int?,
    val totalPages: Int?
)
