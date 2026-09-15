package com.upiiz.ejercicio_04.alumno.entities;

import jakarta.persistence.*;

@Entity
@Table(name="alumno")
public class AlumnoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String boleta;
    private String nombre;
    private String correo;
    private int edad;

    public AlumnoEntity() {
    }

    public AlumnoEntity(Long id, String boleta, String nombre, String correo, int edad) {
        this.id = id;
        this.boleta = boleta;
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBoleta() {
        return boleta;
    }

    public void setBoleta(String boleta) {
        this.boleta = boleta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
