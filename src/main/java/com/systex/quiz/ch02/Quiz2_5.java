package com.systex.quiz.ch02;

import java.util.*;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Quiz2_5 {
    public Map<String, Long> mapReduceWordCount(String input) {
        // TODO
        input = input.replace("!", "");
        input = input.replace(",", "");
        List<String> myList = new ArrayList<String>(Arrays.asList(input.split(" ")));
        Map<String, Long> ans = myList.stream().collect(groupingBy(Function.identity(), Collectors.counting()));
        return ans;
    }

}
