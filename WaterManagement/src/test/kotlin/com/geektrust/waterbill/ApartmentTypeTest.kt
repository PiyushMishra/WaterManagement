package com.geektrust.waterbill

import com.geektrust.waterBill.ApartmentType
import org.junit.Test
import kotlin.test.assertEquals

internal class ApartmentTypeTest {

    @Test
    fun verifyPeopleLivingInTwoBHK() {
        assertEquals(3, ApartmentType.TWO_BHK.peopleLivingIn);
    }

    @Test
    fun verifyPeopleLivingInThreeBHK() {
        assertEquals( 5, ApartmentType.THREE_BHK.peopleLivingIn);
    }
}