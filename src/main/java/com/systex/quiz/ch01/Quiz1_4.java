package com.systex.quiz.ch01;


import com.systex.quiz.ch01.util.Person;

import java.util.*;


public class Quiz1_4 {

    public Set<Person> getUnionFrom2Lists(List<Person> list1, List<Person> list2) {
        // Todo Case

        ArrayList<Person> temp1 = new ArrayList<Person>();
        ArrayList<Person> temp2 = new ArrayList<Person>();
        temp1.addAll(list1);
        temp2.addAll(list2);


        for (int i = 0; i < temp1.size(); i++) {

            for (int j = 0; j < temp2.size(); j++) {
                if (temp2.get(j).getName() == temp1.get(i).getName()) {
                    temp2.remove(j);
                }
            }

        }

        temp1.addAll(temp2);

        Set<Person> ans = new HashSet<Person>(temp1);

        return ans;

    }

    public Set<Person> getIntersectionFrom2Sets(Set<Person> set1, Set<Person> set2) {
        // Todo Case
        Set<Person> ans = new HashSet<Person>(set1);

        ans.retainAll(set2);

        return ans;
    }

}
