package org.example.combate;

import org.example.habilidades.Habilidad;
import org.example.personajes.Combatiente;

public class SistemaHabilidades {
    
    public boolean permitirUsarHabilidad(Habilidad habilidad, Combatiente combatiente){

        return habilidad.getCosto() <= combatiente.getRecurso();

    }

    public void consumirRecurso(Habilidad habilidad, Combatiente combatiente){

        combatiente.setRecurso(combatiente.getRecurso() - habilidad.getCosto());

    }
    
    public boolean permitirLanzarHechizos(Combatiente combatiente){

        return obtenerHabilidadMenorConsumo(combatiente) <= combatiente.getRecurso();
        
    }

    public double obtenerHabilidadMenorConsumo(Combatiente combatiente){

        double menorCosto = combatiente.getHabilidad(0).getCosto();

        for(int i = 0; i < combatiente.getTamanoListaHabilidad(); i++){

            double costo = combatiente.getHabilidad(i).getCosto();

            if (costo < menorCosto) {
                
                menorCosto = costo;

            }
        }

        return menorCosto;

    }



}
