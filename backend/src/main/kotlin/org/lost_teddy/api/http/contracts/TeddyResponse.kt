package org.lost_teddy.api.http.contracts

import org.lost_teddy.core.domain.models.Teddy

data class TeddyResponse(
    val name: String,
    val description: String
) {
}

fun Teddy.toResponse() = TeddyResponse(
    name = name,
    description = description
)
