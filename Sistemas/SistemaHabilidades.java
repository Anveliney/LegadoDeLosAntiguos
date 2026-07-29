package org.example.Sistemas;

import org.example.habilidades.Habilidad;
import org.example.personajes.Combatiente;

public class SistemaHabilidades {
    
    public boolean permitirUsarHabilidad(Habilidad habilidad, Combatiente combatiente){

        return habilidad.getCosto() <= combatiente.getRecurso() && habilidad.getDisponibleEnfriamiento();

    }

    public void usarHabilidad(Habilidad habilidad, Combatiente combatiente){

        consumirRecurso(habilidad, combatiente);
        empezarEnfriamiento(habilidad, combatiente);

    }

    public void consumirRecurso(Habilidad habilidad, Combatiente combatiente){

        combatiente.setRecurso(combatiente.getRecurso() - habilidad.getCosto());

    }

    public void empezarEnfriamiento(Habilidad habilidad, Combatiente combatiente){

        habilidad.setDisponibleEnfriamiento(false);
        habilidad.setEnfriamientoRestante(habilidad.getTiempoEnfriamiento());

    }

    public void enfriarHabilidad(Habilidad habilidad){
        habilidad.setEnfriamientoRestante(habilidad.getEnfriamientoRestante() - 1);
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
