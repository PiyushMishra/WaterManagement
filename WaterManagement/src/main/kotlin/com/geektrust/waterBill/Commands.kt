package com.geektrust.waterBill

interface Command

class AllotWater(val apartmentType: ApartmentType, val corporateToBoreWellRatio: Pair<Int, Int>) : Command {
    companion object {
        fun create(commandText: String) = run {
            val splitCommandArray = commandText.split(" ")
            val apartmentType = if (splitCommandArray[1] == "2") ApartmentType.TWO_BHK else ApartmentType.THREE_BHK
            val consumptionRatioSplit = splitCommandArray[2].split(":")
            val first = consumptionRatioSplit[0].toInt()
            val second = consumptionRatioSplit[1].toInt()
            AllotWater(apartmentType, Pair(first, second))
        }
    }

    override fun toString(): String {
        return "ALLOT_WATER $apartmentType $corporateToBoreWellRatio"
    }
}

class ADDGuests(val noOfGuests: Int) : Command {
    companion object {
        fun create(commandText: String) = run {
            val splitCommandArray = commandText.split(" ")
            val noOfGuests = splitCommandArray[1].toInt()
            ADDGuests(noOfGuests)
        }
    }

    override fun toString(): String {
        return "ADD_GUESTS $noOfGuests"
    }
}

class BILL() : Command {
    override fun toString(): String {
        return "BILL"
    }
}