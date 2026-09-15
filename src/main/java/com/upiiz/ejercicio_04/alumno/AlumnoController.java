package com.upiiz.ejercicio_04.alumno;

import com.upiiz.ejercicio_04.alumno.dpo.AlumnoDto;
import com.upiiz.ejercicio_04.alumno.dpo.NuevoAlumnoDto;
import com.upiiz.ejercicio_04.alumno.dpo.ReporteEdadProjection;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/alumnos")
public class AlumnoController {
    private AlumnoServiceImpl alumnoServiceImpl;

    public AlumnoController(AlumnoServiceImpl alumnoServiceImpl) {
        this.alumnoServiceImpl = alumnoServiceImpl;
    }

    @PostMapping()
    public AlumnoDto save(@RequestBody NuevoAlumnoDto nuevoAlumnoDto){
        return alumnoServiceImpl.save(nuevoAlumnoDto);
    }
    // Reporte de alumnos agrupados por edad
    @GetMapping("/reporte-edades")
    public ResponseEntity<List<ReporteEdadProjection>> obtenerReporteEdades() {
        return ResponseEntity.ok(alumnoServiceImpl.obtenerReportePorEdad());
    }

}
