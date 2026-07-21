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
        
        return jugador.getEquipoVivo() && IA.getEquipoVivo();
        
    }
    
    public void revisarCombatiente(Organico objetivo){

        if (objetivo.getVida() <= 0) {

                objetivo.morir();

                System.out.println(objetivo.getNombre() + " a muerto");

            }

    }

    public void atacar(Organico atacante, double dano, Organico objetivo){
            
        objetivo.recibirGolpe(dano);
        System.out.println( atacante.getNombre() + " atacó a " + objetivo.getNombre());
        System.out.println(objetivo.getNombre() + " recibio " + dano + " de daño");
        imprimirVida(objetivo);
        revisarCombatiente(objetivo);
        System.out.println("-----------------------------------------");

    }

    public void permisoAtacar(Organico atacante, double dano, Organico objetivo){
       
        if ( atacante.getVivo() && objetivo.getVivo() ) {
            atacar(atacante, dano, objetivo);
        }
        
    }

}