/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Listas;

/**
 *
 * @author Student
 */
public interface Lista <T>{
    public boolean Agregar(T t);
    
    public boolean Eliminar(T t);
    
    public T Buscar(Object id);
}
