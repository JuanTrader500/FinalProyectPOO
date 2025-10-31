/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproyectpoo.comboBox;

import com.mycompany.finalproyectpoo.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class RellenarCombos {

    // Método para llenar el combo con varias columnas (por ejemplo: nombre + cédula)
    public void RellenarComboBox(String tabla, String columna1, String columna2, JComboBox combo) {
        String sql = "SELECT " + columna1 + ", " + columna2 + " FROM " + tabla + ";";

        try {
            Connection conexion = Conexion.conectar();
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);

            combo.removeAllItems(); // Limpia el combo antes de llenarlo

            while (rs.next()) {
                // Concatenar las columnas (por ejemplo: "Juan Pérez - 12345678")
                String item = rs.getString(columna1) + " - " + rs.getString(columna2);
                combo.addItem(item);
            }

            rs.close();
            st.close();
            conexion.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al llenar el combo: " + e.getMessage());
        }
    }
}


