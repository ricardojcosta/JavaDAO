/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cado_
 */
public class DB {

    
    private static Connection conn = null;
    
  
    public static Connection getConnection() {
        if (conn == null) {
            Properties props = loadProperties();
            String url = props.getProperty("dburl");
            try {
                conn = DriverManager.getConnection(url, props);
                System.out.println("CONECTADO");
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }

        return conn;

    }

    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("DESCONECTADO");
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    private static Properties loadProperties() {
        try (FileInputStream fs = new FileInputStream("db.properties")) {
            Properties props = new Properties();
            props.load(fs);
            return props;
        } catch (IOException e) {
            throw new DbException(e.getMessage());
        }

    }
    
    public static void closeStatement(Statement st){
        if(st != null){
            try {
                st.close();
            } catch (SQLException e) {
                 throw new DbException(e.getMessage());
            }
        }
    } 
    
      public static void closeResultSet(ResultSet rs){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                 throw new DbException(e.getMessage());
            }
        }
    } 

}
