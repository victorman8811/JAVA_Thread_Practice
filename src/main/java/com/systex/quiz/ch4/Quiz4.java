package com.systex.quiz.ch4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Quiz4 {

    public static void main(String args[]) {

        insert(1,"www","hh");
    }

    public static void insert(int task_seq,String task_name,String description){

        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres",
                            "postgres", "victor8811");
            stmt = c.createStatement();

            String sql = "INSERT INTO task_table " +
                    "VALUES ("+task_seq+",'"+task_name+"','"+description+"')";
            stmt.executeUpdate(sql);
        } catch (Exception e) {
        }
    }









}
