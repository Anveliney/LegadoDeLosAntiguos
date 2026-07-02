package partida;
import combate.SistemaCombate;
import combate.SistemaTurnos;
import equipos.Equipo;

public class Partida {
    
    SistemaCombate combate = new SistemaCombate();
    SistemaTurnos turno = new SistemaTurnos();

    public boolean generarPartida(Equipo jugador, Equipo IA){
         
        boolean resultado;

        if (combate.verificarEquiposVivos(jugador, IA)) {
            resultado = turno.turnoEquipo(jugador, IA);
        }else{
            resultado = false;
        }
        if(combate.verificarEquiposVivos(jugador, IA)){
            resultado = turno.turnoEquipo(IA, jugador);
        }

        return resultado;

    }
}
