package com.upiiz.ejercicio_04.alumno.dpo;

public class AlumnoDto {
    private Long id;
    private String nombre;
    private String boleta;
    private String correo;
    private int edad;

    public AlumnoDto() {}

    public AlumnoDto(Long id, String nombre, String boleta, String correo, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.boleta = boleta;
        this.correo = correo;
        this.edad = edad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBoleta() {
        return boleta;
    }

    public void setBoleta(String boleta) {
        this.boleta = boleta;
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
