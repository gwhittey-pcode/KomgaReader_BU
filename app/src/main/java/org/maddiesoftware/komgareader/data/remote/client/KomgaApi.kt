package org.maddiesoftware.komgareader.data.remote.client

import org.maddiesoftware.komgareader.data.remote.dto.PageBookDto
import org.maddiesoftware.komgareader.data.remote.dto.PageSeriesDto
import retrofit2.http.*

interface KomgaServerApi {

    //    Series Controller
    @GET("/api/v1/series")
    suspend fun getseries(
        @Query("search") search: String?,
        @Query("library_id") libraryId: List<String>?,
        @Query("collection_id") collectionId: List<String>?,
        @Query("status") status: List<String>?,
        @Query("read_status") readStatus: List<String>?,
        @Query("publisher") publisher: List<String>?,
        @Query("language") language: List<String>?,
        @Query("genre") genre: List<String>?,
        @Query("tag") tag: List<String>?,
        @Query("age_rating") ageRating: List<String>?,
        @Query("release_year") releaseYear: List<String>?,
        @Query("unpaged") unpaged: Boolean?,
        @Query("page") page: Int?,
        @Query("size") size: Int?,
        @Query("sort") sort: List<String>?,
        @Query("author") author: List<String>?
    ): org.maddiesoftware.komgareader.data.remote.dto.PageSeriesDto

    @GET("/api/v1/series/{seriesId}")
    suspend fun getSeriesById(@Path("seriesId") seriesId: String)

    @GET("/api/v1/series/{seriesId}/books")
    suspend fun getBooksFromSeries(
        @Path("seriesId") seriesId: String,
        @Query("media_status") mediaStatus: List<String>?,
        @Query("read_status") readStatus: List<String>?,
        @Query("tag") tag: List<String>?,
        @Query("unpaged") unpaged: Boolean?,
        @Query("page") page: Int?,
        @Query("size") size: Int?,
        @Query("sort") sort: List<String>?,
        @Query("author") author: List<String>?
    ): org.maddiesoftware.komgareader.data.remote.dto.PageBookDto

    @GET("/api/v1/series/latest")
    suspend fun getLatest(
        @Query("library_id") libraryId: List<String>?,
        @Query("unpaged") unpaged: Boolean?,
        @Query("page") page: Int?,
        @Query("size") size: Int?
    ): org.maddiesoftware.komgareader.data.remote.dto.PageSeriesDto

    @GET("/api/v1/series/new")
    suspend fun getNew(
        @Query("library_id") libraryId: List<String>?,
        @Query("unpaged") unpaged: Boolean?,
        @Query("page") page: Int?,
        @Query("size") size: Int?
    ): org.maddiesoftware.komgareader.data.remote.dto.PageSeriesDto

    @GET("/api/v1/series/updated")
    suspend fun getUpdated(
        @Query("library_id") libraryId: List<String>?,
        @Query("unpaged") unpaged: Boolean?,
        @Query("page") page: Int?,
        @Query("size") size: Int?
    ): org.maddiesoftware.komgareader.data.remote.dto.PageSeriesDto

    @POST("/api/v1/series/{seriesId}/read-progress")
    suspend fun markAsRead(@Path("seriesId") seriesId: String?)

    @DELETE("/api/v1/series/{seriesId}/read-progress")
    suspend fun deleteReadProgress(@Path("seriesId") seriesId: String?)

// Reading Lists Contoller
}
