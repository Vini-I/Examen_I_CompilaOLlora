/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Personas.Profesores;

/**
 *
 * @author Student
 */
public enum GradoAcademico {
    LICENCIATURA("Licenciatura"),
    MAESTRIA("Maestria"),
    DOCTORADO("Doctorado");
    
    private String status;

    private GradoAcademico(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "GradoAcademico: " + status;
    }
}
