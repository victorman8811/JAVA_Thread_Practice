package com.systex.quiz.ch03;

import static java.lang.Thread.sleep;

public class Quiz3_2 {

    public Thread happyNewYear() {
        Thread countDown = new Thread(() -> {
            // Todo Case
            System.out.print("3...");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.print("2...");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.print("1...");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("Happy New Year!");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
            }
        });
        countDown.start();
        return countDown;
    }

    public void eatHamburger() {
        Thread burgerQueen = new Thread(() -> {
            System.out.println("Tom's burger is done!");
        });
        burgerQueen.start();

        // Todo Case

        try {
            burgerQueen.join();
        } catch (InterruptedException e) {
        }


        System.out.println("*Tom is eating burger, Yum-yum...");

    }

}
