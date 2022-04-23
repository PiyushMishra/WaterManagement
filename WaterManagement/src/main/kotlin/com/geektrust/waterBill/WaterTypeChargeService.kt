package com.geektrust.waterBill

abstract class WaterChargeService(private val unitPrice: Double, open val amountUsed: Double) {
    open fun getCharge(): Double = amountUsed * unitPrice
}

class BoreWellWaterChargeService(unitPrice: Double = 1.5, override val amountUsed: Double): WaterChargeService(unitPrice, amountUsed)

class CorporationWaterChargeService(unitPrice: Double = 1.0, override val amountUsed: Double): WaterChargeService(unitPrice, amountUsed)

