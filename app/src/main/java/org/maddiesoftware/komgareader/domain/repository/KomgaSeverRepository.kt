package org.maddiesoftware.komgareader.domain.repository

import kotlinx.coroutines.flow.Flow
import org.maddiesoftware.komgareader.domain.model.PageSeries
import org.maddiesoftware.komgareader.util.Resource

interface KomgaSeverRepository{

    suspend fun getSeriesList(
        fetchFromRemote: Boolean,
        query: String?
    ): Resource<org.maddiesoftware.komgareader.domain.model.PageSeries>

}
