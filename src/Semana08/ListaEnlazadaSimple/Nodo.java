/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana08.ListaEnlazadaSimple;

import Semana08.ListaEnlazadaDoble.*;

/**
 *
 * @author edumo
 */
public class Nodo {

    //5 atributos de Componentes de PC
    public String nombre;
    public String marca;
    public String modelo;
    public double precio;
    public int stock;

    //Enlace
    public Nodo siguiente;

    public Nodo(String nombre, String marca, String modelo, double precio, int stock) {
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.stock = stock;
        this.siguiente = null;
    }

}
