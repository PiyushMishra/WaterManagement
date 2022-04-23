package com.geektrust.waterBill

object WaterBillCalculator {

    fun generateBill(commands: List<Command>): String {

        var totalWaterConsumption: Double = 0.0;
        var totalWaterBill: Double = 0.0
        var totalGuests = 0
        var waterConsumedByGuest: Double = 0.0

        fun getBill(): Double {
            var guestBill: Double = 0.0;

            if (waterConsumedByGuest < 500) {
                guestBill = waterConsumedByGuest * 2;
            }
            if (waterConsumedByGuest > 500) {
                guestBill = 500 * 2 + (waterConsumedByGuest - 500) * 3;
            }
            if (waterConsumedByGuest > 1500) {
                guestBill = 500 * 2 + 1000 * 3 + (waterConsumedByGuest - 1500) * 5;
            }
            if (waterConsumedByGuest > 3000) {
                guestBill =
                    500 * 2 + 1000 * 3 + 1500 * 5 + (waterConsumedByGuest - 3000) * 8;
            }
            return guestBill
        }

         fun getTotalBill() {
            totalWaterConsumption += waterConsumedByGuest
            totalWaterBill += getBill()
         }

         fun waterConsumedByGuests(command: ADDGuests) {
            totalGuests += command.noOfGuests
            waterConsumedByGuest = 10.0 * totalGuests * 30
        }

         fun estimateCorporateAndBoreWater(command: AllotWater) {
            val apartment = Apartment(command.apartmentType)
            val totalWaterAllotted = apartment.getTotalAllottedWaterPerMonth();
            val totalCorporateWaterConsumed =
                apartment.getAllottedAmountOfCorporationWater(command.corporateToBoreWellRatio)
            val totalBoreWellWaterAllotWater =
                apartment.getAllottedAmountOfBorewellWater(command.corporateToBoreWellRatio)
            totalWaterConsumption += totalWaterAllotted
            totalWaterBill += BoreWellWaterChargeService(amountUsed = totalBoreWellWaterAllotWater).getCharge()
            totalWaterBill += CorporationWaterChargeService(amountUsed = totalCorporateWaterConsumed).getCharge()
        }

        fun executeCommands(commands: List<Command>) {
            commands.map { command ->
                when (command) {
                    is AllotWater -> {
                        estimateCorporateAndBoreWater(command)
                    }
                    is ADDGuests -> {
                        waterConsumedByGuests(command)
                    }
                    is BILL -> {
                        getTotalBill()
                    }
                }
            }
        }
        executeCommands(commands)
        return ("${totalWaterConsumption.toInt()} ${totalWaterBill.toInt()}")
    }
}