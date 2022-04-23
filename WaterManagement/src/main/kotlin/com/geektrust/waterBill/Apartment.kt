package com.geektrust.waterBill

data class Apartment(val apartmentType: ApartmentType, val waterConsumptionBySinglePerson: Int = 10) {

    fun getTotalAllottedWaterPerMonth() = apartmentType.peopleLivingIn* waterConsumptionBySinglePerson * Constants.DAYS

    fun getAllottedAmountOfCorporationWater(corporateToBoreWellRatio: Pair<Int, Int>): Double {
        return getTotalAllottedWaterPerMonth() * (corporateToBoreWellRatio.first.toDouble() / (corporateToBoreWellRatio.first + corporateToBoreWellRatio.second))
    }

    fun getAllottedAmountOfBorewellWater(corporateToBoreWellRation: Pair<Int, Int>): Double {
       return getTotalAllottedWaterPerMonth() * (corporateToBoreWellRation.second.toDouble() / (corporateToBoreWellRation.first + corporateToBoreWellRation.second))
    }
}
