package org.maddiesoftware.komgareader.data.remote.dto

import com.google.gson.annotations.SerializedName
import org.maddiesoftware.komgareader.domain.model.PageSeries

data class PageSeriesDto(
    @SerializedName("content")
    val series: List<SeriesDto>?,
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
){
    fun toPageSeries(): PageSeries{
        return PageSeries(
            series = series?.map { it.toSeries() },
            empty = empty,
            first = first,
            last = last,
            number = number,
            numberOfElements = numberOfElements,
            pageable = pageable,
            size = size,
            sort = sort,
            totalElements = totalElements,
            totalPages = totalPages

        )
    }

}
