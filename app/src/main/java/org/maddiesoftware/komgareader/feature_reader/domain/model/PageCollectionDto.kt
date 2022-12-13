package org.maddiesoftware.komgareader.feature_reader.domain.model

data class PageCollection(
    val content: List<Collection>?,
    val empty: Boolean?,
    val first: Boolean?,
    val last: Boolean?,
    val number: Int?,
    val numberOfElements: Int?,
    val pageable: Pageable?,
    val size: Int?,
    val sort: SortX?,
    val totalElements: Int?,
    val totalPages: Int?
)