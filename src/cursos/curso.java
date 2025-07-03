package cursos;
import Personas.Profesores.Profesor;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author llean
 */
public class curso {
    //atributos
    private int codigo;
    private String nombre;
    private int cantCreditos;
    private Profesor profesor;
    
    //getters

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantCreditos() {
        return cantCreditos;
        
    }

    public Profesor getProfesor() {
        return profesor;
    }
    
    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantCreditos(int cantCreditos) {
        this.cantCreditos = cantCreditos;
    }
    //constructor

    public curso(int codigo, String nombre, int cantCreditos, Profesor profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantCreditos = cantCreditos;
        this.profesor = profesor;
    }
    //toString

    @Override
    public String toString() {
        return "curso: " + "codigo =" + codigo + ", nombre =" + nombre + ", cantCreditos =" + cantCreditos + ", profesor =" + profesor;
    }
    
}
