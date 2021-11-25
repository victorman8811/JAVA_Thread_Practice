package com.systex.quiz.ch4;

import java.sql.*;


public class Quiz4 {

    public static void main(String args[]) {

        //insert("www", "hh");
        //delete(100);
        //read("www", "hh");
        //update(1,"yyy","ddd");
    }

    public static int insert(String task_name, String description) {

        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int id = 0;

        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres",
                            "postgres", "victor8811");


            String sql = "INSERT INTO task_table (task_name,description) VALUES (?,?)";
            ps = c.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setString(1, task_name);
            ps.setString(2, description);

            ps.executeUpdate();

            rs = ps.getGeneratedKeys();
            while (rs.next()) {
                id = rs.getInt(1);

            }

        } catch (Exception e) {
        }
        return id;
    }

    public static void delete(int task_seq) {

        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres",
                            "postgres", "victor8811");
            stmt = c.createStatement();

            String sql = "DELETE FROM task_table " +
                    "WHERE task_seq = " + task_seq;
            stmt.executeUpdate(sql);
        } catch (Exception e) {
        }
    }

    public static boolean read(int seq) {

        Connection c = null;
        Statement stmt = null;
        boolean dataExist = false;

        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres",
                            "postgres", "victor8811");
            stmt = c.createStatement();

            String sql = "SELECT task_seq, task_name, description FROM task_table WHERE task_seq = '" + seq + "'";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                //Retrieve by column name
                dataExist = true;
                int task_seq = rs.getInt("task_seq");
                String task_name = rs.getString("task_name");
                String description = rs.getString("description");

                //Display values
                System.out.println("task_seq: " + task_seq);
                System.out.println("task_name: " + task_name);
                System.out.println("description: " + description);

            }
            if (dataExist==false){
                return false;
            }
            rs.close();

        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static void update(int seq, String name, String description) {

        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres",
                            "postgres", "victor8811");
            stmt = c.createStatement();

            String sql = "UPDATE task_table " +
                    "SET task_name = '" + name + "',description = '" + description + "' WHERE task_seq = " + seq;
            stmt.executeUpdate(sql);
        } catch (Exception e) {
        }
    }


}
