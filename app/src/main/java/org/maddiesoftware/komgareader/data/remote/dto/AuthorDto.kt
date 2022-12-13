package org.maddiesoftware.komgareader.data.remote.dto

import org.maddiesoftware.komgareader.domain.model.Author

data class AuthorDto(
    val name: String?,
    val role: String?
){
    fun toAuthor(): Author{
        return Author(
            name = name,
            role = role
        )
    }
}
