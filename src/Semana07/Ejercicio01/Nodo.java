package Semana07.Ejercicio01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author edumo
 */
public class Nodo {

    String nombre;
    int nivel;
    double poderAtaque;
    Nodo siguiente;

    public Nodo(String nombre, int nivel, double poderAtaque) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.poderAtaque = poderAtaque;
        this.siguiente = null;
    }

}
