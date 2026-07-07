package combate;
import equipos.Equipo;
import java.util.Scanner;
import personajes.Organico;

public class SistemaTurnos {

    private final SistemaCombate combate = new SistemaCombate();
    private final Scanner scan = new Scanner(System.in);

    public boolean turnoEquipo(Equipo equipoTurno, Equipo equipoObjetivo) {

        for (int i = 0;
             i < equipoTurno.getTamañoLista()
             && combate.verificarEquiposVivos(equipoTurno, equipoObjetivo);
             i++) {

            Organico personaje = equipoTurno.getPersonaje(i);
            boolean turnoFinalizado = false;
            System.out.println("Es el turno de " + personaje.getNombre());

            while (!turnoFinalizado) {

                mostrarOpciones();
                int opcion = leerNumero();
            
                switch (opcion) {

                case 0 -> {
                    pasarTurno(personaje);
                    turnoFinalizado = true;
                    } 

                case 1 -> turnoFinalizado = seleccionarObjetivo(personaje, equipoObjetivo);

                default -> {
                    System.out.println("Lograste huir");
                    return false;
                    }
                }   
            }

        }

        return true;
    }

    private void mostrarOpciones() {

        System.out.println("Selecciona una opción");
        System.out.println("0 - Pasar turno");
        System.out.println("1 - Atacar");
        System.out.println("Otro número - Huir");
        separador();
    }

    private void pasarTurno(Organico personaje) {

        System.out.println(personaje.getNombre() + " pasó turno");
        separador();

    }

    private boolean seleccionarObjetivo(Organico atacante,
                                     Equipo equipoObjetivo) {

            mostrarObjetivos(equipoObjetivo);

            int numero = leerNumero();

            if (!indiceValido(numero, equipoObjetivo)) {

                System.out.println("Regresando...");
                separador();
                return false;

            }

            Organico objetivo = equipoObjetivo.getPersonaje(numero);

            if (objetivo.getVivo()) {

                combate.permisoAtacar(atacante, objetivo);

            } else {

                System.out.println(objetivo.getNombre()
                        + " no se puede atacar.");
                return false;

            }
        
        return true;
    }

    private void mostrarObjetivos(Equipo equipoObjetivo) {

        System.out.println("¿A quién deseas atacar?");

        for (int i = 0; i < equipoObjetivo.getTamañoLista(); i++) {

            Organico personaje = equipoObjetivo.getPersonaje(i);

            if (personaje.getVivo()) {

                System.out.println(
                        i + " - " + personaje.getNombre());

            }
        }

        System.out.println("Otro número - Regresar");

    }

    private boolean indiceValido(int numero, Equipo equipo) {

        return numero >= 0 && numero < equipo.getTamañoLista();

    }

    private int leerNumero(){
        
        while (true) {

            if (scan.hasNextInt()) {

                return scan.nextInt();

                } else {

                    System.out.println("Eso no es un número.");

                    mostrarOpciones();

                    scan.next();

                }

            }
    }

    private void separador(){
        System.out.println("-----------------------------------------");
    }

}