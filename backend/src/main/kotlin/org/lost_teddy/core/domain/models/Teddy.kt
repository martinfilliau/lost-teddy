package org.lost_teddy.core.domain.models

import org.lost_teddy.core.domain.value_objects.TeddyStatus
import java.util.Date

data class Teddy(
    val name: String,
    val description: String,
    val status: TeddyStatus,
    // XXX TODO photo
    // XXX TODO person who found, contact
    val location: Location,
    val foundAt: Date,
)
