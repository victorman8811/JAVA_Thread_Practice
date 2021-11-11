package com.systex.quiz.ch03;

import com.systex.quiz.ch03.util.PrinterA;
import com.systex.quiz.ch03.util.PrinterB;

public class Quiz3_1 {

    public void printFromThreadByExtend(String msg) {
        // Todo Case
        Thread threadA = new PrinterA(msg);

        threadA.start();


    }

    public void printFromThreadByImplement(String msg) {
        // Todo Case
        Thread threadB = new Thread(new PrinterB(msg));

        threadB.start();
    }

}
