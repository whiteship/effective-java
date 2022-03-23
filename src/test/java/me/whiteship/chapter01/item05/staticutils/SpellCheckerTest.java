package me.whiteship.chapter01.item05.staticutils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpellCheckerTest {

    @Test
    void isValid() {
        assertTrue(SpellChecker.isValid("test"));
    }

}