package IAs;
import equipos.Equipo;
import personajes.Organico;

public class ControladorIA {

    public int elegirAccion(){
        return 1;
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