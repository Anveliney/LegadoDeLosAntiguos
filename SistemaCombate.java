
import java.util.Scanner;

public class SistemaCombate {

    Scanner scan = new Scanner(System.in);

    public void atacar(Combatiente atacante, Combatiente objetivo){

        double dano = atacante.getGolpeBasico();

        objetivo.recibirGolpe(dano);

        System.out.println( atacante.getNombre() + " atacó a " + objetivo.getNombre());
        System.out.println( objetivo.getNombre() + " recibio un daño de " +
        dano + " puntos!");

    }

    public boolean seleccionarOpcion(int opcion){
        boolean resultado = true;
        if(opcion == 0){
            System.out.println("Pasaste turno");
        }else if (opcion == 1) {
            System.out.println("¿Quien esta atacando?");
                Combatiente atacante = scan.next
        }else {
            System.out.println("Proceso finalizado");
            resultado = false;
        }
        return resultado;
    }
}