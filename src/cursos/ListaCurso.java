/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursos;
import Listas.Lista;
import personas.profesores;
/**
 *
 * @author llean
 */
public class ListaCurso implements Lista <curso> {
    private curso[] list;

    @Override
    public boolean Agregar(curso t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Eliminar(curso t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public curso Buscar(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public int (profesor profesor){
        int max = list.length;
        int cont = 0;
        for (int i = 0; i < max; i++) {
            if(list[i].getProfesor().equals(profesor)) {
                cont = cont + 1;
            }    
        }
        return cont;
    }
    
}
