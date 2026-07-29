package org.example.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static final String URL = "jdbc:postgresql://localhost:5432/BD_LA";
    private static final String USUARIO = "postgres";
    private static final String PASSWORD = "root";

    public static Connection conectar(){

        try {

            Connection conexion = DriverManager.getConnection(
                    URL,
                    USUARIO,
                    PASSWORD
            );

            System.out.println("Conexion exitosa");

            return conexion;

        } catch(SQLException e){

            e.printStackTrace();
            return null;
        }
    }
}