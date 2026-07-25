import equipos.Equipo;
import habilidades.Habilidad;
import items.Item;
import partida.Partida;
import personajes.*;

public class Main {
    public static void main(String[] args) {

        boolean runMain = true;
        
        MinionCaster caster = new MinionCaster();
        MinionCaster caster2 = new MinionCaster();
        SuperMinion superMinion1 = new SuperMinion();
        MinionMelee minionMelee = new MinionMelee();
        MinionCannon MinionCannon1 = new MinionCannon();
        Combatiente sett = new Combatiente();
        
        Partida partida = new Partida();
        Equipo equipoAliado = new Equipo("Equipo azul", false);
        Equipo equipoEnemigo = new Equipo("Equipo rojo", true);

        //Campeones
        Campeon akali = new Campeon("Akali", 500, 30, 25,
            15, 300, 200, 100);
        IAtacante atacante = akali;

        Campeon veigar = new Campeon("Veigar", 400, 20, 20,
            10, 300, 200, 1000);
        Campeon fizz = new Campeon("Fizz", 650, 25, 20,
            20, 300, 200, 700);

        //Equipo enemigo
        Monstruo dragon = new Monstruo("Dragon", 1000, 50,
        30, 30, 100, 70, 100);
        Monstruo blue = new Monstruo("blue", 2200,
         45, 20, 30, 100, 70, 100);
        
        //Habilidades
        Habilidad rafagaCincoFilos = new Habilidad("Rafaga de los 5 filos", 300, 0, 120);
        Habilidad ataqueMaligno = new Habilidad("Ataque maligno", 70, 0, 60);
        Habilidad alientoFuego = new Habilidad("Aliento de Fuego", 200, 0, 20);
        Habilidad pisada = new Habilidad("Pisada", 300, 0, 10);

        akali.agregarHabilidad(rafagaCincoFilos);
        veigar.agregarHabilidad(ataqueMaligno);
        dragon.agregarHabilidad(alientoFuego);
        dragon.agregarHabilidad(pisada);
        
         //Items
        Item trinidad = new Item("trinidad", 33,
         333, 33, 0, 0,
          0);

        //Habilidades

        akali.agregarItem(trinidad);

        equipoAliado.agregarPersonaje(akali);
        equipoAliado.agregarPersonaje(fizz);
        equipoAliado.agregarPersonaje(veigar);

        equipoEnemigo.agregarPersonaje(dragon);
        equipoEnemigo.agregarPersonaje(minionMelee);

        System.out.println("===== COMBATE =====");


        atacante.getGolpeBasico();
        partida.generarPartida(equipoAliado, equipoEnemigo);
    }
}
