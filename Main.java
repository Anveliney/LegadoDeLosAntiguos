public class Main {
    public static void main(String[] args) {

        boolean runMain = true;
        
        MinionCaster caster = new MinionCaster();
        MinionCaster caster2 = new MinionCaster();
        SuperMinion superMinion1 = new SuperMinion();
        MinionMelee minionMelee = new MinionMelee();
        MinionCannon MinionCannon1 = new MinionCannon();
        SistemaCombate Combate = new SistemaCombate();
        Equipo equipoAliado = new Equipo();
        Equipo equipoEnemigo = new Equipo();

        //Campeones
        Campeon akali = new Campeon("Akali", 700, 30, 25,
            15, 300, 200);
        Campeon veigar = new Campeon("Veigar", 650, 20, 20,
            10, 300, 200);
        Campeon fizz = new Campeon("Fizz", 650, 25, 20,
            20, 300, 200);


        Combatiente red = new Monstruo("red", 2000, 50,
        30, 30, 100, 70);
        Combatiente blue = new Monstruo("blue", 2200,
         45, 20, 30, 100, 70);

        Item trinidad = new Item("trinidad", 33,
         333, 33, 0, 0,
          0);

        akali.agregarItem(trinidad);

        equipoAliado.agregarPersonaje(akali);
        equipoAliado.agregarPersonaje(fizz);
        equipoAliado.agregarPersonaje(veigar);

        equipoEnemigo.agregarPersonaje(red);
        equipoEnemigo.agregarPersonaje(minionMelee);

        equipoAliado.mostrarPersonaje();
        equipoEnemigo.mostrarPersonaje();

        System.out.println("===== COMBATE =====");

        while(runMain == true){
            runMain = Combate.combatir(equipoAliado, equipoEnemigo);
        }
    }
}
