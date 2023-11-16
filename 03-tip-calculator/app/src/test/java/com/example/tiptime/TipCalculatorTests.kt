package com.example.tiptime

import android.icu.text.NumberFormat
import junit.framework.TestCase.assertEquals
import org.junit.Test

class TipCalculatorTests {
    @Test
    fun calculateTip_20PercentNoRoundUp() {
        val amount = 10.00
        val tipPercent = 20.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount, tipPercent, false)
        assertEquals(actualTip, expectedTip)
    }
}