package org.lost_teddy.core.domain

import org.lost_teddy.core.domain.models.Teddy

interface TeddyRepo {
    fun getAllActiveTeddy(): List<Teddy>;

    fun countAllFoundTeddy(): Int;

    fun createTeddy(teddy: Teddy): Teddy;
}
