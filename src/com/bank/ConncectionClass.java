package com.tenbits.bank;

import java.sql.*;

public class ConncectionClass {
    public static void connect(String qs){
        String url = "jdbc:mysql://localhost/bankdb";
        String user = "root";
        String password = "root";
        try {
            Connection myConn = DriverManager.getConnection(url,user,password);
            Statement myStmt = myConn.createStatement();
            String sql = qs;

                int statusFromInsert = myStmt.executeUpdate(sql);
                    if(statusFromInsert > 0){
                        System.out.println("Deletion Successfull:");
                     }
                    else{
                        System.out.println("There were some problems with User ACcount");
                    }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}




 /*  ResultSet rs = myStmt.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getString("Balance"));
            }*/