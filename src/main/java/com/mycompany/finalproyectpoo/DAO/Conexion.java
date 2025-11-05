/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproyectpoo.DAO;

/**
 *
 * @author juana
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    // Dirección del servidor MySQL
    private static final String URL = "jdbc:mysql://localhost:3306/veterinaria";

    // Usuario y contraseña de MySQL (ajusta si usas otros)
    private static final String USER = "root";
    private static final String PASSWORD = "12345678";

    // Método que devuelve una conexión activa a la base de datos
    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
