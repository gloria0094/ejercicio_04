package com.upiiz.ejercicio_04.alumno;

import com.upiiz.ejercicio_04.alumno.dpo.ReporteEdadProjection;
import com.upiiz.ejercicio_04.alumno.entities.AlumnoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AlumnoRepository extends JpaRepository<AlumnoEntity, Long> {
    Optional<AlumnoEntity> findByBoleta(String boleta);
    Optional<AlumnoEntity> findByCorreoIgnoreCase(String correo);

    // Reporte personalizado
    @Query("SELECT a.edad AS anios, COUNT(a) AS cantidad FROM AlumnoEntity a GROUP BY a.edad ORDER BY a.edad ASC")
    List<ReporteEdadProjection> obtenerReporteAgrupadoPorEdad();
    
}
