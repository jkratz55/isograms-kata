package io.jkratz.katas.isograms;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {

    @Test
    public void testNonIsogram() {
        assertEquals(false, StringUtils.isIsogram("aba"));
        assertEquals(false, StringUtils.isIsogram("moose"));
    }

    @Test
    public void testIsogram() {
        assertEquals(true, StringUtils.isIsogram("Dermatoglyphics"));
    }

    @Test
    public void testEmptyString() {
        assertEquals(true, StringUtils.isIsogram(""));
    }
}
