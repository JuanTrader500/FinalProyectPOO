/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproyectpoo.Models;

/**
 *
 * @author manue
 */
public class Diagnostico {
    private int id_diagnostico;
    private String diagnstico_presuntivo;
    private String diagnostico_definitivo;
    private String evolucion;
    private String pronostico;
    private String tratamiento;
    private int id_historia;

    public Diagnostico(int id_diagnostico, String diagnstico_presuntivo, 
            String diagnostico_definitivo, String evolucion, String pronostico, 
            String tratamiento, int id_historia) {
        this.id_diagnostico = id_diagnostico;
        this.diagnstico_presuntivo = diagnstico_presuntivo;
        this.diagnostico_definitivo = diagnostico_definitivo;
        this.evolucion = evolucion;
        this.pronostico = pronostico;
        this.tratamiento = tratamiento;
        this.id_historia = id_historia;
    }
 public Diagnostico(String diagnstico_presuntivo, 
            String diagnostico_definitivo, String evolucion, String pronostico, 
            String tratamiento, int id_historia) {
        this.diagnstico_presuntivo = diagnstico_presuntivo;
        this.diagnostico_definitivo = diagnostico_definitivo;
        this.evolucion = evolucion;
        this.pronostico = pronostico;
        this.tratamiento = tratamiento;
        this.id_historia = id_historia;
    }
 
    // Se agregan los getters
    public int getId_diagnostico() {
        return id_diagnostico;
    }

    public String getDiagnstico_presuntivo() {
        return diagnstico_presuntivo;
    }

    public String getDiagnostico_definitivo() {
        return diagnostico_definitivo;
    }

    public String getEvolucion() {
        return evolucion;
    }

    public String getPronostico() {
        return pronostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public int getId_historia() {
        return id_historia;
    }
     
    //Se agregan los setters
    public void setId_diagnostico(int id_diagnostico) {
        this.id_diagnostico = id_diagnostico;
    }

    public void setDiagnstico_presuntivo(String diagnstico_presuntivo) {
        this.diagnstico_presuntivo = diagnstico_presuntivo;
    }

    public void setDiagnostico_definitivo(String diagnostico_definitivo) {
        this.diagnostico_definitivo = diagnostico_definitivo;
    }

    public void setEvolucion(String evolucion) {
        this.evolucion = evolucion;
    }

    public void setPronostico(String pronostico) {
        this.pronostico = pronostico;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public void setId_historia(int id_historia) {
        this.id_historia = id_historia;
    }

    @Override
    public String toString() {
        return "Diagnostico{" + "id_diagnostico=" + id_diagnostico + ", diagnstico_presuntivo=" + diagnstico_presuntivo 
                + ", diagnostico_definitivo=" + diagnostico_definitivo + ", evolucion=" + evolucion + ", pronostico=" + pronostico 
                + ", tratamiento=" + tratamiento + ", id_historia=" + id_historia + '}';
    }
    
}
 