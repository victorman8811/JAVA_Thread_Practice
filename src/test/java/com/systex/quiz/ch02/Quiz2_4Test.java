package com.systex.quiz.ch02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Quiz2_4Test {
    static Quiz2_4 quiz;

    @BeforeAll
    static void beforeAll() {
        quiz = new Quiz2_4();
    }

    @Test
    void countWords() {
        Assertions.assertEquals(575343 , quiz.wordCounts());
        Assertions.assertEquals(22 , quiz.wordCounts("until"));
        Assertions.assertEquals(22 , quiz.wordCounts("UNTIL"));
        Assertions.assertEquals(3 , quiz.wordCounts("characteristically"));
    }

    @Test
    void getLongest10Words() {
        List<String> expected = Arrays.asList(
                "characteristically", "misunderstandings", "unapproachability", "superstitiousness", "contemporaneously",
                "enthusiastically", "circumstantially", "incomprehensible", "misunderstanding", "disillusionments"
        );
        List<String> res = quiz.getTopNLongerWords(10);
        Assertions.assertLinesMatch(expected, res);
    }
}
