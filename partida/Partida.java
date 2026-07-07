package partida;
import combate.SistemaCombate;
import combate.SistemaTurnos;
import equipos.Equipo;

public class Partida {
    
    SistemaCombate combate = new SistemaCombate();
    SistemaTurnos turno = new SistemaTurnos();

    public void generarPartida(Equipo jugador, Equipo IA){
         
        boolean partidaActiva = true;

            while (partidaActiva) {

                if (combate.verificarEquiposVivos(jugador, IA)) {
                partidaActiva = turno.turnoEquipo(jugador, IA);

                if (combate.verificarEquiposVivos(jugador, IA) && partidaActiva) {
                    partidaActiva = turno.turnoEquipo(IA, jugador);
                }
                
                }else{

                partidaActiva = false;

            }
        }


    }

    public void ganarPartida(Equipo jugador, Equipo IA){

        if (!(jugador.getEquipo() && IA.getEquipo())) {

            System.out.println("Es un empate");

        }else if (!jugador.getEquipo()) {

            System.out.println(" Victoria!!");

        }else{

            System.out.println(" Derrota xD");
            
        }
    }
}
