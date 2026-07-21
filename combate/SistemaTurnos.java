package combate;
import equipos.Equipo;
import habilidades.Habilidad;
import java.util.Scanner;
import personajes.Combatiente;
import personajes.Organico;

public class SistemaTurnos {

    private final SistemaCombate combate = new SistemaCombate();
    private final Scanner scan = new Scanner(System.in);

    public boolean turnoEquipo(Equipo equipoTurno, Equipo equipoObjetivo) {

        for (int i = 0;
             i < equipoTurno.getTamanoLista()
             && combate.verificarEquiposVivos(equipoTurno, equipoObjetivo);
             i++) {

            Organico personaje = equipoTurno.getPersonaje(i);
            boolean turnoFinalizado = false;
            System.out.println("Es el turno de " + personaje.getNombre());
            

            while (!turnoFinalizado) {

            mostrarOpciones();

            int opcion = obtenerNumeroAccion(equipoTurno);
            
                switch (opcion) {

                case 0 -> {
                    pasarTurno(personaje);
                    turnoFinalizado = true;
                    } 

                //ATAQUE
                case 1 ->{
                    double dano = personaje.getGolpeBasico();
                    turnoFinalizado = turnoAtaque(equipoTurno, personaje, dano, equipoObjetivo);
                } 
                
                case 2 -> turnoFinalizado = turnoHabilidad(equipoTurno, personaje, equipoObjetivo);

                default -> {
                    System.out.println("Lograste huir");
                    return false;
                    }
                }   
            }

        }

        return true;
    }

    //IMPRESIONES

    private void mostrarOpciones() {

        System.out.println("Selecciona una opción");
        System.out.println("0 - Pasar turno");
        System.out.println("1 - Atacar");
        System.out.println("2 - Usar Habilidad");
        System.out.println("Otro número - Huir");
        separador();
        
    }

    private void mostrarHabilidades(Combatiente combatiente){

        System.out.println("¿Que habilidad quieres usar?");
        combatiente.mostrarListaHabilidad();
        System.out.println("Otro número - Regresar");

    }

    private void pasarTurno(Organico personaje) {

        System.out.println(personaje.getNombre() + " pasó turno");
        separador();

    }

    private void separador(){
        System.out.println("-----------------------------------------");
    }

    //TIPOS DE TURNOS

    private boolean turnoHabilidad(Equipo equipoTurno, Organico personaje,
                                     Equipo equipoObjetivo){

        if(personaje instanceof Combatiente combatiente){

            mostrarHabilidades(combatiente);
            separador();

            int numero = leerNumero();
            if (!indiceValido(numero, combatiente.getTamanoListaHabilidad())) {

                System.out.println("Regresando...");
                separador();
                return false;

            }
            Habilidad habilidad = combatiente.getHabilidad(numero);
            double dano = habilidad.getDano();
            return turnoAtaque(equipoTurno, personaje, dano, equipoObjetivo);
            
        }else{
            System.out.println("Un Minion no puede usar habilidades");
            return false;
        }
        
    }

    private boolean turnoAtaque(Equipo equipoAtacante, Organico atacante,
                                        double dano, Equipo equipoObjetivo) {

            mostrarObjetivos(equipoObjetivo);

            int numero = obtenerNumeroAtaque(equipoAtacante, equipoObjetivo);

            int limite = equipoObjetivo.getTamanoLista();
            if (!indiceValido(numero, limite)) {

                System.out.println("Regresando...");
                separador();
                return false;

            }

            Organico objetivo = equipoObjetivo.getPersonaje(numero);

            if (objetivo.getVivo()) {

                combate.permisoAtacar(atacante, dano, objetivo);

            } else {

                System.out.println(objetivo.getNombre()
                        + " no se puede atacar.");
                return false;

            }
        
        return true;
    }

    //MOSTRAR OBJETIVOS

    private void mostrarObjetivos(Equipo equipoObjetivo) {

        System.out.println("¿A quién deseas atacar?");

        for (int i = 0; i < equipoObjetivo.getTamanoLista(); i++) {

            Organico personaje = equipoObjetivo.getPersonaje(i);

            if (personaje.getVivo()) {

                System.out.println(
                        i + " - " + personaje.getNombre());

            }
        }

        System.out.println("Otro número - Regresar");

    }

    //VERIFICADORES DE NUMEROS CORRECTOS

    private boolean indiceValido(int numero, int limite) {

        return numero >= 0  && numero < limite;

    }

    private int leerNumero(){
        
        while (true) {

            if (scan.hasNextInt()) {

                return scan.nextInt();

                } else {

                    System.out.println("Eso no es un número.");

                    scan.next();

                    System.out.println("> ");

                }

            }
    }


    //OBTENCION DE ELECCIONES

    public int obtenerNumeroAccion(Equipo equipoTurno){

        if (equipoTurno.getIA()) {

                    return equipoTurno.getControlador().elegirAccion();

                }else{

                    return leerNumero();

                }
    }

     public int obtenerNumeroAtaque(Equipo equipoTurno, Equipo equipoObjetivo){

        if (equipoTurno.getIA()) {

                    return equipoTurno.getControlador().elegirObjetivo(equipoObjetivo);

                }else{

                    return leerNumero();

                }
    }

}