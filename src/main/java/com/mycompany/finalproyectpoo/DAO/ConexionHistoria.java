/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproyectpoo.DAO;


import com.mycompany.finalproyectpoo.Models.Anamnesis;
import com.mycompany.finalproyectpoo.Models.Diagnostico;
import com.mycompany.finalproyectpoo.Models.ExamenComplementario;
import com.mycompany.finalproyectpoo.Models.ExamenFisico;
import com.mycompany.finalproyectpoo.Models.HallazgosClinicos;
import com.mycompany.finalproyectpoo.Models.Historia_Clinica;
import com.mycompany.finalproyectpoo.Models.Mascota;
import com.mycompany.finalproyectpoo.Models.Propietario;
import com.mycompany.finalproyectpoo.Models.Veterinario;
import com.mycompany.finalproyectpoo.Models.ImprimirHistoriaClinica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juana
 */

public class ConexionHistoria {
    
   
    /**
     * Recupera la historia clínica completa por su ID y la mapea a un objeto ImprimirHistoriaClinica.
     * @param idHistoria El ID de la historia clínica a buscar.
     * @return Objeto ImprimirHistoriaClinica, o null si no existe.
     */
    public ImprimirHistoriaClinica obtenerReporteCompleto(int idHistoria) {
    ImprimirHistoriaClinica reporte = null;
    
    // --- CONSULTA CORREGIDA (SELECT Y JOINs) ---
    String sqlFijos = "SELECT " +
        // Propietario
        "p.id, p.nombre AS p_nombre, p.telefono, p.gmail, p.direccion, " +
        // Mascota
        "m.id_mascota, m.nombre AS m_nombre, m.especie, m.raza, m.sexo, m.edad, m.peso, m.color, " +
        // Historia Clinica (Base)
        "hc.id_historia, hc.fecha_creacion AS fecha, " +
        // Veterinario
        "v.id_veterinario, v.nombre AS nombre_vet, " +
        // Anamnesis
        "a.id_anamnesis, a.dieta, a.preexistencia, a.cirugias_previas, a.esquema_vacunal, a.ultima_desparasitacion, a.tratamientos_recientes, a.viajes_realizados, a.convivencia_animales, a.motivo_consulta, " +
        // Examen Físico
        "ef.id_examen_fisico, ef.temperatura, ef.frecuencia_respiratoria, ef.frecuencia_cardiaca, ef.condicion_corporal, ef.relleno_capilar, ef.pulso, ef.mucosas, ef.deshidratacion, ef.observaciones AS ef_observaciones, " +
        // Hallazgos Clínicos (Usando id_hallazgos, como en la imagen)
        "h.id_hallazgos, h.piel_pelage, h.gangleos_linfatico, h.digestivo, h.respiratorio, h.endocrino, h.nervioso, h.urinario, h.reproductivo, h.musculo_esqueletico, h.palpacion_rectal, h.hallazgos_relevantes, " + 
        // Examen Complementario
        "ec.id_examen_complementario, ec.tipo_examen, ec.fecha_examen, ec.resultado, ec.observacion, " +
        // Diagnóstico
        "d.id_diagnostico, d.diagnostico_presuntivo AS presuntivo, d.diagnostico_definitivo AS definitivo, d.evolucion, d.pronostico, d.tratamiento "+
        
        "FROM historia_clinica hc " +
        "INNER JOIN mascota m ON hc.id_mascota = m.id_mascota " +
        "INNER JOIN propietario p ON m.id_propietario = p.id " + 
        "INNER JOIN veterinario v ON hc.id_veterinario = v.id_veterinario " +
        "INNER JOIN anamnesis a ON hc.id_historia = a.id_historia " +
        "INNER JOIN examen_fisico ef ON hc.id_historia = ef.id_historia " +
        "INNER JOIN hallazgos_clinicos h ON hc.id_historia = h.id_historia " +
        "INNER JOIN examen_complementario ec ON hc.id_historia = ec.id_historia " +
        "INNER JOIN diagnostico d ON hc.id_historia = d.id_historia " +
        "WHERE hc.id_historia = ?";

    try (Connection conn = Conexion.conectar();
         PreparedStatement stmt = conn.prepareStatement(sqlFijos)) {

        stmt.setInt(1, idHistoria);

        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                reporte = new ImprimirHistoriaClinica();

                // 1. Mapear Datos Base (Historia Clínica)
                reporte.setIdHistoria(rs.getInt("id_historia"));
                reporte.setFechaRegistro(rs.getString("fecha"));

                // 2. Mapear Propietario
                Propietario p = new Propietario();
                p.setId(rs.getInt("id")); 
                p.setNombre(rs.getString("p_nombre"));
                p.setTelefono(rs.getString("telefono"));
                p.setGmail(rs.getString("gmail"));
                p.setDireccion(rs.getString("direccion"));
                reporte.setPropietario(p);

                // 3. Mapear Mascota (COMPLETO)
                Mascota m = new Mascota();
                m.setId_mascota(rs.getInt("id_mascota"));
                m.setNombre(rs.getString("m_nombre"));
                m.setEspecie(rs.getString("especie")); // ✅ LÍNEA AÑADIDA
                m.setRaza(rs.getString("raza")); // ✅ LÍNEA AÑADIDA
                m.setSexo(rs.getString("sexo")); // ✅ LÍNEA AÑADIDA
                m.setEdad(rs.getInt("edad")); // ✅ LÍNEA AÑADIDA
                m.setPeso(rs.getDouble("peso")); // ✅ LÍNEA AÑADIDA
                m.setColor(rs.getString("color"));
                m.setPropietario(rs.getInt("id")); 
                reporte.setMascota(m);

                // 4. Mapear Veterinario
                Veterinario v = new Veterinario();
                v.setId_veterinario(rs.getInt("id_veterinario"));
                v.setNombre(rs.getString("nombre_vet"));
                reporte.setVeterinario(v);

                // 5. Mapear Anamnesis (COMPLETO)
                Anamnesis a = new Anamnesis();
                a.setId_anamnesis(rs.getInt("id_anamnesis"));
                a.setDieta(rs.getString("dieta"));
                a.setPreexistencia(rs.getString("preexistencia")); 
                a.setCirugias_previas(rs.getString("cirugias_previas"));
                a.setEsquema_vacunal(rs.getString("esquema_vacunal"));
                a.setUltima_desparasitacion(rs.getDate("ultima_desparasitacion"));
                a.setTratamientos_recientes(rs.getString("tratamientos_recientes"));
                a.setViajes_realizados(rs.getString("viajes_realizados"));
                a.setConvivencia_animales(rs.getString("convivencia_animales"));
                a.setMotivo_consulta(rs.getString("motivo_consulta"));
                a.setId_historia(rs.getInt("id_historia")); 
                reporte.setAnamnesis(a);

                // 6. Mapear Examen Físico (COMPLETO)
                ExamenFisico ef = new ExamenFisico();
                ef.setId_examen_fisico(rs.getInt("id_examen_fisico"));
                ef.setTemperatura(rs.getString("temperatura"));
                ef.setFrecuencia_respiratoria(rs.getString("frecuencia_respiratoria"));
                ef.setFrecuencia_cardiaca(rs.getString("frecuencia_cardiaca"));
                ef.setCondicion_corporal(rs.getString("condicion_corporal"));
                ef.setRelleno_capilar(rs.getString("relleno_capilar"));
                ef.setPulso(rs.getString("pulso")); 
                ef.setMucosas(rs.getString("mucosas"));
                ef.setDeshidratacion(rs.getString("deshidratacion"));
                ef.setObservaciones(rs.getString("ef_observaciones"));
                ef.setId_historia(rs.getInt("id_historia"));
                reporte.setExamenFisico(ef);

                // 7. Mapear Diagnóstico (COMPLETO)
                Diagnostico d = new Diagnostico();
                d.setId_diagnostico(rs.getInt("id_diagnostico"));
                d.setDiagnostico_presuntivo(rs.getString("presuntivo"));
                d.setDiagnostico_definitivo(rs.getString("definitivo"));
                d.setEvolucion(rs.getString("evolucion")); 
                d.setPronostico(rs.getString("pronostico"));
                d.setTratamiento(rs.getString("tratamiento"));
                d.setId_historia(rs.getInt("id_historia"));
                reporte.setDiagnostico(d);

                // 8. Mapear Hallazgos Clínicos (COMPLETO)
                HallazgosClinicos h = new HallazgosClinicos();
                h.setId_hallazgo(rs.getInt("id_hallazgos")); 
                h.setPiel_pelage(rs.getString("piel_pelage"));
                h.setGangleos_linfatico(rs.getString("gangleos_linfatico")); // ✅ LÍNEA AÑADIDA
                h.setDigestivo(rs.getString("digestivo")); // ✅ LÍNEA AÑADIDA
                h.setRespiratorio(rs.getString("respiratorio")); // ✅ LÍNEA AÑADIDA
                h.setEndocrino(rs.getString("endocrino")); // ✅ LÍNEA AÑADIDA
                h.setNervioso(rs.getString("nervioso")); // ✅ LÍNEA AÑADIDA
                h.setUrinario(rs.getString("urinario")); // ✅ LÍNEA AÑADIDA
                h.setReproductivo(rs.getString("reproductivo")); // ✅ LÍNEA AÑADIDA
                h.setMusculo_esqueletico(rs.getString("musculo_esqueletico")); // ✅ LÍNEA AÑADIDA
                h.setPalpacion_rectal(rs.getString("palpacion_rectal")); // ✅ LÍNEA AÑADIDA
                h.setHallazgos_relevantes(rs.getString("hallazgos_relevantes"));
                h.setId_historia(rs.getInt("id_historia")); 
                reporte.setHallasgos_clinicos(h);

                // 9. Mapear Examen Complementario (COMPLETO)
                ExamenComplementario ec = new ExamenComplementario();
                ec.setId_examen_complementario(rs.getInt("id_examen_complementario"));
                ec.setTipo_examen(rs.getString("tipo_examen")); // ✅ LÍNEA AÑADIDA
                ec.setFecha_examen(rs.getDate("fecha_examen")); // ✅ LÍNEA AÑADIDA
                ec.setResultado(rs.getString("resultado")); // ✅ LÍNEA AÑADIDA
                ec.setObservacion(rs.getString("observacion")); // ✅ LÍNEA AÑADIDA
                ec.setId_historia(rs.getInt("id_historia")); 
                reporte.setExamenComplementario(ec);
                
            }
        }
    } catch (SQLException e) {
        System.err.println("Error al obtener datos de la historia clínica: " + e.getMessage());
        e.printStackTrace();
        return null;
    }
    
    return reporte;
  }
}
