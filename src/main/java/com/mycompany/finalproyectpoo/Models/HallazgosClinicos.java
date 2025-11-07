/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproyectpoo.Models;

/**
 *
 * @author manue
 */
public class HallazgosClinicos {

    private int id_hallazgo;
    private String piel_pelage;
    private String gangleos_linfatico;
    private String digestivo;
    private String respiratorio;
    private String endocrino;
    private String nervioso;
    private String urinario;
    private String reproductivo;
    private String musulo_esqueletico;
    private String palpacion_rectal;
    private String hallazgos_relevantes;
    private int id_historia; 

    // Constructor completo (incluye id_hallazgo)
    public HallazgosClinicos(int id_hallazgo, String piel_pelage, String gangleos_linfatico,
                             String digestivo, String respiratorio, String endocrino,
                             String nervioso, String urinario, String reproductivo,
                             String musulo_esqueletico, String palpacion_rectal,
                             String hallazgos_relevantes, int id_historia) {

        this.id_hallazgo = id_hallazgo;
        this.piel_pelage = piel_pelage;
        this.gangleos_linfatico = gangleos_linfatico;
        this.digestivo = digestivo;
        this.respiratorio = respiratorio;
        this.endocrino = endocrino;
        this.nervioso = nervioso;
        this.urinario = urinario;
        this.reproductivo = reproductivo;
        this.musulo_esqueletico = musulo_esqueletico;
        this.palpacion_rectal = palpacion_rectal;
        this.hallazgos_relevantes = hallazgos_relevantes;
        this.id_historia = id_historia;
    }

    public int getId_hallazgo() {
        return id_hallazgo;
    }

    public String getPiel_pelage() {
        return piel_pelage;
    }

    public String getGangleos_linfatico() {
        return gangleos_linfatico;
    }

    public String getDigestivo() {
        return digestivo;
    }

    public String getRespiratorio() {
        return respiratorio;
    }

    public String getEndocrino() {
        return endocrino;
    }

    public String getNervioso() {
        return nervioso;
    }

    public String getUrinario() {
        return urinario;
    }

    public String getReproductivo() {
        return reproductivo;
    }

    public String getMusulo_esqueletico() {
        return musulo_esqueletico;
    }

    public String getPalpacion_rectal() {
        return palpacion_rectal;
    }

    public String getHallazgos_relevantes() {
        return hallazgos_relevantes;
    }

    public String getId_historia() {
        return id_historia;
    }

    public void setId_hallazgo(int id_hallazgo) {
        this.id_hallazgo = id_hallazgo;
    }

    public void setPiel_pelage(String piel_pelage) {
        this.piel_pelage = piel_pelage;
    }

    public void setGangleos_linfatico(String gangleos_linfatico) {
        this.gangleos_linfatico = gangleos_linfatico;
    }

    public void setDigestivo(String digestivo) {
        this.digestivo = digestivo;
    }

    public void setRespiratorio(String respiratorio) {
        this.respiratorio = respiratorio;
    }

    public void setEndocrino(String endocrino) {
        this.endocrino = endocrino;
    }

    public void setNervioso(String nervioso) {
        this.nervioso = nervioso;
    }

    public void setUrinario(String urinario) {
        this.urinario = urinario;
    }

    public void setReproductivo(String reproductivo) {
        this.reproductivo = reproductivo;
    }

    public void setMusulo_esqueletico(String musulo_esqueletico) {
        this.musulo_esqueletico = musulo_esqueletico;
    }

    public void setPalpacion_rectal(String palpacion_rectal) {
        this.palpacion_rectal = palpacion_rectal;
    }

    public void setHallazgos_relevantes(String hallazgos_relevantes) {
        this.hallazgos_relevantes = hallazgos_relevantes;
    }

    public void setId_historia(String id_historia) {
        this.id_historia = id_historia;
    }

    @Override
    public String toString() {
        return "HallazgosClinicos{" + "id_hallazgo=" + id_hallazgo +
          ", piel_pelage=" + piel_pelage + ", gangleos_linfatico=" +
          gangleos_linfatico + ", digestivo=" + digestivo + ", respiratorio=" + 
          respiratorio + ", endocrino=" + endocrino + ", nervioso=" + nervioso + 
          ", urinario=" + urinario + ", reproductivo=" + reproductivo + ", musulo_esqueletico=" + 
          musulo_esqueletico + ", palpacion_rectal=" + palpacion_rectal + ", hallazgos_relevantes=" + 
          hallazgos_relevantes + ", id_historia=" + id_historia + '}';
    }

}
