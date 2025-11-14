/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproyectpoo.Models;
import java.util.List;
/**
 *
 * @author juana
 */
public class ImprimirHistoriaClinica {
    
   // 1. Identificador Principal
    private int idHistoria; 
    private String fechaRegistro; // Campo 'fecha' de la tabla historia_clinica

    // 2. Composición de Secciones (Objetos de tus clases existentes)
    private Propietario propietario;
    private Mascota mascota;
    private Veterinario veterinario;
    private Anamnesis anamnesis;
    private ExamenFisico examenFisico;
    private HallazgosClinicos hallasgos_clinicos;
    private ExamenComplementario examen_complementario;
    private Diagnostico diagnostico;
    
    private ExamenComplementario examenComplementario;

    public ImprimirHistoriaClinica(int idHistoria, String fechaRegistro,
            Propietario propietario, Mascota mascota, Veterinario veterinario,
            Anamnesis anamnesis, ExamenFisico examenFisico, HallazgosClinicos hallasgos_clinicos,
            ExamenComplementario examen_complementario, Diagnostico diagnostico, ExamenComplementario examenComplementario) {
        this.idHistoria = idHistoria;
        this.fechaRegistro = fechaRegistro;
        this.propietario = propietario;
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.anamnesis = anamnesis;
        this.examenFisico = examenFisico;
        this.hallasgos_clinicos = hallasgos_clinicos;
        this.examen_complementario = examen_complementario;
        this.diagnostico = diagnostico;
        this.examen_complementario = examen_complementario ;
    }

    public ImprimirHistoriaClinica() {
    }
    public int getIdHistoria() {
        return idHistoria;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public Anamnesis getAnamnesis() {
        return anamnesis;
    }

    public ExamenFisico getExamenFisico() {
        return examenFisico;
    }

    public HallazgosClinicos getHallasgos_clinicos() {
        return hallasgos_clinicos;
    }

    public ExamenComplementario getExamen_complementario() {
        return examen_complementario;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    //Getters
    public ExamenComplementario getExamenComplementario() {    
        return examenComplementario;
    }

    //Setters
    public void setIdHistoria(int idHistoria) {
        this.idHistoria = idHistoria;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public void setAnamnesis(Anamnesis anamnesis) {
        this.anamnesis = anamnesis;
    }

    public void setExamenFisico(ExamenFisico examenFisico) {
        this.examenFisico = examenFisico;
    }

    public void setHallasgos_clinicos(HallazgosClinicos hallasgos_clinicos) {
        this.hallasgos_clinicos = hallasgos_clinicos;
    }

    public void setExamen_complementario(ExamenComplementario examen_complementario) {
        this.examen_complementario = examen_complementario;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void setExamenComplementario(ExamenComplementario examenComplementario) {
        this.examenComplementario = examenComplementario;
    }

    
    
    
    
    
    
}
