package com.systex.quiz.ch01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CharCount {

    private final Map<Character, Integer> charCount = new HashMap<>();

    public CharCount(String s) {
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (charCount.containsKey(ch)) {
                charCount.put(ch, charCount.get(ch) + 1);
            } else {
                charCount.put(ch, 1);
            }
        }
    }

    public int count(char ch) {
        return charCount.getOrDefault(ch, 0);
    }

    public Set<Character> chars() {
        return charCount.keySet();
    }

    public int charsInCommon(CharCount anotherCharCount) {
        Set<Character> myChars = chars();
        Set<Character> theirChars = anotherCharCount.chars();

        theirChars.retainAll(myChars);
        return theirChars.size();
    }
}