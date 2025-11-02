/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproyectpoo.Models;

/**
 *
 * @author juana
 */
public class Propietario {
    
    private int id;
    private String gmail;
    private String telefono;
    private String direccion;
    private String nombre;

    
    //generamos el constructor de nuestra clase 
    public Propietario(int id, String gmail, String telefono, String direccion, String nombre) {
        this.id = id;
        this.gmail = gmail;
        this.telefono = telefono;
        this.direccion = direccion;
        this.nombre = nombre;
    }
    
    //Generamos los setters de nuestra clase
    public void setId(int id) {
        this.id = id;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Generamos los getters
    public int getId() {
        return id;
    }

    public String getGmail() {
        return gmail;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }
    
    //Para poder hacer la relacion de propietario y mascota en la interfas grafica al crear 
    //la mascota(Desplegar una lista de propietarios y seleccionar)
    
    @Override
    public String toString() {
        return "Propietario{" + "id=" + id + 
                ", telefono=" + telefono + ", direccion=" + direccion +
                ", nombre=" + nombre + '}';
    }
     
}
