/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psychiatric;

import java.sql.*;

/**
 *
 * @author Elvis
 */
public class SQLDataBase {
    
    
    static final String DB_URL = "jdbc:mysql://localhost:3306/Psychiatric";
    static final String DB_DRV = "com.mysql.jdbc.Driver";
    static final String DB_USER = "root";
    static final String DB_PASSWD = "";
    
    public static void InsertStatement(){
        
    }
    
    public static void UpdateStatement(){
        
    }
    
    public static void DeleteStatement(){
        
    }
    
    public static ResultSet SelectStatement(){
        
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM Patient");
            
        } catch (SQLException ex) {
            System.out.println("Error1:" + ex);
        } finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException ex) {
                System.out.println("Error2:" + ex);
            }
        }
        return resultSet;
    }

    public static void main(String[] args) {

        /**
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM Patient");
            while (resultSet.next()) {
                System.out.printf("%s\t%s\n\t%s\n\t\n",
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(4));
            }
        } catch (SQLException ex) {
            System.out.println("Error1:" + ex);
        } finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException ex) {
                System.out.println("Error2:" + ex);
            }
        }
        */
        
        try {
            
            ResultSet resultSet = SelectStatement();
            while (resultSet.next()) {
                System.out.printf("%s\t%s\n\t%s\n\t\n",
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(4));
            }
        } catch (SQLException ex) {
            System.out.println("Error1:" + ex);
    }
}
}
