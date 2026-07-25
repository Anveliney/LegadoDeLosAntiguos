package combate;
import equipos.Equipo;

public class SistemaRondas{

    private final SistemaCombate combate = new SistemaCombate();
    private final SistemaTurnos turno = new SistemaTurnos();
    private int numeroRonda = 1;

    public boolean obtenerRonda(Equipo jugador, Equipo IA){

        boolean partidaActiva;
        System.out.println("Ronda " + numeroRonda++);

        partidaActiva = turnoJugador(jugador, IA);
        return turnoIA(jugador, IA, partidaActiva);

    }



    public boolean turnoJugador(Equipo jugador, Equipo IA){

        if (combate.verificarEquiposVivos(jugador, IA)) {

                return turno.turnoEquipo(jugador, IA);

        }else{

            return false;

        }

    }


    
    public boolean turnoIA(Equipo jugador, Equipo IA, boolean partidaActiva){

        if (combate.verificarEquiposVivos(jugador, IA) && partidaActiva) {

                    return turno.turnoEquipo(IA, jugador);

                }else{

                return false;

                }

    }

}
