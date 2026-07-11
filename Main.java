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
        Campeon prueba = new Campeon();
        
        Partida partida = new Partida();
        Equipo equipoAliado = new Equipo("Equipo azul");
        Equipo equipoEnemigo = new Equipo("Equipo rojo");

        //Campeones
        Campeon akali = new Campeon("Akali", 700, 30, 25,
            15, 300, 200);
        IAtacante atacante = akali;

        Campeon veigar = new Campeon("Veigar", 650, 20, 20,
            10, 300, 200);
        Campeon fizz = new Campeon("Fizz", 650, 25, 20,
            20, 300, 200);

        //Equipo enemigo
        Combatiente red = new Monstruo("red", 10, 50,
        30, 30, 100, 70);
        Combatiente blue = new Monstruo("blue", 2200,
         45, 20, 30, 100, 70);
        
        //Habilidades
        Habilidad rafagaCincoFilos = new Habilidad("Rafaga de los 5 filos", 100, 100, 100, 100);

        akali.agregarHabilidad(rafagaCincoFilos);
        
         //Items
        Item trinidad = new Item("trinidad", 33,
         333, 33, 0, 0,
          0);

        //Habilidades

        akali.agregarItem(trinidad);

        equipoAliado.agregarPersonaje(akali);
        equipoAliado.agregarPersonaje(fizz);
        equipoAliado.agregarPersonaje(veigar);

        equipoEnemigo.agregarPersonaje(red);
        equipoEnemigo.agregarPersonaje(minionMelee);

        System.out.println("===== COMBATE =====");


        atacante.getGolpeBasico();
        partida.generarPartida(equipoAliado, equipoEnemigo);
    }
}
