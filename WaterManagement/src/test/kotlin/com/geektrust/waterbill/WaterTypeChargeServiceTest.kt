package com.geektrust.waterbill

import com.geektrust.waterBill.BoreWellWaterChargeService
import com.geektrust.waterBill.CorporationWaterChargeService
import org.junit.Test
import kotlin.test.assertEquals

internal class WaterTypeChargeServiceTest {

    @Test
    fun verifyBoreWallWaterCharge() {
        val charge =  BoreWellWaterChargeService(amountUsed = 100.0).getCharge()
        assertEquals(150.0, charge)
    }

    @Test
    fun verifyCorporationWaterCharge() {
        val charge =  CorporationWaterChargeService(amountUsed = 100.0).getCharge()
        assertEquals(100.0, charge)
    }
}