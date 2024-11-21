
package juego_pokemonant;

import juego_pokemonant.Interfaz.EligePoke;
import juego_pokemonant.Interfaz.GanaCpu;
import juego_pokemonant.Interfaz.GanaUsuario;


public class BatallaP {

    // Contadores
    int contaTurnosCpuA = 0;
    int contaTurnosCpuD = 0;
    int contMuertes = 0;
    int contMuertesCpu = 0;
    int parar = 0;

    // Valores importantes para la batalla
    int escogeDefensa;
    int accionAleatoria;
    int defensa;
    int daño;
    int dañoAtaqueEspecial;
    int defensaEspecial;

    // Asignación de pokemones para la batalla
    private static Pokemon jugadorPokemon;
    private Pokemon cpuPokemon = getLista.getListaPokemonCpu().getCabeza().getPokemon();

    // Instancia de objetos de otras clases
    private static Pokedex getLista = new Pokedex();
    private static EligePoke pokemones = new EligePoke();

    public Pokemon escogerPoke(String pokemon) {
        Nodo aux = getLista.getListaPokemonJugador().getCabeza();
        while (aux != null && aux.getPokemon().getNombre() != pokemon) {
            aux = aux.getSiguiente();
        }
        if (aux.getPokemon().getNombre().equals(pokemon)) {
            jugadorPokemon = aux.getPokemon();
        }
        return jugadorPokemon;
    }

    public String checkbatallaCPU() {
        String text = "";
        // Verificamos que el Pokémon del CPU siga con vida después del ataque del jugador
        if (cpuPokemon.getVida() <= 0) {
            text += cpuPokemon.getNombre() + " (CPU) ha sido derrotado\n" ;
            getLista.getListaPokemonCpu().elimina(cpuPokemon.getNombre());
            contMuertesCpu++;
            if (contMuertesCpu != 4) {
                System.out.println(getLista.getListaPokemonCpu());
                cpuPokemon = getLista.getListaPokemonCpu().getCabeza().getPokemon();
                text +="CPU ha elegido a: " + cpuPokemon.getNombre()+"\n";
            } else {
                text +="¡El CPU se ha quedado sin Pokémones!"+"\n";
                parar = 2;
            }
        }
        return text;
    }

    public String checkbatallaJugador() {
        String text = "";
        // Verificamos que el Pokémon del jugador siga con vida después del ataque del CPU
        if (jugadorPokemon.getVida() <= 0) {
            contMuertes++;
            text += jugadorPokemon.getNombre() + " ha sido derrotado\n";
            getLista.getListaPokemonJugador().elimina(jugadorPokemon.getNombre());
            if (contMuertes != 4) {
                pokemones.btn1Pokemon();
                pokemones.btn2Pokemon();
                pokemones.btn3Pokemon();
                pokemones.btn4Pokemon();
                pokemones.setVisible(true);
            } else {
                text += "¡El jugador se ha quedado sin Pokémones!" + "\n";
                parar = 1;

            }
        }
        return text;
    }

    public String checkbatallaFinal() {
        String text = "";
        if (parar == 1) { // muestra en pantalla quien ha sido el ganador
            GanaCpu g = new GanaCpu ();
            g.setVisible(true);
            return text + "\n" + "¡El CPU ha ganado la batalla!";
        } else if (parar == 2) {
            GanaUsuario u = new GanaUsuario();
            u.setVisible(true);
            //u.dispose();
            return text + "\n" + "¡El jugador ha ganado la batalla!";
        }
        return text;
    }

    public String atacarJugador() {
        escogerDefensaCPU();
        return ataqueRegular(cpuPokemon, jugadorPokemon);
    }
    
     public String AtaqueEspecialJugador(){
        escogerDefensaCPU();
        return CheckAtaqueEspecialJugador();
    }

    public int turnoCPU() {
        do {
            accionAleatoria = generarNumeroAleatorio(1, 2);
        } while ((accionAleatoria == 2 && contaTurnosCpuA != 0));
        return accionAleatoria;
    }
    
     public String CheckAtaqueEspecialJugador() {
        //System.out.println(jugadorPokemon.getNombre() + " ha usado un ataque especial");
        if (jugadorPokemon.getTipo() == "Fuego") {
            if (cpuPokemon.getTipo() == "Normal") {
                return ataqueEspecial5(cpuPokemon, jugadorPokemon);
            } else {
                return ataqueEspecial(cpuPokemon, jugadorPokemon);
            }
        } else if (jugadorPokemon.getTipo() == "Agua") {
            if (cpuPokemon.getTipo() == "Fuego") {
                return ataqueEspecial10(cpuPokemon, jugadorPokemon);
            } else {
                return ataqueEspecial(cpuPokemon, jugadorPokemon);
            }
        } else if (jugadorPokemon.getTipo() == "Normal") {
            if (cpuPokemon.getTipo() == "Agua") {
                return ataqueEspecial5(cpuPokemon, jugadorPokemon);
            } else {
                return ataqueEspecial(cpuPokemon, jugadorPokemon);
            }
        }
        return "error metodo CheckAtaqueEspecialJugador"; 
    }

    
    public String checkAtaqueEspecialCPU() {
        //System.out.println(cpuPokemon.getNombre() + " (CPU) ha usado un ataque especial");
        if (cpuPokemon.getTipo() == "Fuego") {
            if (jugadorPokemon.getTipo() == "Normal") {
                return ataqueEspecial5(jugadorPokemon, cpuPokemon);
            } else {
                return ataqueEspecial(jugadorPokemon, cpuPokemon);
            }
        } else if (cpuPokemon.getTipo() == "Agua") {
            if (jugadorPokemon.getTipo() == "Fuego") {
                return ataqueEspecial10(jugadorPokemon, cpuPokemon);
            } else {
                return ataqueEspecial(jugadorPokemon, cpuPokemon);
            }
        } else if (cpuPokemon.getTipo() == "Normal") {
            if (jugadorPokemon.getTipo() == "Agua") {
               return ataqueEspecial5(jugadorPokemon, cpuPokemon);
            } else {
               return ataqueEspecial(jugadorPokemon, cpuPokemon);
            }
        }
        return "error metodo CheckAtaqueEspecialCPU"; 
    }
    
    public String ataqueRegular(Pokemon pokemonAtacado, Pokemon pokemonAtacante) {
        if (escogeDefensa == 1) {
            daño = pokemonAtacante.getAtaque() - pokemonAtacado.getDefensa();
        } else if (escogeDefensa == 2) {
            daño = pokemonAtacante.getAtaque() - defensaEspecial;
            //return pokemonAtacado.getNombre() + " ha bloqueado el ataque "
            //        + "utilizando defensa" + "\n" + "especial!"+ "\n";
        }

        String text = pokemonAtacante.getNombre() + " a usado ataque" + "\n";
        if (contaTurnosCpuA == 2 || contaTurnosCpuA == 1) {
            contaTurnosCpuA--;
        }
        if (contaTurnosCpuD == 2 || contaTurnosCpuD == 1) {
            contaTurnosCpuD--;
        }

        if (daño > 0) {
            pokemonAtacado.setVida(pokemonAtacado.getVida() - daño);

            pokemonAtacado.setDefensa(pokemonAtacado.getDefensa() - 5);
        } else {
           return pokemonAtacante.getNombre() + " no ha causado daño a " 
                   + pokemonAtacado.getNombre() + "\n";
        }
        
        return pokemonAtacante.getNombre() + " ha causado " + daño + " puntos "
                + "de daño a " + "\n" + pokemonAtacado.getNombre() + "\n";
    }

    public void escogerDefensaCPU() {
        int accionAleatoria;
        do {
            accionAleatoria = generarNumeroAleatorio(1, 2);

            if (accionAleatoria == 1) {
                escogeDefensa = 1;
            } else if (accionAleatoria == 2 && contaTurnosCpuD == 0) {
                if (cpuPokemon.getTipo() == "Fuego") {
                    if (jugadorPokemon.getTipo() == "Normal") {
                        defensaEspecial10(cpuPokemon);
                    } else {
                        defensaEspecial = cpuPokemon.getDefensaEspecial();
                    }
                } else if (cpuPokemon.getTipo() == "Agua") {
                    if (jugadorPokemon.getTipo() == "Fuego") {
                        defensaEspecial10(cpuPokemon);
                    } else {
                        defensaEspecial = cpuPokemon.getDefensaEspecial();
                    }
                } else if (cpuPokemon.getTipo() == "Normal") {
                    if (jugadorPokemon.getTipo() == "Agua") {
                        defensaEspecial5(cpuPokemon);
                    } else {
                        defensaEspecial = cpuPokemon.getDefensaEspecial();
                    }
                }
                escogeDefensa = 2;
            }
        } while (accionAleatoria == 2 && contaTurnosCpuD != 0);
    }

    public void defensaEspecialJugador() {
        escogeDefensa = 2;
        if (jugadorPokemon.getTipo() == "Fuego") {
            if (cpuPokemon.getTipo() == "Normal") {
                defensaEspecial10(jugadorPokemon);
            } else {
                defensaEspecial = jugadorPokemon.getDefensaEspecial();
            }
        } else if (jugadorPokemon.getTipo() == "Agua") {
            if (cpuPokemon.getTipo() == "Fuego") {
                defensaEspecial10(jugadorPokemon);
            } else {
                defensaEspecial = jugadorPokemon.getDefensaEspecial();
            }
        } else if (jugadorPokemon.getTipo() == "Normal") {
            if (cpuPokemon.getTipo() == "Agua") {
                defensaEspecial5(jugadorPokemon);
            } else {
                defensaEspecial = jugadorPokemon.getDefensaEspecial();
            }
        }

    } // fin method defensaJugador

    public void defensaEspecial5(Pokemon pokemonDefensa) {
        defensaEspecial = pokemonDefensa.getDefensaEspecial() + 5;
        contaTurnosCpuD = 2;
        if (contaTurnosCpuA == 2 || contaTurnosCpuA == 1) {
            contaTurnosCpuA--;
        }
    }

    public void defensaEspecial10(Pokemon pokemonDefensa) {
        defensaEspecial = pokemonDefensa.getDefensaEspecial() + 10;
        contaTurnosCpuD = 2;
        if (contaTurnosCpuA == 2 || contaTurnosCpuA == 1) {
            contaTurnosCpuA--;
        }
    }

    public String ataqueEspecial(Pokemon pokemonAtacado, Pokemon pokemonAtacante) {
        if (escogeDefensa == 1) {
            dañoAtaqueEspecial = pokemonAtacante.getAtaqueEspecial() - pokemonAtacado.getDefensa();
        } else if (escogeDefensa == 2) {
            dañoAtaqueEspecial = pokemonAtacante.getAtaqueEspecial() - defensaEspecial;
            //return pokemonAtacado.getNombre() + " ha bloqueado el ataque "
            //        + "utilizando defensa" + "\n" + "especial!"+"\n";
        }

        if (contaTurnosCpuD == 2 || contaTurnosCpuD == 1) {
            contaTurnosCpuD--;
        }
        
        if (dañoAtaqueEspecial > 0) {
            contaTurnosCpuA = 2;
            pokemonAtacado.setVida(pokemonAtacado.getVida() - dañoAtaqueEspecial);
            pokemonAtacado.setDefensa(pokemonAtacado.getDefensa() - 10);
            return pokemonAtacante.getNombre() + " ha causado " + dañoAtaqueEspecial
                    + " puntos de daño especial a " + "\n" + pokemonAtacado.getNombre() + "\n";
        } else {
            contaTurnosCpuA = 2;
            return pokemonAtacante.getNombre() + " no ha causado daño a " + pokemonAtacado.getNombre() + "\n";
        }
    }

    public String ataqueEspecial5(Pokemon pokemonAtacado, Pokemon pokemonAtacante) {
        if (escogeDefensa == 1) {
            dañoAtaqueEspecial = pokemonAtacante.getAtaqueEspecial() - pokemonAtacado.getDefensa();
        } else if (escogeDefensa == 2) {
            dañoAtaqueEspecial = pokemonAtacante.getAtaqueEspecial() - defensaEspecial;
            //return pokemonAtacado.getNombre() + " ha bloqueado el ataque "
            //        + "utilizando defensa" + "\n" + "especial!"+"\n";
        }
        
        if (contaTurnosCpuD == 2 || contaTurnosCpuD == 1) {
            contaTurnosCpuD--;
        }
   
        String text = pokemonAtacante.getNombre() + " a usado ataque especial" + "\n";

        if (dañoAtaqueEspecial > 0) {
            pokemonAtacado.setVida(pokemonAtacado.getVida() - dañoAtaqueEspecial + 5);
            contaTurnosCpuA = 2;
            pokemonAtacado.setDefensa(pokemonAtacado.getDefensa() - 10);
            return pokemonAtacante.getNombre() + " ha causado " + dañoAtaqueEspecial
                    + " puntos de daño especial a " + "\n" + pokemonAtacado.getNombre() + "\n";
        } else {
            contaTurnosCpuA = 2;
            return pokemonAtacante.getNombre() + " no ha causado daño a " + pokemonAtacado.getNombre() + "\n";
        }
    }

    public String ataqueEspecial10(Pokemon pokemonAtacado, Pokemon pokemonAtacante) {
        if (escogeDefensa == 1) {
            dañoAtaqueEspecial = pokemonAtacante.getAtaqueEspecial() - pokemonAtacado.getDefensa();
        } else if (escogeDefensa == 2) {
            dañoAtaqueEspecial = pokemonAtacante.getAtaqueEspecial() - defensaEspecial;
            //return pokemonAtacado.getNombre() + " ha bloqueado el ataque "
            //        + "utilizando defensa" + "\n" + "especial!"+"\n";

        }
        if (contaTurnosCpuD == 2 || contaTurnosCpuD == 1) {
            contaTurnosCpuD--;
        }

        if (dañoAtaqueEspecial > 0) {
            pokemonAtacado.setVida(pokemonAtacado.getVida() - dañoAtaqueEspecial + 10);
            contaTurnosCpuA = 2;
            pokemonAtacado.setDefensa(pokemonAtacado.getDefensa() - 10);
            return pokemonAtacante.getNombre() + " ha causado " + dañoAtaqueEspecial
                    + " puntos de daño especial a " + "\n" + pokemonAtacado.getNombre() + "\n";
        } else {
            contaTurnosCpuA = 2;
            return pokemonAtacante.getNombre() + " no ha causado daño a " + pokemonAtacado.getNombre() + "\n";
        }
    }


    private int generarNumeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
         
    public Pokemon getJugadorPokemon() {
        return jugadorPokemon;
    }

    public Pokemon getCpuPokemon() {
        return cpuPokemon;
    }

    public void setJugadorPokemon(Pokemon jugadorPokemon) {
        BatallaP.jugadorPokemon = jugadorPokemon;
    }

    public int getEscogeDefensa() {
        return escogeDefensa;
    }

    public void setEscogeDefensa(int escogeDefensa) {
        this.escogeDefensa = escogeDefensa;
    }

    public int getContaTurnosCpuA() {
        return contaTurnosCpuA;
    }

    public int getContaTurnosCpuD() {
        return contaTurnosCpuD;
    }
    
    
}
