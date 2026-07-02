package combate;
import java.util.Scanner;
import equipos.Equipo;
import personajes.Organico;

public class SistemaTurnos {

    private SistemaCombate combate = new SistemaCombate();
    private Scanner scan = new Scanner(System.in);

    public boolean turnoEquipo(Equipo equipoTurno, Equipo equipoObjetivo) {

        for (int i = 0;
             i < equipoTurno.getTamañoLista()
             && combate.verificarEquiposVivos(equipoTurno, equipoObjetivo);
             i++) {

            Organico personaje = equipoTurno.getPersonaje(i);

            mostrarOpciones(personaje.getNombre());

            int opcion = scan.nextInt();

            switch (opcion) {

                case 0 -> pasarTurno(personaje);

                case 1 -> seleccionarObjetivo(personaje, equipoObjetivo);

                default -> {
                    System.out.println("Lograste huir");
                    return false;
                }
            }
        }

        return true;
    }

    private void mostrarOpciones(String nombre) {

        System.out.println("Es el turno de " + nombre);
        System.out.println("Selecciona una opción");
        System.out.println("0 - Pasar turno");
        System.out.println("1 - Atacar");
        System.out.println("Otro número - Huir");
    }

    private void pasarTurno(Organico personaje) {

        System.out.println(personaje.getNombre() + " pasó turno");

    }

    private void seleccionarObjetivo(Organico atacante,
                                     Equipo equipoObjetivo) {

        boolean decision = false;

        while (!decision) {

            mostrarObjetivos(equipoObjetivo);

            int numero = scan.nextInt();

            if (!indiceValido(numero, equipoObjetivo)) {

                System.out.println("Regresando...");
                return;

            }

            Organico objetivo = equipoObjetivo.getPersonaje(numero);

            if (objetivo.getVivo()) {

                combate.permisoAtacar(atacante, objetivo);
                decision = true;

            } else {

                System.out.println(objetivo.getNombre()
                        + " no se puede atacar.");

            }
        }
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

}