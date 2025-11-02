/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproyectpoo.Models;

/**
 *
 * @author juana
 */
public class Veterinario {
    
    private int id_veterinario;
    private String nombre;
    
    
    //Constructor de nuestra clase
    public Veterinario(int id_veterinario, String nombre) {
        this.id_veterinario = id_veterinario;
        this.nombre = nombre;
    }
    //Se crean los setters de nuestra clase
    public void setId_veterinario(int id_veterinario) {
        this.id_veterinario = id_veterinario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Se crean los getters de nuestra clase
    public int getId_veterinario() {
        return id_veterinario;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
}
