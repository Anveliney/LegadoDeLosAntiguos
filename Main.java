import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean runMain = true;
        
        MinionCaster caster = new MinionCaster();
        MinionCaster caster2 = new MinionCaster();
        SuperMinion superMinion1 = new SuperMinion();
        MinionMelee MinionMelee1 = new MinionMelee();
        MinionCannon MinionCannon1 = new MinionCannon();
        SistemaCombate Combate = new SistemaCombate();


        Combatiente red = new Monstruo("red", 2000, 50, 30,
            30, 100, 70);
        Campeon akali = new Campeon("Akali", 700, 30, 25,
            15, 300, 200);

        

        Item trinidad = new Item("trinidad", 33,
         333, 33, 0, 0,
          0);

        akali.agregarItem(trinidad);
        
        System.out.println(akali.recibirGolpe(MinionCannon1.getGolpeBasico()));
        Combate.atacar(akali, red);

        while(runMain == true){
            System.out.println("Selecciona una opcion");
            System.out.println("Preciona 0 para pasar turno");
            System.out.println("Preciona 1 para para atacar");
            System.out.println("Preciona cualquier otro numero para" +
            " finalizar el proceso");
            int numero = scan.nextInt();
            runMain = Combate.seleccionarOpcion(numero);
        }
        
    }
}
