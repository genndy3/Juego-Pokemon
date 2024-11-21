/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego_pokemonant;

import juego_pokemonant.Interfaz.Charmander;
import juego_pokemonant.Interfaz.Rattata;
import juego_pokemonant.Interfaz.Squirtle;
import juego_pokemonant.Interfaz.Psyduck;

/**
 *
 * @author MadellineAraya
 */
public class ListaPokemon {
    private Nodo cabeza;
    private static ListaPokemon listaPokemonJugador = new ListaPokemon();
    private static ListaPokemon listaPokemonCpu = new ListaPokemon();

    public ListaPokemon() {
        this.cabeza = null;
    }

    public void insertar(Pokemon poke) 
    {
        //Crea un nodo con la informacion del pokemon
        Nodo nuevoNodo = new Nodo(poke); 
  
        //Si la lista esta vacía crea un nodo en la cabeza(inicio)
        if (cabeza == null) 
        {
            cabeza = nuevoNodo; //establece un nuevo nodo
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                //avanza al siguiente nodo llegando al ultimo
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
            //Pone el ultimo nodo al nuevo nodo
        }
    }
    
    // Se crea un metodo para verificar si existe el Pokemon en la lista actual, el cual recibe un nombre a buscar.
    public boolean existe(String nombre) {
        boolean esta = false; // Inicializamos la variable esta como false.
        Nodo aux = cabeza;
        while (aux.getSiguiente() != null && !aux.getPokemon().getNombre().equals(nombre)) { // Recorremos la lista comparando con el nombre dado.
            aux = aux.getSiguiente();
        }
        if (aux.getPokemon().getNombre().equals(nombre)) { // Preguntamos si el nombre en la lista es igual al dado.
            esta = true; // Si es igual, cambiamos el valor de "esta" a true.
            return esta; // Retornamos el valor.
        } else {
            return esta; // Si el nombre no se encontro, retornamos el valor a como se inicializo, o sea, false.
        }
    }

    @Override
    public String toString() {
        Nodo aux = cabeza;
        String s = "";
        while (aux != null) {
            s += aux;
            aux = aux.getSiguiente();
        }
        return s;
    }

    public Nodo getCabeza() {
        return cabeza;
    }
    
     public int tamano() {
        int tamaño = 0;
        Nodo actual = cabeza;
        while (actual != null) {
            tamaño++;
            actual = actual.getSiguiente();
        }
        return tamaño;
    }
     
     public Nodo NodoEnIndice(int indice) {                           
        int contador = 0;
        Nodo actual = cabeza;
        while (actual != null) {
            if (contador == indice) {
                return actual;   
            }
            contador++;
            actual = actual.getSiguiente();
        }
        return null;
    }
 
    public void crearListas() {
        listaPokemonCpu.insertar(new Pokemon("Squirtle", 190, "Agua",
                55, 45, 80, 65));//1
        listaPokemonCpu.insertar(new Pokemon("Psyduck", 190, "Agua",
                55, 45, 80, 65));//2
        listaPokemonCpu.insertar(new Pokemon("Wartortle", 190, "Agua",
                55, 45, 80, 65));//3

        listaPokemonCpu.insertar(new Pokemon("Charmander", 115, "Fuego",
                70, 45, 80, 60));//4
        listaPokemonCpu.insertar(new Pokemon("Ninetales", 115, "Fuego",
                70, 45, 80, 60));//5
        listaPokemonCpu.insertar(new Pokemon("Vulpix", 115, "Fuego",
                70, 45, 80, 60));//6
        
        listaPokemonCpu.insertar(new Pokemon("Rattata", 150, "Normal",
                50, 35, 70, 60));//7
        listaPokemonCpu.insertar(new Pokemon("Persian", 150, "Normal",
                50, 35, 70, 60));//8
        listaPokemonCpu.insertar(new Pokemon("Eevee", 150, "Normal",
                50, 35, 70, 60));//9*/

        listaPokemonJugador.insertar(new Pokemon("Squirtle", 190, "Agua",
                55, 45, 80, 65));//1
        listaPokemonJugador.insertar(new Pokemon("Psyduck", 190, "Agua",
                55, 45, 80, 65));//2
        listaPokemonJugador.insertar(new Pokemon("Wartortle", 190, "Agua",
                55, 45, 80, 65));//3
        
        listaPokemonJugador.insertar(new Pokemon("Charmander", 115, "Fuego",
                70, 45, 80, 60));//4
        listaPokemonJugador.insertar(new Pokemon("Ninetales", 115, "Fuego",
                70, 45, 80, 60));//5
        listaPokemonJugador.insertar(new Pokemon("Vulpix", 115, "Fuego",
                70, 45, 80, 60));//6
        
        listaPokemonJugador.insertar(new Pokemon("Rattata", 150, "Normal",
                50, 35, 70, 60));//7
        listaPokemonJugador.insertar(new Pokemon("Persian", 150, "Normal",
                50, 35, 70, 60));//8
        listaPokemonJugador.insertar(new Pokemon("Eevee", 150, "Normal",
                50, 35, 70, 60));
    }

    
    public ListaPokemon getListaPokemonJugador() {
        return listaPokemonJugador;
    }

    public ListaPokemon getListaPokemonCpu() {
        return listaPokemonCpu;
    }

}
