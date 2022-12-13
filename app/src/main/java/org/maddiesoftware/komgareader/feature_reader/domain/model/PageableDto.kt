package org.maddiesoftware.komgareader.feature_reader.domain.model

data class Pageable(
    val offset: Int?,
    val pageNumber: Int?,
    val pageSize: Int?,
    val paged: Boolean?,
    val sort: SortX?,
    val unpaged: Boolean?
)