package com.example.rollthedice

import org.junit.Assert.assertTrue
import org.junit.Test

class ExampleUnitTest {
    @Test
    /*fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

     */

    fun generates_number() {
        val dice = Dice(6)
        val rollResult = dice.roll()
        assertTrue("The value of rollResult was not between 1 and 6", rollResult in 1..6)
    }
}