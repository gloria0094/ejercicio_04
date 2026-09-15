package com.upiiz.ejercicio_04.alumno.dpo;

public class NuevoAlumnoDto {
    private String nombre;
    private String boleta;
    private String correo;
    private int edad;

    public NuevoAlumnoDto(String nombre, String boleta, String correo, int edad) {
        this.nombre = nombre;
        this.boleta = boleta;
        this.correo = correo;
        this.edad = edad;
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
