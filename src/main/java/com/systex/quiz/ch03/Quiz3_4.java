package com.systex.quiz.ch03;

import com.systex.quiz.ch03.util.HorseRacing;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Thread.sleep;

public class Quiz3_4 {

    public static void horseRacing() {

        Scanner scanner = new Scanner(System.in);
        int horseAmount = scanner.nextInt();
        HorseRacing horseRacingUI = new HorseRacing(horseAmount);
        horseRacingUI.setVisible(true);
        Thread horse[] = new Thread[horseAmount];
        AtomicInteger isWin = new AtomicInteger(0);/////////////////判斷是否已經有馬到終點，有的話=1

        // Todo Case
        for (int i = 0; i < horseAmount; i++) {
            int horseNum = i;

            horse[i] = new Thread(() -> {
                try {
                    int positon = 0;
                    int nextStep = 0;

                    while (positon < 100) {
                        positon = positon + nextStep;
                        horseRacingUI.setHorsePosition(horseNum+1, positon);
                        System.out.println(Thread.currentThread().getName()+ ":" + horseNum);
                        if (positon >= 100) {
                            positon = 100;
                            if (isWin.get() == 0) {
                                isWin.getAndIncrement();
                                horseRacingUI.setMessage("Horse " + (horseNum+1) + " win");
                            }
                        }

                        nextStep = (int) (Math.random() * 100) + 1;
                        sleep((int) (Math.random() * (3000 - 1000 + 1)) + 1000);
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            horse[i].start();

        }

    }

    public static void main(String[] args) {
        
        horseRacing();

    }

}
