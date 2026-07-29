package org.example;


import org.example.DAO.CampeonDAO;
import org.example.DAO.MonstruoDAO;
import org.example.equipos.Equipo;
import org.example.partida.Partida;
import org.example.personajes.Campeon;
import org.example.personajes.Monstruo;
import org.example.habilidades.Habilidad;


public class Main {


    public static void main(String[] args) {


        CampeonDAO campeonDAO = new CampeonDAO();
        MonstruoDAO monstruoDAO = new MonstruoDAO();

        Habilidad cincoFilos = new Habilidad("Rafaga de los 5 filos",
                100, 0,20, 3);


        // Cargar desde BD

        Campeon akali = campeonDAO.buscarPorId(1);
        Campeon veigar = campeonDAO.buscarPorId(2);
        Campeon fizz = campeonDAO.buscarPorId(3);
        akali.agregarHabilidad(cincoFilos);


        Monstruo dragon = monstruoDAO.buscarPorId(3);
        Monstruo blue = monstruoDAO.buscarPorId(2);


        Equipo equipoAliado = new Equipo(
                "Equipo azul",
                false
        );


        Equipo equipoEnemigo = new Equipo(
                "Equipo rojo",
                true
        );


        equipoAliado.agregarPersonaje(akali);
        equipoAliado.agregarPersonaje(veigar);
        equipoAliado.agregarPersonaje(fizz);


        equipoEnemigo.agregarPersonaje(dragon);
        equipoEnemigo.agregarPersonaje(blue);



        Partida partida = new Partida();


        System.out.println("===== COMBATE =====");


        partida.generarPartida(
                equipoAliado,
                equipoEnemigo
        );


    }

}