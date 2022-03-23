package me.whiteship.chapter01.item05;

import java.util.List;

public class MockDictionary implements Dictionary{
    @Override
    public boolean contains(String word) {
        return false;
    }

    @Override
    public List<String> closeWordsTo(String typo) {
        return null;
    }
}
