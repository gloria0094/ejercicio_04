package com.upiiz.ejercicio_04.alumno;

import com.upiiz.ejercicio_04.alumno.dpo.AlumnoDto;
import com.upiiz.ejercicio_04.alumno.dpo.NuevoAlumnoDto;
import com.upiiz.ejercicio_04.alumno.dpo.ReporteEdadProjection;
import com.upiiz.ejercicio_04.alumno.entities.AlumnoEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoServiceImpl implements AlumnoServiceImp {
    private AlumnoRepository alumnoRepository;

    public AlumnoServiceImpl(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }
    @Override
    public AlumnoDto save(NuevoAlumnoDto nuevoAlumnoDto) {
        //Validar boleta
        alumnoRepository.findByBoleta(nuevoAlumnoDto.getBoleta()).ifPresent(e ->{
            throw new IllegalArgumentException("La boleta ya existe en el sistema");
        });
        //Validar correo
        alumnoRepository.findByCorreoIgnoreCase(nuevoAlumnoDto.getCorreo()).ifPresent(e ->{
            throw new IllegalArgumentException("El correo ya existe en el sistema");
        });

        // Crear y guardar entidad
        AlumnoEntity entity = new AlumnoEntity();
        entity.setBoleta(nuevoAlumnoDto.getBoleta());
        entity.setNombre(nuevoAlumnoDto.getNombre());
        entity.setCorreo(nuevoAlumnoDto.getCorreo());
        entity.setEdad(nuevoAlumnoDto.getEdad());

        AlumnoEntity guardado = alumnoRepository.save(entity);

        return new AlumnoDto(guardado.getId(),guardado.getBoleta(),guardado.getNombre(),guardado.getCorreo(),guardado.getEdad());
    }
    @Override
    public List<ReporteEdadProjection> obtenerReportePorEdad() {
        return alumnoRepository.obtenerReporteAgrupadoPorEdad();
    }
}
