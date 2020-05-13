package com.ssm.test;

import com.mysql.jdbc.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class JdbcTest {
    public static void main(String[] args) throws Exception {
        Connection con = null;
        PreparedStatement preStat = null;
        ResultSet rst = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mytest";
            String user = "root";
            String passport = "888116";
            con = DriverManager.getConnection(url,user,passport);

            String sql = "select * from tb_user where id = ?";
            preStat = (PreparedStatement) con.prepareStatement(sql);
            preStat.setLong(1, 1L);
            rst = preStat.executeQuery();

            while (rst.next()) {
                System.out.println(rst.getString("user_name"));
                System.out.println(rst.getString("name"));
                System.out.println(rst.getInt("age"));
                System.out.println(rst.getDate("birthday"));
            }
        } finally {
            if (rst != null) {
                rst.close();
            }
            if (preStat != null) {
                preStat .close();
            }
            if (con != null) {
                con.close();
            }



        }


    }



}
