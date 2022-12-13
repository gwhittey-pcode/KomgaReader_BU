package org.maddiesoftware.komgareader.data.remote.dto

import com.google.gson.annotations.SerializedName
import org.maddiesoftware.komgareader.domain.model.PageSeries

data class PageSeriesDto(
    @SerializedName("content")
    val series: List<org.maddiesoftware.komgareader.data.remote.dto.SeriesDto>?,
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
){

}
