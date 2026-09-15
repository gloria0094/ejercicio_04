package com.upiiz.ejercicio_04.alumno;

import com.upiiz.ejercicio_04.alumno.dpo.AlumnoDto;
import com.upiiz.ejercicio_04.alumno.dpo.NuevoAlumnoDto;

import java.util.List;

public interface AlumnoService {
    //Guarde un alumno
    AlumnoDto save(NuevoAlumnoDto nuevoAlumnoDto);
    //Muestre todas los alumnos
    List<AlumnoDto> findAll();
    //Actualice un alumno
    AlumnoDto update(Long id, NuevoAlumnoDto nuevoAlumnoDto);
    //Borre un alumno
    void delete(Long id);

}
