package com.systex.quiz.ch03;

import java.util.concurrent.atomic.AtomicInteger;

public class Quiz3_3 {

    public static void airConditioner() {
        // Todo Case


        AtomicInteger nowTemp = new AtomicInteger(28);
        AtomicInteger setTemp = new AtomicInteger();

        Thread tempAdjuster = new Thread() {

            @Override
            public void run() {
                int count = 0;

                while (count < 5) {

                    if (count == 0) {
                        try {
                            sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.print("NOWTEMP:");
                    }
                    count = count + 1;

                    if (count == 5) {
                        count = 0;
                    }

                    System.out.print(nowTemp.get() + " ");

                    if (setTemp.get() > nowTemp.get() && setTemp.get() != nowTemp.get()) {
                        nowTemp.set(nowTemp.get() + 1);
                    } else if (setTemp.get() < nowTemp.get() && setTemp.get() != nowTemp.get()) {

                        nowTemp.set(nowTemp.get() - 1);

                    }
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }

        };

        Thread randomSetter = new Thread() {

            @Override
            public void run() {

                while (true) {

                    int random = 0;
                    random = (int) (Math.random() * (30 - 20 + 1)) + 20;

                    setTemp.set(random);

                    System.out.println();
                    System.out.println("settemp:" + setTemp.get());


                    try {
                        sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                }
            }
        };


        randomSetter.start();
        tempAdjuster.start();


    }

    public static void grabMarbles() {
        // Todo Case

        AtomicInteger marble = new AtomicInteger(20000);
        AtomicInteger playerOne = new AtomicInteger(0);
        AtomicInteger playerTwo = new AtomicInteger(0);

        Thread contestantOne = new Thread() {

            @Override
            public void run() {

                while (marble.get() > 0) {

                    marble.decrementAndGet();
                    playerOne.set(playerOne.get()+1);


                }
                System.out.println("Player one has:"+playerOne.get());


            }


        };

        Thread contestantTwo = new Thread() {

            @Override
            public void run() {

                while (marble.get() > 0) {

                    marble.decrementAndGet();
                    playerTwo.set(playerTwo.get()+1);

                }
                System.out.println("Player two has:"+playerTwo.get());


            }
        };

        contestantOne.start();
        contestantTwo.start();



    }

    public static void main(String[] args) {
        // For Test Purpose
        grabMarbles();
    }
}
