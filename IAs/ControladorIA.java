package IAs;
import combate.SistemaHabilidades;
import equipos.Equipo;
import personajes.Combatiente;
import personajes.Organico;

public class ControladorIA {

    private final SistemaHabilidades habilidad = new SistemaHabilidades();

    public int elegirAccion(Equipo equipoTurno, Organico personaje){
        
        if (personaje instanceof Combatiente combatiente && habilidad.permitirLanzarHechizos(combatiente)) {

            return 2;
            
        }else{

            return 1;
        }
    }

    public int elegirHechizo(Combatiente combatiente){

        int indice = 0;
        double mejorDano = 0;
        
        for(int i = 0; i < combatiente.getTamanoListaHabilidad(); i++){
            
            double dano = combatiente.getHabilidad(i).getDano();

            if(dano > mejorDano && habilidad.permitirUsarHabilidad(combatiente.getHabilidad(i), combatiente)){
                mejorDano = dano;
                indice = i;
            }
            
        }

        return indice;

    }

    public int elegirObjetivo(Equipo equipoObjetivo){

        double menorVida = -1;
        int indice = -1;

        for (int i = 0; i < equipoObjetivo.getTamanoLista(); i++) {

            Organico personaje = equipoObjetivo.getPersonaje(i);
            
            if (!personaje.getVivo()) {
                continue;
            }

            double vida = personaje.getVida();

            if (menorVida == -1 || menorVida > vida) {

                 menorVida = vida;
                 indice = i;

             }

        }

        return indice;

    }

}