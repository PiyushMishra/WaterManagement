package com.geektrust.waterbill

import com.geektrust.waterBill.CommandsFromFile
import com.geektrust.waterBill.WaterBillCalculator
import kotlin.test.Test
import kotlin.test.assertEquals

internal class WaterBillCalculatorTest {

    @Test
    fun calculateBillForInputOne() {
        val filePath = "src/test/resources/input1.txt"
        val commands = CommandsFromFile.load(filePath)
        assertEquals( "2400 5215", WaterBillCalculator.generateBill(commands));
    }

    @Test
    fun calculateBillForInputTwo() {
        val filePath = "src/test/resources/input2.txt"
        val commands = CommandsFromFile.load(filePath)
        assertEquals( "3000 5750", WaterBillCalculator.generateBill(commands));
    }

    @Test
    fun calculateBillForInputThree() {
        val filePath = "src/test/resources/input3.txt"
        val commands = CommandsFromFile.load(filePath)
        assertEquals( "900 1200", WaterBillCalculator.generateBill(commands));
    }

    @Test
    fun calculateBillForInputFour() {
        val filePath = "src/test/resources/input4.txt"
        val commands = CommandsFromFile.load(filePath)
        assertEquals("4500 13625", WaterBillCalculator.generateBill(commands));
    }

    @Test
    fun manualTest() {
        val filePath = "src/test/resources/input5.txt"
        val commands = CommandsFromFile.load(filePath)
        assertEquals("4500 13625", WaterBillCalculator.generateBill(commands));
    }
}