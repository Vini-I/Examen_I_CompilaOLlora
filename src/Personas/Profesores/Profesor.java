/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas.Profesores;

import Personas.Persona;
        
/**
 *
 * @author Student
 */
public class Profesor extends Persona {
    private String departamento;
    private GradoAcademico gradoAcademico;

    public String getDepartamento() {
        return departamento;
    }

    public GradoAcademico getGradoAcademico() {
        return gradoAcademico;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setGradoAcademico(GradoAcademico gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    public Profesor(int cedula, String nombre, String departamento, GradoAcademico gradoAcademico) {
        super(cedula, nombre);
        this.departamento = departamento;
        this.gradoAcademico = gradoAcademico;
    }

    @Override
    public String toString() {
        return "\nProfesor: " + super.toString() + "\ndepartamento:" + departamento + "\nGrado Academico=" + gradoAcademico;
    }
    
    
}
