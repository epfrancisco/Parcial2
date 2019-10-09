/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Estudiante
 */
public class Jdbc {
 
    
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/gestion_proveedores?serverTimezone=UTC";
    private Connection con;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public void conectarme() throws SQLException {

        try {
            setCon(DriverManager.getConnection(url, "proveedores", "123456789"));
            Class.forName(driver);
        } catch (ClassNotFoundException cl) {
            System.out.println(cl.getMessage());
        }
        
    }
}
