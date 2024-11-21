package juego_pokemonant;

/**
 *
 * @author MadellineAraya
 */
public class Nodo {
     private Pokemon poke; //Acá  se almacena el pokemon
    private Nodo siguiente; //Puntero

    public Nodo(Pokemon poke) {
        this.poke = poke;
        this.siguiente = null;
    }

    public Pokemon getPokemon(){//Retorna el pokemon que esta en el nodo
        return poke;
    }
    public Nodo getSiguiente(){//Retorna el nodo que sigue
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente){ //establece el siguiente ndo
        this.siguiente=siguiente;
    }

    @Override
    public String toString() {
        return "Nodo" + poke;
    }
}
