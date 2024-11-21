package juego_pokemonant;

import javax.swing.JOptionPane;
import juego_pokemonant.Interfaz.*;

public class Pokedex {
    private Nodo cabeza;
    private int contPoke = 0;
    // Se crea un contador para llevar la cuenta de los Pokemones seleccionados
    private int conta = 0; //Contador de la interfaz
    private static Pokedex listaPokemonJugador = new Pokedex();
    private static Pokedex listaPokemonCpu = new Pokedex();

    public Pokedex getListaPokemonJugador() {
        return listaPokemonJugador;
    }
    
    public Pokedex getListaPokemonCpu() {
        return listaPokemonCpu;
    }
    
    public Pokedex() {
        this.cabeza = null;
    }
    
    // Acá se insertan los pokemones que el usuario elija.
    public void insertar(Pokemon poke) {
        Nodo nuevo = new Nodo(poke); 
        if (cabeza == null) { // Se verifica si la lista esta vacia.
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza; 
            while (actual.getSiguiente() != null){
                actual = actual.getSiguiente(); // Si no esta vacia, recorremos la lista hasta llegar al ultimo.
            }
            actual.setSiguiente(nuevo); // Insertamos el Pokemon luego del ultimo.
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
    
    // Se crea un metodo para imprimir unicamente los nombres de los Pokemones.
    public String toStringNombre() {
        Nodo aux = cabeza;
        String s = "Tus Pokemones seleccionados son: ";
        while (aux != null) {
            s += aux.getPokemon().getNombre() + " ";
            aux = aux.getSiguiente();
        }
        return s;
    }
    
      public void escoger(ListaPokemon lista, String Pokemon){ //Metodo escoger poke de interfaz
           if (conta < 4){           
                 Nodo aux = lista.getCabeza();
                while (aux.getSiguiente() != null && !aux.getPokemon().getNombre().equals(Pokemon)) { // Si no, recorremos la lista de Pokemones hasta encontrar el que el usuario quiere.
                    aux = aux.getSiguiente();
            }
            if (aux.getPokemon().getNombre().equals(Pokemon)) { // Verificamos que el nombre del Pokemon de la lista sea igual al que ingresa el usuario.
                insertar(aux.getPokemon()); // Llamamos el metodo insertar creando la lista de Pokemones seleccionados por el usuario.
                conta++;

                EligePoke e = new EligePoke(); //Obtener cada poke para la interfaz EligePoke
                Nodo aux1 = lista.getCabeza(); //Nodo nuevo aux1

                while (aux1 != null && !aux1.getPokemon().getNombre().equals(Pokemon)) {
                    aux1 = aux1.getSiguiente(); //Recorre la lista y busca el poke deseado
                }

                if (conta == 1) { //Usuario selecciona primer pokemon
                    if (aux1 != null) { //Verifica que no sea nulo
                        e.setPokemonSeleccionado1(aux1.getPokemon().getNombre());
                        //Llama el set de la clase EligePoke para almacenar el pokemon
                    }
                } else if (conta == 2) {
                    if (aux1 != null) {
                        e.setPokemonSeleccionado2(aux1.getPokemon().getNombre());
                    }
                } else if (conta == 3) {
                    if (aux1 != null) {
                        e.setPokemonSeleccionado3(aux1.getPokemon().getNombre());
                    }
                } else {
                    if (aux1 != null) {
                        e.setPokemonSeleccionado4(aux1.getPokemon().getNombre());
                        EligePoke abrir = new EligePoke();
                        abrir.setVisible(true);
                    }
                }
            }

        }

    } 
          
    // Se crea un metodo para verificar si existe el Pokemon en la lista actual, el cual recibe un nombre a buscar.
    public boolean existe(String nombre) {
        boolean esta = false; // Inicializamos la variable esta como false.
        Nodo aux = cabeza;
        if (aux == null){
        return esta; }
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

    // Se crea un metodo para verificar si existe el Pokemon en la lista actual, el cual recibe un nombre a buscar.
    public boolean existePokedex(String nombre, Pokedex lista) {
        boolean esta = false; // Inicializamos la variable esta como false.
        Nodo aux = lista.cabeza;
        if (aux == null) {
            return esta;
        }
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

     //este metodo ayuda a generar un numero aleatorio para ser utilizado en metodo "escogerPokeCpu"
    private int generarNumeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }        

    public void escogerPokeCpu(ListaPokemon lista) {

        int listaTamano = lista.tamano();
        while (contPoke < 4 && listaTamano > 0) {
            int randomIndex = generarNumeroAleatorio(0, listaTamano - 1);
            Nodo aux = lista.NodoEnIndice(randomIndex);
            if (aux != null) {
                String nombrePokemon = aux.getPokemon().getNombre();
                if (!existe(nombrePokemon) && !existePokedex(nombrePokemon, listaPokemonCpu)) {
                    //if (!existe(nombrePokemon)) {
                    listaPokemonCpu.insertar(aux.getPokemon());
                    contPoke++;
                }
            }
            listaTamano--;
        }
    }
    
   
    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

     public void elimina(String nombre) {
        if (cabeza != null) {
            if (cabeza.getPokemon().getNombre().equals(nombre)) {
                cabeza = cabeza.getSiguiente();
            } else {

                Nodo aux = cabeza;
                while (!aux.getSiguiente().getPokemon().getNombre().equals(nombre) && aux.getSiguiente() != null) {
                    aux = aux.getSiguiente();
                }
                
                if (aux.getSiguiente().getPokemon().getNombre().equals(nombre)){
                    aux.setSiguiente(aux.getSiguiente().getSiguiente()); 
                }
            }
        }
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

    public void cambiarCabeza(String nombre){
        if (listaPokemonJugador.cabeza == null) {
            // La lista está vacía, no se puede hacer intercambio
            return;
        }

        if (listaPokemonJugador.cabeza.getPokemon().getNombre().equals(nombre)) {
            // El elemento ya está en la cabeza, no es necesario intercambiar
            return;
        }

        Nodo anterior = null;
        Nodo actual = listaPokemonJugador.cabeza;

        // Buscar el nodo con el valor dado
        while (actual != null && !actual.getPokemon().getNombre().equals(nombre)) {
            anterior = actual;
            actual = actual.getSiguiente();
        }
        if ( actual.getPokemon().getNombre().equals(nombre)){
        // Intercambiar el nodo encontrado con la cabeza
        anterior.setSiguiente(actual.getSiguiente());
        actual.setSiguiente(listaPokemonJugador.cabeza);
        }
        
    }
    
    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }
    
    
}
