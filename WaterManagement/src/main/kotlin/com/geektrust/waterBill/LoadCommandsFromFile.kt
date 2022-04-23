package com.geektrust.waterBill

import java.io.File

object CommandsFromFile {

    fun load(filePath: String): List<Command> =
        File(filePath).useLines { it.toList() }.map { line ->
            when {
                line.startsWith("ALLOT_WATER") -> AllotWater.create(line)
                line.startsWith("ADD_GUESTS") -> ADDGuests.create(line)
                else -> BILL()
            }
        }
}