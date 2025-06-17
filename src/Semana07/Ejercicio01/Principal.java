/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana07.Ejercicio01;

/**
 *
 * @author edumo
 */
public class Principal {

    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        Nodo fin = null;

        // Insertar 3 Pokémon al final
        fin = lista.InsertarFinal(fin, "Pikachu", 3, 30.1);
        fin = lista.InsertarFinal(fin, "Charizard", 4, 40.2);
        fin = lista.InsertarFinal(fin, "Bulbasaur", 5, 50.3);

        System.out.println("Lista después de inserciones al final:");
        imprimirLista(lista.cabeza);

        // Insertar 2 Pokémon al inicio 
        lista.InsertarInicio(lista.cabeza, "Squirtle", 1, 60.4);
        lista.InsertarInicio(lista.cabeza, "Edomocar", 2, 70.5);

        System.out.println("\nLista después de inserciones al inicio:");
        imprimirLista(lista.cabeza);

        // Eliminar
        System.out.println("\nEliminando a Edomocar:");
        lista.BorrarPokemon("Edomocar");
        imprimirLista(lista.cabeza);
    }

    // Método auxiliar para imprimir la lista
    public static void imprimirLista(Nodo nodo) {
        System.out.println("---------------------------------------------");
        System.out.println("| Nombre     | Nivel | Poder de Ataque |");
        System.out.println("---------------------------------------------");

        while (nodo != null) {
            System.out.printf("| %-10s | %5d | %15.2f | \n",
                    nodo.nombre, nodo.nivel, nodo.poderAtaque);
            nodo = nodo.siguiente;
            System.out.println(" -> null");
        }
        System.out.println("---------------------------------------------");
    }
}
