
import java.util.Scanner;

public class SistemaCombate { 

    Scanner scan = new Scanner(System.in);
    private int opcion;
    private int numero;

    public boolean tomarTurno(Equipo equipoTurno, Equipo equipoObjetivo){
        for(int i = 0; i < equipoTurno.getTamañoLista(); i++){
            System.out.println("Es el turno de " + equipoTurno.getPersonaje(i).getNombre());
            System.out.println("Selecciona una opcion");
            System.out.println("Preciona 0 para pasar turno");
            System.out.println("Preciona 1 para para atacar");
            System.out.println("Preciona cualquier otro numero para" +
            " huir");
            opcion = scan.nextInt();
            switch(opcion){
                case 0:

                    System.out.println(equipoTurno.getPersonaje(i).getNombre()
                     + "paso turno");
                    break;

                case 1:

                    System.out.println(equipoTurno.getPersonaje(i).getNombre() + 
                    ", ¿a quien desea atacar?");

                    for (int j = 0; j < equipoObjetivo.getTamañoLista(); j++) {
                        
                        System.out.println("Si quieres atacar a " +
                            equipoObjetivo.getPersonaje(j).getNombre() +
                            " preciona " + j);
                        
                    }

                    numero = scan.nextInt();
                    this.permisoAtacar(equipoTurno.getPersonaje(i),
                    equipoObjetivo.getPersonaje(numero));
                
                default:
                    System.out.println("Lograste huir");
                    return false;
            }
        }
        return true;
    }
    
    public boolean verificarEquiposVivos(Combatiente jugador, Combatiente IA){
        boolean resultado;
        resultado = jugador.getVivo() && IA.getVivo();
        return resultado;
    }

    public boolean revisarCombatiente(Organico objetivo){

        boolean resultado = true;
        
        if (objetivo.getVida() <= 0) {

                objetivo.morir();

                System.out.println(objetivo.getNombre() + " a muerto");
                System.out.println("Combate finalizado");

                resultado = false;
            }

        return resultado;
    }

    public boolean atacar(Organico atacante, Organico objetivo){

        double dano = atacante.getGolpeBasico();
        boolean resultado;
            
        objetivo.recibirGolpe(dano);
        System.out.println( atacante.getNombre() + " atacó a " + objetivo.getNombre());
        resultado = this.revisarCombatiente(objetivo);

            if (objetivo.getVivo()) {
                System.out.println( "vida restante de " + objetivo.getNombre() + " " + objetivo.getVida());
            }

        return resultado;

    }

    public boolean permisoAtacar(Organico atacante, Organico objetivo){
        boolean resultado;
        if ( atacante.getVivo() && objetivo.getVivo() ) {
            resultado = this.atacar(atacante, objetivo);
        }else{
            resultado = false;
        }
        return resultado;
    }

    public boolean combatir(Equipo equipoAliado, Equipo equipoEnemigo){
        boolean resultado;


        resultado = this.tomarTurno(equipoAliado, equipoEnemigo);
        resultado = this.tomarTurno(equipoEnemigo, equipoAliado);

        /*switch (numero) {
            case 0:
                System.out.println("Pasaste turno");
                resultado = this.permisoAtacarPersonaje(combatiente2, combatiente1);
                break;

            case 1:
                
                if (this.verificarEquiposVivos(combatiente1, combatiente2)) {
                    resultado = this.permisoAtacarPersonaje(combatiente1, combatiente2);
                }else{
                    resultado = false;
                }
                if(this.verificarEquiposVivos(combatiente1, combatiente2)){
                    resultado = this.permisoAtacarPersonaje(combatiente2, combatiente1);
                }

                break;

            default:
                System.out.println("Lograste huir");
                resultado = false;
                break;
        }*/
    }
}