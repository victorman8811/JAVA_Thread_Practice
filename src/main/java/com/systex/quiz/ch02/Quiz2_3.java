package com.systex.quiz.ch02;

import com.systex.quiz.ch02.util.Grade;
import com.systex.quiz.ch02.util.PiggyBank;

import java.util.*;
import java.util.stream.Collectors;

public class Quiz2_3 {

    public int sumOddNumbers(Collection<Integer> c) {

        int ans = c.stream().filter(x -> x % 2 == 1).mapToInt(Integer::intValue).sum();

        return ans;

    }

    public Map<String, Integer> convertListToMap(List<Grade> c) {
        // Todo Case
        Map<String, Integer> ans = c.stream().collect(Collectors.toMap(Grade::getGrade, Grade::getPoint));

        return ans;
    }

    public List<Integer> convertMapToList(Map<String, Integer> c) {
        // Todo Case
        List<String> keyList = c.keySet().stream().collect(Collectors.toList());
        List<Integer> value = c.values().stream().collect(Collectors.toList());
        List<Integer> ans = new ArrayList<Integer>();

        for(int i =0;i< keyList.size();i++){

            char temp = keyList.get(i).charAt(0);
            int index = temp-97;
            ans.add(index,value.get(i));

        }
        System.out.println(ans);

        return ans;
    }

    public Map<String, List<PiggyBank>> groupPiggyBankByColor(Collection<PiggyBank> c) {
        // Todo Case
        Map<String, List<PiggyBank>> ans = c.stream().collect(Collectors.groupingBy(PiggyBank::getColor));
        return ans;
    }

    // into another stream
    // flatMap

}
