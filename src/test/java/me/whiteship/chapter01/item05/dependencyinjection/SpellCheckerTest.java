package me.whiteship.chapter01.item05.dependencyinjection;

import me.whiteship.chapter01.item05.MockDictionary;
import org.junit.jupiter.api.Test;

class SpellCheckerTest {

    @Test
    void isValid() {
        SpellChecker spellChecker = new SpellChecker(MockDictionary::new);
        spellChecker.isValid("test");
    }

}