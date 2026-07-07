package combate;
import equipos.Equipo;
import personajes.Organico;

public class SistemaCombate { 

    public void imprimirVida(Organico objetivo){
        if(objetivo.getVida() > 0){
            System.out.println("vida restante de " + objetivo.getNombre() + "es: " + objetivo.getVida());
        }else{
            objetivo.setVida(0);
            System.out.println("vida restante de " + objetivo.getNombre() + " es: " + objetivo.getVida());
        }
    }
    
    public boolean verificarEquiposVivos(Equipo jugador, Equipo IA){
        
        return jugador.getEquipo() && IA.getEquipo();
        
    }
    
    public void revisarCombatiente(Organico objetivo){

        if (objetivo.getVida() <= 0) {

                objetivo.morir();

                System.out.println(objetivo.getNombre() + " a muerto");

            }

    }

    public void atacar(Organico atacante, Organico objetivo){
            
        objetivo.recibirGolpe(atacante.getGolpeBasico());
        System.out.println( atacante.getNombre() + " atacó a " + objetivo.getNombre());
        System.out.println(objetivo.getNombre() + " recibio " + atacante.getGolpeBasico() + " de daño");
        imprimirVida(objetivo);
        revisarCombatiente(objetivo);
        System.out.println("-----------------------------------------");

    }

    public void permisoAtacar(Organico atacante, Organico objetivo){
       
        if ( atacante.getVivo() && objetivo.getVivo() ) {
            atacar(atacante, objetivo);
        }
        
    }

}