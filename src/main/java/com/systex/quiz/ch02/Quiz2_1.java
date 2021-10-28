package com.systex.quiz.ch02;

import java.util.*;
import java.util.stream.*;

public class Quiz2_1 {

    public int maxNumber(Collection<Integer> c) {
        // Todo Case
        Integer ans = c.stream().max(Integer::compare).get();
        return ans;
    }

    public int sumAllNumbers(Collection<Integer> c) {
        // Todo Case
        Integer sum = c.stream().mapToInt(Integer::intValue).sum();
        return sum;
    }

    public int itemCounts(Collection<Integer> c) {
        // Todo Case
        long temp = c.stream().count();
        int ans = (int) temp;
        return ans;
    }

    public boolean allNumbersBiggerThan10(Collection<Integer> c) {
        // Todo Case
        List<Integer> ans = new ArrayList<Integer>();
        ans = c.stream().filter(s -> s.intValue() < 10).collect(Collectors.toList());
        if (ans.isEmpty() == false) {

            return false;

        } else
            return true;
    }

    public boolean anyNumberBiggerThan10(Collection<Integer> c) {
        // Todo Case
        List<Integer> ans = new ArrayList<Integer>();
        ans = c.stream().filter(s -> s.intValue() > 10).collect(Collectors.toList());
        if (ans.isEmpty() == true) {

            return false;

        } else
            return true;

    }

}
