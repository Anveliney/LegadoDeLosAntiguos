package combate;
import equipos.Equipo;
import personajes.Organico;

public class SistemaCombate { 
    
    public boolean verificarEquiposVivos(Equipo jugador, Equipo IA){
        
        return jugador.getEquipo() && IA.getEquipo();
        
    }
    
    public boolean revisarCombatiente(Organico objetivo){

        if (objetivo.getVida() <= 0) {

                objetivo.morir();

                System.out.println(objetivo.getNombre() + " a muerto");
                
                return false;

            }else{
                return true;
            }

    }

    public boolean atacar(Organico atacante, Organico objetivo){
            
        objetivo.recibirGolpe(atacante.getGolpeBasico());
        System.out.println( atacante.getNombre() + " atacó a " + objetivo.getNombre());
        if (objetivo.getVida() > 0) {
                System.out.println( "vida restante de " + objetivo.getNombre() + " " + objetivo.getVida());
            }
        return revisarCombatiente(objetivo);

    }

    public boolean permisoAtacar(Organico atacante, Organico objetivo){
       
        if ( atacante.getVivo() && objetivo.getVivo() ) {
            return this.atacar(atacante, objetivo);
        }else{
            return  false;
        }
        
    }

}