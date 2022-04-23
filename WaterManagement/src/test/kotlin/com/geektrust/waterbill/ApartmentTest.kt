package com.geektrust.waterbill

import com.geektrust.waterBill.Apartment
import com.geektrust.waterBill.ApartmentType
import org.junit.Test
import kotlin.test.assertEquals

internal class ApartmentTest {

    @Test
    fun verifyWaterAllottedToTwoBHK() {
        val apartment = Apartment(ApartmentType.TWO_BHK)
        val totalWaterAllotted = apartment.getTotalAllottedWaterPerMonth()
        val totalBoreWellAllotted = apartment.getAllottedAmountOfBorewellWater(Pair(3,7))
        val totalCorporationWaterAllotted = apartment.getAllottedAmountOfCorporationWater(Pair(3,7))
        assertEquals( 900, totalWaterAllotted);
        assertEquals(270.0, totalCorporationWaterAllotted)
        assertEquals(630.0, totalBoreWellAllotted)
    }

    @Test
    fun verifyWaterAllottedToThreeBHK() {
        val apartment = Apartment(ApartmentType.THREE_BHK)
        val totalWaterAllotted = apartment.getTotalAllottedWaterPerMonth()
        val totalBoreWellAllotted = apartment.getAllottedAmountOfBorewellWater(Pair(3,7))
        val totalCorporationWaterAllotted = apartment.getAllottedAmountOfCorporationWater(Pair(3,7))
        assertEquals( 1500, totalWaterAllotted);
        assertEquals(450.0, totalCorporationWaterAllotted)
        assertEquals(1050.0, totalBoreWellAllotted)
    }
}