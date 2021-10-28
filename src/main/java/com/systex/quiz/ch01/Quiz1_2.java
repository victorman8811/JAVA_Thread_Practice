package com.systex.quiz.ch01;

import java.util.*;

public class Quiz1_2 {

    public Set<String> insertValue(Set<String> set, String value) {
        // Todo Case
        set.add(value);
        return set;
    }

    public Set<String> removeValue(Set<String> set, String value) {
        // Todo Case
        set.remove(value);
        return set;
    }

    public boolean checkValueExists(Set<String> set, String value) {
        // Todo Case
        return set.contains(value);
    }

    public boolean checkSetEmpty(Set<String> set) {
        // Todo Case
        return set.isEmpty();
    }

    public Set<String> copySet(Set<String> set) {
        // Todo Case
        Set<String> ans = new HashSet<String>();
        ans.addAll(set);
        return ans;
    }

    public List<String> covertToList(Set<String> set) {
        // Todo Case
        List<String> ans=new ArrayList<>(set);
        return ans;
    }

    public int maxNumber(Set<Integer> list) {
        // Todo Case
        return Collections.max(list);
    }

    public int sumAllNumbers(Set<Integer> list) {
        // Todo Case
        return list.stream().mapToInt(Integer::intValue).sum();
    }

    public int itemCounts(Set<Integer> set) {
        // Todo Case
        return set.size();
    }
}
