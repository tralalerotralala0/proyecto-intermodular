package com.proyecto.EscaleritaProyect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConeccion {
	private static final String URL = "jdbc:mysql://localhost:33306/EscaleritaGame";
    private static final String USER = "root";
    private static final String PASSWORD = "alumnoalumno";
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
