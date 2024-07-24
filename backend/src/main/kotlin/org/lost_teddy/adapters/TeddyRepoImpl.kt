package org.lost_teddy.adapters

import org.lost_teddy.core.domain.models.Teddy
import org.lost_teddy.core.domain.TeddyRepo
import org.lost_teddy.core.domain.models.TeddyStatus

class TeddyRepoImpl : TeddyRepo {
    val teddies: MutableList<Teddy> = mutableListOf()

    override fun getAllActiveTeddy(): List<Teddy> {
        return teddies.filter { teddy -> teddy.status == TeddyStatus.OPEN }
    }

    override fun countAllFoundTeddy(): Int {
        return teddies.count { teddy -> teddy.status == TeddyStatus.FOUND }
    }

    override fun createTeddy(teddy: Teddy): Teddy {
        teddies.addLast(teddy);
        return teddy;
    }
}