package com.geektrust.waterbill

import com.geektrust.waterBill.ADDGuests
import com.geektrust.waterBill.AllotWater
import com.geektrust.waterBill.ApartmentType
import org.junit.Test

internal class CommandsTest {

    @Test
    fun parseAllotWaterCommand() {
       val allotWater =  AllotWater.create("ALLOT_WATER 2 3:7")
        assert(allotWater.apartmentType == ApartmentType.TWO_BHK)
        assert(allotWater.corporateToBoreWellRatio == Pair(3, 7))
    }

    @Test
    fun parseAddGuestCommand() {
        val addGuestCommandOne =  ADDGuests.create("ADD_GUESTS 3")
        assert(addGuestCommandOne.noOfGuests == 3)
        val addGuestCommandTwo =  ADDGuests.create("ADD_GUESTS 4")
        assert(addGuestCommandTwo.noOfGuests == 4)
    }
}