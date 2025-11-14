/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproyectpoo.Models;

import java.sql.Date;


/**
 *
 * @author manue
 */
public class ExamenComplementario {
    private int id_examen_complementario;
    private String tipo_examen;
    private Date fecha_examen;
    private String resultado;
    private String observacion;
    private int id_historia;

    public ExamenComplementario(int id_examen_complementario, String tipo_examen, Date fecha_examen, 
            String resultado, String observacion, int id_historia) {
        this.id_examen_complementario = id_examen_complementario;
        this.tipo_examen = tipo_examen;
        this.fecha_examen = fecha_examen;
        this.resultado = resultado;
        this.observacion = observacion;
        this.id_historia = id_historia;
    }
  
    public ExamenComplementario(String tipo_examen, Date fecha_examen, String resultado, String observacion, int id_historia) {
        this.tipo_examen = tipo_examen;
        this.fecha_examen = fecha_examen;
        this.resultado = resultado;
        this.observacion = observacion;
        this.id_historia = id_historia;
    }

    public ExamenComplementario() {
       
    }

    
    //Se agregan los getters 
    public int getId_examen_complementario() {
        return id_examen_complementario;
    }

    public String getTipo_examen() {
        return tipo_examen;
    }

    public Date getFecha_examen() {
        return fecha_examen;
    }

    public String getResultado() {
        return resultado;
    }

    public String getObservacion() {
        return observacion;
    }

    public int getId_historia() {
        return id_historia;
    }
    
    //Se agregan los setters
    public void setId_examen_complementario(int id_examen_complementario) {
        this.id_examen_complementario = id_examen_complementario;
    }

    public void setTipo_examen(String tipo_examen) {
        this.tipo_examen = tipo_examen;
    }

    public void setFecha_examen(Date fecha_examen) {
        this.fecha_examen = fecha_examen;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public void setId_historia(int id_historia) {
        this.id_historia = id_historia;
    }

    @Override
    public String toString() {
        return "ExamenComplementario{" + "id_examen_complementario=" + id_examen_complementario 
                + ", tipo_examen=" + tipo_examen + ", fecha_examen=" + fecha_examen 
                + ", resultado=" + resultado + ", observacion=" + observacion 
                + ", id_historia=" + id_historia + '}';
    }

    
}
