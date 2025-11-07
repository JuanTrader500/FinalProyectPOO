/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproyectpoo.Models;

/**
 *
 * @author manue
 */
public class ExamenFisico {
    private int id_examen_fisico;
    private String condicion_corporal;
    private String temperatura;
    private String frecuencia_respiratoria;
    private String frecuencia_cardiaca;
    private String relleno_capilar;
    private String pulso;
    private String mucosas;
    private String deshidratacion;
    private String observaciones;
    private int id_historia;

    public ExamenFisico(int id_examen_fisico, String condicion_corporal, String temperatura, 
            String frecuencia_respiratoria, String frecuencia_cardiaca, String relleno_capilar, 
            String pulso, String mucosas, String deshidratacion, String observaciones, int id_historia) {
        this.id_examen_fisico = id_examen_fisico;
        this.condicion_corporal = condicion_corporal;
        this.temperatura = temperatura;
        this.frecuencia_respiratoria = frecuencia_respiratoria;
        this.frecuencia_cardiaca = frecuencia_cardiaca;
        this.relleno_capilar = relleno_capilar;
        this.pulso = pulso;
        this.mucosas = mucosas;
        this.deshidratacion = deshidratacion;
        this.observaciones = observaciones;
        this.id_historia = id_historia;
    }
 
    public ExamenFisico(String condicion_corporal, String temperatura, 
            String frecuencia_respiratoria, String frecuencia_cardiaca, String relleno_capilar, 
            String pulso, String mucosas, String deshidratacion, String observaciones, int id_historia) {
        
        this.condicion_corporal = condicion_corporal;
        this.temperatura = temperatura;
        this.frecuencia_respiratoria = frecuencia_respiratoria;
        this.frecuencia_cardiaca = frecuencia_cardiaca;
        this.relleno_capilar = relleno_capilar;
        this.pulso = pulso;
        this.mucosas = mucosas;
        this.deshidratacion = deshidratacion;
        this.observaciones = observaciones;
        this.id_historia = id_historia;
    }
    public int getId_examen_fisico() {
        return id_examen_fisico;
    }

    public String getCondicion_corporal() {
        return condicion_corporal;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public String getFrecuencia_respiratoria() {
        return frecuencia_respiratoria;
    }

    public String getFrecuencia_cardiaca() {
        return frecuencia_cardiaca;
    }

    public String getRelleno_capilar() {
        return relleno_capilar;
    }

    public String getPulso() {
        return pulso;
    }

    public String getMucosas() {
        return mucosas;
    }

    public String getDeshidratacion() {
        return deshidratacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public int getId_historia() {
        return id_historia;
    }

    public void setId_examen_fisico(int id_examen_fisico) {
        this.id_examen_fisico = id_examen_fisico;
    }

    public void setCondicion_corporal(String condicion_corporal) {
        this.condicion_corporal = condicion_corporal;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public void setFrecuencia_respiratoria(String frecuencia_respiratoria) {
        this.frecuencia_respiratoria = frecuencia_respiratoria;
    }

    public void setFrecuencia_cardiaca(String frecuencia_cardiaca) {
        this.frecuencia_cardiaca = frecuencia_cardiaca;
    }

    public void setRelleno_capilar(String relleno_capilar) {
        this.relleno_capilar = relleno_capilar;
    }

    public void setPulso(String pulso) {
        this.pulso = pulso;
    }

    public void setMucosas(String mucosas) {
        this.mucosas = mucosas;
    }

    public void setDeshidratacion(String deshidratacion) {
        this.deshidratacion = deshidratacion;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public void setId_historia(int id_historia) {
        this.id_historia = id_historia;
    }

    @Override
    public String toString() {
        return "ExamenFisico{" + "id_examen_fisico=" + id_examen_fisico + ", condicion_corporal=" + condicion_corporal 
                + ", temperatura=" + temperatura + ", frecuencia_respiratoria=" + frecuencia_respiratoria 
                + ", frecuencia_cardiaca=" + frecuencia_cardiaca + ", relleno_capilar=" + relleno_capilar 
                + ", pulso=" + pulso + ", mucosas=" + mucosas + ", deshidratacion=" + deshidratacion 
                + ", observaciones=" + observaciones + ", id_historia=" + id_historia + '}';
    }
    
}
