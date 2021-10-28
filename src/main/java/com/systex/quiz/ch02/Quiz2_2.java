package com.systex.quiz.ch02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Quiz2_2 {

    public List<Integer> squareNumbers(Collection<Integer> c) {
        // Todo Case
        return c.stream().map(s -> s * s).collect(Collectors.toList());
    }

    public List<String> filterLongerThan3CharsWords(Collection<String> c) {
        // Todo Case
        return c.stream().filter(s -> s.length() > 3).collect(Collectors.toList());
    }

    public List<String> uniqueValues(Collection<String> c) {
        // Todo Case
        return c.stream().distinct().collect(Collectors.toList());
    }

    public List<String> getFirst5Words(Collection<String> c) {
        // Todo Case
        return c.stream().limit(5).collect(Collectors.toList());
    }

    public List<String> skipFirstWords(Collection<String> c) {
        // Todo Case
        return c.stream().skip(1).collect(Collectors.toList());
    }

}
