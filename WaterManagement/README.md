This is water management solution.

Code is written in kotlin

Also you can edit commands in src/test/resources/input5.txt and expected value and see the manualTest in src/test/kotlin/com/geektrust/waterbill/WaterBillCalculatorTest.kt and run it using ./gradlew test on console. Other 4 test cases related to sample data.

@Test
    fun manualTest() {
        val filePath = "src/test/resources/input5.txt"
        val commands = CommandsFromFile.load(filePath)
        assertEquals("4500 13625", WaterBillCalculator.generateBill(commands));
    }
