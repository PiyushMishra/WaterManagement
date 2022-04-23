package com.geektrust.waterbill

import com.geektrust.waterBill.Command
import com.geektrust.waterBill.CommandsFromFile
import org.junit.Test
import kotlin.test.assertEquals

internal class ParseCommandFromFile {

    @Test
    fun parseCommandCorrectly()  {
        val filePath = "src/test/resources/input1.txt"
        val commandsList = CommandsFromFile.load(filePath)
        assertEquals("""[ALLOT_WATER TWO_BHK (3, 7), ADD_GUESTS 2, ADD_GUESTS 3, BILL]""", commandsList.toString())
    }

}