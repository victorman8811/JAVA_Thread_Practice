package com.systex.quiz.ch01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;


public class Quiz1_1 {

    public String getValueByIndex(List<String> list, int index) {
        // Todo Case
        return list.get(index);
    }

    public List<String> insertValueToSpecificIndex(List<String> list, int index, String value) {
        // Todo Case
        list.add(index, value);
        return list;
    }

    public List<String> updateValueByIndex(List<String> list, int index, String value) {
        // Todo Case
        list.set(index, value);
        return list;
    }

    public List<String> removeValueByIndex(List<String> list, int index) {
        // Todo Case
        list.remove(index);
        return list;
    }

    public boolean checkValueExists(List<String> list, String value) {
        // Todo Case
        return list.contains(value);
    }

    public boolean checkListEmpty(List<String> list) {
        // Todo Case
        return list.isEmpty();
    }

    public List<String> sortList(List<String> list) {
        // Todo Case
        return Collections.emptyList();

    }

    public List<String> copyList(List<String> list) {
        // Todo Case
        ArrayList<String> ans = new ArrayList<String>();
        ans.addAll(list);
        return ans;
    }

    public List<String> extractList(List<String> list, int fromIndex, int toIndex) {
        // Todo Case
        return list.subList(fromIndex,toIndex);
    }

    public List<String> concatList(List<String> list1, List<String> list2) {
        // Todo Case
        ArrayList<String> ans = new ArrayList<String>();
        ans.addAll(list1);
        ans.addAll(list2);
        return ans;
    }

    public int maxNumber(List<Integer> list) {
        // Todo Case
        return 0;
    }

    public int sumAllNumbers(List<Integer> list) {
        // Todo Case
        return 0;
    }

    public int itemCounts(List<Integer> list) {
        // Todo Case
        return 0;
    }

}
