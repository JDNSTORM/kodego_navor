package activity_01_d

import mu.KotlinLogging

/*
    Create an application that will accept 5 monetary amounts.

    After the input is done, the user will be asked “Divide the value by how many?”. It will only accept an Integer as input.
    The total of the 5  input will be divided by the answer in the second question input.

    Note: Error checking must be done.

    *** I still used print for readability of inputs

    # Update
    Implemented Data Structures
    activity_01_d
 */

private val logger = KotlinLogging.logger {  }
fun main() {
    var value1: Double? = null
    var value2: Double? = null
    var value3: Double? = null
    var value4: Double? = null
    var value5: Double? = null
    var divisor: Int? = null
    var sum: Double = 0.0
    var quotient: Double? = null

    // Value Entry
    print("Enter Value 1: ")
    value1 = readln().let {
        var valid = false
        if (it.toDoubleOrNull() == null) {
            logger.error { "Entered an invalid value. Value is considered as 0.0" }
            0.0
        }else{
            it.toDouble()
        }
    }

    print("Enter Value 2: ")
    value2 = readln().let {
        if (it.toDoubleOrNull() == null) {
            logger.error { "Entered an invalid value. Value is considered as 0.0" }
            return@let 0.0
        }else{
            it.toDouble()
        }
    }

    print("Enter Value 3: ")
    value3 = readln().let {
        if (it.toDoubleOrNull() == null) {
            logger.error { "Entered an invalid value. Value is considered as 0.0" }
            return@let 0.0
        }else{
            it.toDouble()
        }
    }

    print("Enter Value 4: ")
    value4 = readln().let {
        if (it.toDoubleOrNull() == null) {
            logger.error { "Entered an invalid value. Value is considered as 0.0" }
            return@let 0.0
        }else{
            it.toDouble()
        }
    }

    print("Enter Value 5: ")
    value5 = readln().let {
        if (it.toDoubleOrNull() == null) {
            logger.error { "Entered an invalid value. Value is considered as 0.0" }
            return@let 0.0
        }else{
            it.toDouble()
        }
    }

    sum = value1 + value2 + value3 + value4 + value5
    logger.info("Total Sum of the Values = $sum")

    print("Divide the value by how many? ")
    divisor = readln().let {
        if (it.toIntOrNull() == null) {
            logger.error { "Entered an invalid value. Value is considered as 0.0" }
            return@let 0
        }else{
            it.toInt()
        }
    }

    quotient = sum / divisor.toDouble()
    logger.info{"Quotient = $quotient"}
}