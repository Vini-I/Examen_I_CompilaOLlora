/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas.Estudiantes;

import Personas.Persona;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Student
 */
public class Estudiante extends Persona {
    
    private LocalDate fechaIngreso;
    private String correo;
    private String telefono;
    private String carrera;

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    public int anhosCursado(LocalDate fechaIngreso){
        return Period.between(fechaIngreso, LocalDate.now()).getYears();
    }

    public Estudiante(int cedula, String nombre, LocalDate fechaIngreso, String correo, String telefono, String carrera) {
        super(cedula, nombre);
        this.fechaIngreso = fechaIngreso;
        this.correo = correo;
        this.telefono = telefono;
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante: " + super.toString() + " Fecha de Ingreso: " + fechaIngreso + " Correo: " + correo + " Telefono: " + telefono + " Carrera: " + carrera;
    }
    
    
    
}
