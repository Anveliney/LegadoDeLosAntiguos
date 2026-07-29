package org.example.partida;
import org.example.Sistemas.SistemaRondas;
import org.example.equipos.Equipo;

public class Partida {
    
   private final SistemaRondas sistemaRondas = new SistemaRondas();

    public void generarPartida(Equipo jugador, Equipo IA){
         
        boolean partidaActiva = true;

            while (partidaActiva) {

                partidaActiva = sistemaRondas.obtenerRonda(jugador, IA);

            }

            ganarPartida(jugador, IA);

        }


    public void ganarPartida(Equipo jugador, Equipo IA){

        terminarCombate();

        if (!jugador.getEquipoVivo() && !IA.getEquipoVivo()) {

            System.out.println(" Es un empate");

        }else if (!jugador.getEquipoVivo()) {

            System.out.println("El ganador es " + IA.getNombre());

        }else{

           System.out.println("El ganador es " + jugador.getNombre());
            
        }
        
    }

    public void terminarCombate(){
        System.out.println("""
                           =========================
                           FIN DEL COMBATE
                           =========================
                        """);
    }
}
