package org.maddiesoftware.komgareader.domain.model

data class PageReadList(
    val content: List<org.maddiesoftware.komgareader.domain.model.ReadList>?,
    val empty: Boolean?,
    val first: Boolean?,
    val last: Boolean?,
    val number: Int?,
    val numberOfElements: Int?,
    val pageable: org.maddiesoftware.komgareader.domain.model.Pageable?,
    val size: Int?,
    val sort: org.maddiesoftware.komgareader.domain.model.SortX?,
    val totalElements: Int?,
    val totalPages: Int?
)
