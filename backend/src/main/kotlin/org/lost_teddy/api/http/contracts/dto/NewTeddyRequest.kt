package org.lost_teddy.api.http.contracts.dto

data class NewTeddyRequest(
    @field:Size(min = 3, max = 60) val name: String,
    @field:Size(min = 3, max = 200) val description: String,
) {
}

fun NewTeddyRequest.toTeddy() = org.lost_teddy.api.http.contracts.TeddyResponse(
    name = name,
    description = description,
)
