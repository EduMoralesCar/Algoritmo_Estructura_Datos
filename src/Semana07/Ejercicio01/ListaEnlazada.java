/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana07.Ejercicio01;

/**
 *
 * @author edumo
 */
public class ListaEnlazada {

    Nodo cabeza;

    Nodo InsertarFinal(Nodo fin, String nombre, int nivel, double poderAtaque) {

        //iterar hasta encontrar ultimo elemento    
        Nodo nuevo = new Nodo(nombre, nivel, poderAtaque);//llamamos al constructor

        if (vacia()) {
            cabeza = nuevo;
        } else {
            fin.siguiente = nuevo;
        }

        fin = nuevo;
        fin.siguiente = null;
        return fin;//retorna puntero que s emodifica
    }

    Nodo InsertarInicio(Nodo inicio, String nombre, int nivel, double poderAtaque) {
        Nodo nuevo = new Nodo(nombre, nivel, poderAtaque);
        nuevo.siguiente = inicio;
        inicio = nuevo;
        cabeza = inicio; // Actualizamos la cabeza de la lista
        return inicio;
    }

    // Nuevo método: Borrar por nombre de Pokémon
    void BorrarPokemon(String nombre) {
        if (vacia()) {
            return;
        }

        if (cabeza.nombre.equals(nombre)) {
            cabeza = cabeza.siguiente;
            return;
        }

        Nodo anterior = cabeza;
        Nodo actual = cabeza.siguiente;

        while (actual != null) {
            if (actual.nombre.equals(nombre)) {
                anterior.siguiente = actual.siguiente; // Saltar el nodo a borrar
                return;
            }
            anterior = actual;
            actual = actual.siguiente;
        }
    }

    //verificar si esta vacia
    boolean vacia() {
        if (cabeza == null) {
            return true;
        } else {
            return false;
        }

    }
}
