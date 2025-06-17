/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana07.Laboratorio;

/**
 *
 * @author edumo
 */
public class Nodo {

    String codigo;
    String nombre;
    String sueldo;
    Nodo siguiente;

    public Nodo(String codigo, String nombre, String sueldo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.siguiente = null;
    }
}
