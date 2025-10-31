/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproyectpoo;

/**
 *
 * @author juana
 */
public class Mascota {
    
    private int id_mascota;
    private String nombre;
    private String especie;
    private String raza;
    private String sexo;
    private int edad;
    private double peso;
    private String color;
    private int id_propietario;
    
    //Generamos el constructor de nuestra calse Mascota

    public Mascota(int id_mascota, String nombre, String especie, String raza, String sexo, int edad, double peso, String color, int id_propietario) {
        this.id_mascota = id_mascota;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.color = color;
        this.id_propietario = id_propietario;
    }

    public Mascota(String nombre, String especie, String raza, String sexo, int edad, double peso, String color, int id_propietario) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.color = color;
        this.id_propietario = id_propietario;
    }
    
    
    //Generamos los setters de nuestra clase

    public void setId_mascota(int id_mascota) {
        this.id_mascota = id_mascota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPropietario(int id_propietario) {
        this.id_propietario = id_propietario;
    }
    
    //Generamos los getters de nuestra clase 

    public int getId_mascota() {
        return id_mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaza() {
        return raza;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

    public int getPropietario() {
        return id_propietario;
    }

    @Override
    public String toString() {
        return "Mascota{" + "id_mascota=" + id_mascota + ", nombre=" + nombre +
                ", especie=" + especie + ", raza=" + raza + ", sexo=" + sexo +
                ", edad=" + edad + ", peso=" + peso + ", color=" + color +
                ", id_propietario=" + id_propietario + '}';
    }
    
   
}

