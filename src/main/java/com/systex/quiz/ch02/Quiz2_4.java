package com.systex.quiz.ch02;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Quiz2_4 {
    private List<String> contentWords;

    public Quiz2_4() {
        URL fileURL = this.getClass().getClassLoader().getResource("war-and-peace.txt");
        try {
            String contents = new String(Files.readAllBytes(new File(fileURL.getFile()).toPath()));
            contentWords = Arrays.asList(contents.split("[\\P{L}]+"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Can't get resource file");
        }
    }


    public int wordCounts() {
        // Todo Case
        Long count = contentWords.stream().count();
        return count.intValue();
    }

    public int wordCounts(String target) {
        // Todo Case
        Long count = contentWords.stream().filter(target::equalsIgnoreCase).count();
        int ans = count.intValue();
        return ans;
    }

    public List<String> getTopNLongerWords(int n) {
        // Todo Case
        Set<String> tempSet = contentWords.stream().map(name -> name.toLowerCase()).collect(toSet());
        List<String> tempList = new ArrayList<>(tempSet);
        List<String> ans = tempList.stream().sorted(Comparator.comparing(String::length).reversed()).limit(n).collect(toList());
        System.out.println(ans);
        return ans;
    }

}
