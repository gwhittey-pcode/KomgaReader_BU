package org.maddiesoftware.komgareader.domain.model

data class Pageable(
    val offset: Int?,
    val pageNumber: Int?,
    val pageSize: Int?,
    val paged: Boolean?,
    val sort: org.maddiesoftware.komgareader.domain.model.SortX?,
    val unpaged: Boolean?
)
