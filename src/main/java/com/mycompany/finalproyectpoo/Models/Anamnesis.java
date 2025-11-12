/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproyectpoo.Models;

/**
 *
 * @author manue
 */
public class Anamnesis {
    private int id_anamnesis;
    private String dieta;
    private String preexistencia;
    private String cirugias_previas;
    private String esquema_vacunal;
    private String ultima_desparasitacion;
    private String tratamientos_recientes;
    private String viajes_realizados;
    private String convivencia_animales;
    private String motivo_consulta;
    private int id_historia;

    public Anamnesis(int id_anamnesis, String dieta, String preexistencia, 
            String cirugias_previas, String esquema_vacunal,
            String ultima_desparasitacion, String tratamientos_recientes,
            String viajes_realizados, String convivencia_animales,
            String motivo_consulta, int id_historia) {
        this.id_anamnesis = id_anamnesis;
        this.dieta = dieta;
        this.preexistencia = preexistencia;
        this.cirugias_previas = cirugias_previas;
        this.esquema_vacunal = esquema_vacunal;
        this.ultima_desparasitacion = ultima_desparasitacion;
        this.tratamientos_recientes = tratamientos_recientes;
        this.viajes_realizados = viajes_realizados;
        this.convivencia_animales = convivencia_animales;
        this.motivo_consulta = motivo_consulta;
        this.id_historia = id_historia;
    }

    public Anamnesis( String dieta, String preexistencia, String cirugias_previas, 
            String esquema_vacunal, String ultima_desparasitacion, String tratamientos_recientes, 
            String viajes_realizados, String convivencia_animales, String motivo_consulta, int id_historia) {
        
        this.dieta = dieta;
        this.preexistencia = preexistencia;
        this.cirugias_previas = cirugias_previas;
        this.esquema_vacunal = esquema_vacunal;
        this.ultima_desparasitacion = ultima_desparasitacion;
        this.tratamientos_recientes = tratamientos_recientes;
        this.viajes_realizados = viajes_realizados;
        this.convivencia_animales = convivencia_animales;
        this.motivo_consulta = motivo_consulta;
        this.id_historia = id_historia;
    }
    
    //Se agregan los getters
    public int getId_anamnesis() {
        return id_anamnesis;
    }

    public String getDieta() {
        return dieta;
    }

    public String getPreexistencia() {
        return preexistencia;
    }

    public String getCirugias_previas() {
        return cirugias_previas;
    }

    public String getEsquema_vacunal() {
        return esquema_vacunal;
    }

    public String getUltima_desparasitacion() {
        return ultima_desparasitacion;
    }

    public String getTratamientos_recientes() {
        return tratamientos_recientes;
    }

    public String getViajes_realizados() {
        return viajes_realizados;
    }

    public String getConvivencia_animales() {
        return convivencia_animales;
    }

    public String getMotivo_consulta() {
        return motivo_consulta;
    }

    public int getId_historia() {
        return id_historia;
    }
    
    //Se agregan los setters
    public void setId_anamnesis(int id_anamnesis) {
        this.id_anamnesis = id_anamnesis;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public void setPreexistencia(String preexistencia) {
        this.preexistencia = preexistencia;
    }

    public void setCirugias_previas(String cirugias_previas) {
        this.cirugias_previas = cirugias_previas;
    }

    public void setEsquema_vacunal(String esquema_vacunal) {
        this.esquema_vacunal = esquema_vacunal;
    }

    public void setUltima_desparasitacion(String ultima_desparasitacion) {
        this.ultima_desparasitacion = ultima_desparasitacion;
    }

    public void setTratamientos_recientes(String tratamientos_recientes) {
        this.tratamientos_recientes = tratamientos_recientes;
    }

    public void setViajes_realizados(String viajes_realizados) {
        this.viajes_realizados = viajes_realizados;
    }

    public void setConvivencia_animales(String convivencia_animales) {
        this.convivencia_animales = convivencia_animales;
    }

    public void setMotivo_consulta(String motivo_consulta) {
        this.motivo_consulta = motivo_consulta;
    }

    public void setId_historia(int id_historia) {
        this.id_historia = id_historia;
    }

    @Override
    public String toString() {
        return "Anamnesis{" + "id_anamnesis=" + id_anamnesis 
                + ", dieta=" + dieta + ", preexistencia=" + preexistencia 
                + ", cirugias_previas=" + cirugias_previas + ", esquema_vacunal=" + esquema_vacunal
                + ", ultima_desparasitacion=" + ultima_desparasitacion + ", tratamientos_recientes=" + tratamientos_recientes 
                + ", viajes_realizados=" + viajes_realizados + ", convivencia_animales=" + convivencia_animales 
                + ", motivo_consulta=" + motivo_consulta + ", id_historia=" + id_historia + '}';
    }
    
    
}
