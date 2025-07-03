/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas.Profesores;

import Listas.Lista;
import java.util.Arrays;

/**
 *
 * @author Student
 */
public class ListaProfesores implements Lista <Profesor> {
    private Profesor[] profesores;

    @Override
    public boolean Agregar(Profesor t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Eliminar(Profesor t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Profesor Buscar(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    //Lista de profesores por grado académico: Debe retornar la lista de profesores que tengan un grado académico especificado.
    public Profesor[] ListarPorGradoAcademico(GradoAcademico gradoAcademico){
        int max = profesores.length;
        int cont = 0;
        Profesor[] listaFinal = new Profesor[max];
        for (int i = 0; i < max; i++) {
            if (profesores[i].getGradoAcademico() == gradoAcademico) {
                listaFinal[cont] = profesores[i];
                cont++;
            }
        }
        return listaFinal;
    }

    public ListaProfesores(int tamanio) {
        this.profesores = new Profesor[tamanio];
    }

    @Override
    public String toString() {
        return "Lista de profesores: " + Arrays.toString(profesores);
    }
    
    
}
