/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproyectpoo.Models;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author manue
 */
public class Historia_Clinica {
    private int id_historia;
    private int id_veterinario;
    private int id_mascota;
    private Date fecha_creacion;

    public Historia_Clinica(int id_historia, int id_veterinario, int id_mascota, Date fecha_creacion) {
        this.id_historia = id_historia;
        this.id_veterinario = id_veterinario;
        this.id_mascota = id_mascota;
        this.fecha_creacion = fecha_creacion;
    }

    public Historia_Clinica(int id_veterinario, int id_mascota, Date fecha_creacion) {
        this.id_veterinario = id_veterinario;
        this.id_mascota = id_mascota;
        this.fecha_creacion = fecha_creacion;
    }
    
    
    
    

    public int getId_historia() {
        return id_historia;
    }

    public int getId_veterinario() {
        return id_veterinario;
    }

    public int getId_mascota() {
        return id_mascota;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setId_historia(int id_historia) {
        this.id_historia = id_historia;
    }

    public void setId_veterinario(int id_veterinario) {
        this.id_veterinario = id_veterinario;
    }

    public void setId_mascota(int id_mascota) {
        this.id_mascota = id_mascota;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    @Override
    public String toString() {
        return "Historia_Clinica{" + "id_historia=" + id_historia + ", id_veterinario=" + id_veterinario 
                + ", id_mascota=" + id_mascota + ", fecha_creacion=" + fecha_creacion + '}';
    }
  
}
