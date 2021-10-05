package com.systex.quiz.ch03;

public class Quiz3_2 {

    public Thread happyNewYear() {
        Thread countDown = new Thread(() -> {
            // Todo Case
        });
        countDown.start();
        return countDown;
    }

    public void eatHamburger () {
        Thread burgerQueen = new Thread(() -> {
            System.out.println("Tom's burger is done!");
        });
        burgerQueen.start();

        // Todo Case

        System.out.println("*Tom is eating burger, Yum-yum...");
    }

}
