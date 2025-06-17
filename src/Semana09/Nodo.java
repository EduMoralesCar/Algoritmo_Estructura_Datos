/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana09;

/**
 *
 * @author edumo
 */
public class Nodo {

    public String codigo;
    public String nombre;
    public String apellidos;
    public String sexo;
    public float sueldo;

    public Nodo ant;
    public Nodo sig;

    public Nodo(String codigo, String nombre, String apellidos, String sexo, float sueldo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.sueldo = sueldo;
        this.ant = null;
        this.sig = null;
    }

}
