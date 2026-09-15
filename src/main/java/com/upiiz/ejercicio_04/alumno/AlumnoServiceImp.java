package com.upiiz.ejercicio_04.alumno;

import com.upiiz.ejercicio_04.alumno.dpo.AlumnoDto;
import com.upiiz.ejercicio_04.alumno.dpo.NuevoAlumnoDto;
import com.upiiz.ejercicio_04.alumno.dpo.ReporteEdadProjection;

import java.util.List;

public interface AlumnoServiceImp {
    AlumnoDto save(NuevoAlumnoDto nuevoAlumnoDto);

    List<ReporteEdadProjection> obtenerReportePorEdad();
}
