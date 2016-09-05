package com.xi.service;

import java.sql.*;

/**
 * Created by mayned on 2016/9/5.
 */
public class JDBCPerson {
    public static void main(String[] args){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xi?characterEncoding=utf-8", "root", "123456");
            String sql = "select * from person where name= ? ";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"阿喜");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getString("name")+resultSet.getInt("age"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //释放资源
            if(resultSet!=null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if(preparedStatement!=null){
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
