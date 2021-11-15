package com.systex.quiz.ch04;

import com.systex.quiz.ch4.Quiz4;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Quiz4Test {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setStreams() {
        System.setOut(new PrintStream(out));
    }

    @AfterEach
    void restoreInitialStreams() {
        System.setOut(originalOut);
    }

    @Test
    void dataInsertAndRead() {
        Quiz4 quiz = new Quiz4();
        String task_name = "xx7";
        String description = "uuu";

        int seq = quiz.insert(task_name, description);
        quiz.read(seq);
        assertEquals("task_seq: " + seq + "\r\n" + "task_name: " + task_name + "\r\n" + "description: " + description + "\r\n", out.toString());
    }

    @Test
    void dataDelete() {

        Quiz4 quiz = new Quiz4();
        int seq = 3;
        quiz.delete(seq);
        assertEquals(false, quiz.read(seq));


    }

    @Test
    void dataUpdate() {
        Quiz4 quiz = new Quiz4();
        int seq = 1;
        String task_name = "5x7";
        String description = "uuu";

        quiz.update(seq,task_name, description);
        quiz.read(seq);
        assertEquals("task_seq: " + seq + "\r\n" + "task_name: " + task_name + "\r\n" + "description: " + description + "\r\n", out.toString());
    }


}
