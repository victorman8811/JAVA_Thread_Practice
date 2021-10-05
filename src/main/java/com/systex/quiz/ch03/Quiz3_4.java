package com.systex.quiz.ch03;

import com.systex.quiz.ch03.util.HorseRacing;

import static java.lang.Thread.sleep;

public class Quiz3_4 {

    public static void horseRacing() {
        int horseAmount = 2;
        HorseRacing horseRacingUI = new HorseRacing(horseAmount);
        horseRacingUI.setVisible(true);

        // Todo Case
        Thread horse1 = new Thread(() -> {
            try {
                horseRacingUI.setHorsePosition(1, 50);
                sleep(2000);
                horseRacingUI.setHorsePosition(1, 100);
                horseRacingUI.setMessage("Horse 1 win");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread horse2 = new Thread(() -> {
            try {
                horseRacingUI.setHorsePosition(2, 10);
                sleep(1000);
                horseRacingUI.setHorsePosition(2, 70);
                sleep(2000);
                horseRacingUI.setHorsePosition(2, 100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        horse1.start();
        horse2.start();
    }

    public static void main(String[] args) {
        horseRacing();
    }

}
