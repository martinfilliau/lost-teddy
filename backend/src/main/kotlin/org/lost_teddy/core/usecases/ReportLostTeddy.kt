package org.lost_teddy.core.usecases

import org.lost_teddy.core.domain.models.Teddy
import org.lost_teddy.core.domain.TeddyRepo

class ReportLostTeddy(private val teddyRepo: TeddyRepo) {
    fun execute(teddy: Teddy): Teddy {
        return teddyRepo.createTeddy(teddy);
    }
}