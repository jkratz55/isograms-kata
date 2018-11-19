package io.jkratz.katas.isograms

import junit.framework.Assert.assertEquals
import org.junit.Test

class StringExtensionsTest {

    @Test
    fun testNonIsogram() {
        assertEquals(false, "aba".isogram())
        assertEquals(false, "moose".isogram())
    }

    @Test
    fun testIsogram() {
        assertEquals(true, "Dermatoglyphics".isogram())
    }

    @Test
    fun testEmptyString() {
        assertEquals(true, "".isogram())
    }
}