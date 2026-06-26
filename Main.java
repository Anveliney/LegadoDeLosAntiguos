public class Main {
    public static void main(String[] args) {

        MinionCaster caster = new MinionCaster();
        MinionCaster caster2 = new MinionCaster();
        SuperMinion superMinion1 = new SuperMinion();
        MinionMelee MinionMelee1 = new MinionMelee();
        MinionCannon MinionCannon1 = new MinionCannon();


        Combatiente red = new Monstruo("red", 2000, 50, 30,
            30, 100, 70);
        Campeon akali = new Campeon("Akali", 700, 30, 25,
            15, 300, 200);

        

        Item trinidad = new Item("trinidad", 33,
         333, 33, 0, 0,
          0);

        akali.agregarItem(trinidad);
        
        System.out.println(akali.recibirGolpe(MinionCannon1.getGolpeBasico()));

    }
}