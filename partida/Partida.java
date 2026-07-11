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
        System.out.println("=========================\n" + 
                            "FIN DEL COMBATE\n" + 
                            "=========================");
    }
}
