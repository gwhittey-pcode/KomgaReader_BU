package org.maddiesoftware.komgareader.domain.model

import org.maddiesoftware.komgareader.data.remote.dto.PageableDto
import org.maddiesoftware.komgareader.data.remote.dto.SortDtoX

data class PageSeries(
    val series: List<Series>?,
    val empty: Boolean?,
    val first: Boolean?,
    val last: Boolean?,
    val number: Int?,
    val numberOfElements: Int?,
    val pageable: PageableDto?,
    val size: Int?,
    val sort: SortDtoX?,
    val totalElements: Int?,
    val totalPages: Int?
)
