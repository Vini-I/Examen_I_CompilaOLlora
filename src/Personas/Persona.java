/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author Student
 */
public abstract class Persona {
    
    private int cedula;
    private String nombre;

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona(int cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cedula: " + cedula + " Nombre: " + nombre;
    }
}
