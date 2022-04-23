package com.geektrust.waterBill

enum class ApartmentType {

    TWO_BHK {
        override val peopleLivingIn = Constants.PEOPLE_IN_TWO_BEDROOM
    },

    THREE_BHK {
        override val peopleLivingIn = Constants.PEOPLE_IN_THREE_BEDROOM
    };

    abstract val peopleLivingIn: Int

}