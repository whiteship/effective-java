package me.whiteship.chapter01.item05;

import org.springframework.stereotype.Component;

import java.util.List;

public class DefaultDictionary implements Dictionary{

    @Override
    public boolean contains(String word) {
        return false;
    }

    @Override
    public List<String> closeWordsTo(String typo) {
        return null;
    }
}
