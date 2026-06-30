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

        //Campeones
        Campeon akali = new Campeon("Akali", 700, 30, 25,
            15, 300, 200);
        Campeon veigar = new Campeon("Veigar", 650, 20, 20,
            10, 300, 200);
        Campeon fizz = new Campeon("Fizz", 650, 25, 20,
            20, 300, 200);


        Combatiente red = new Monstruo("red", 2000, 50, 30,
            30, 100, 70);

        Item trinidad = new Item("trinidad", 33,
         333, 33, 0, 0,
          0);

        akali.agregarItem(trinidad);

        System.out.println("===== COMBATE =====");

        while(runMain == true){
            System.out.println("Selecciona una opcion");
            System.out.println("Preciona 0 para pasar turno");
            System.out.println("Preciona 1 para para atacar");
            System.out.println("Preciona cualquier otro numero para" +
            " huir");
            int numero = scan.nextInt();
            runMain = Combate.iniciarCombate(numero, akali, red);
        }
    }
}
