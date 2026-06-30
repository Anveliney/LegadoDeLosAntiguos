public class SistemaCombate {

    public boolean revisarCombatiente(Combatiente objetivo){

        boolean resultado = true;
        
        if (objetivo.getVida() <= 0) {

                objetivo.morir();

                System.out.println(objetivo.getNombre() + " a muerto");
                System.out.println("Combate finalizado");

                resultado = false;
            }

        return resultado;
    }

    public boolean atacar(Combatiente atacante, Combatiente objetivo){

        double dano = atacante.getGolpeBasico();
        boolean resultado;

        if (atacante.getVida() > 0 && objetivo.getVida() > 0 ) {
            
        objetivo.recibirGolpe(dano);
        System.out.println( atacante.getNombre() + " atacó a " + objetivo.getNombre());

            if (objetivo.getVida() > 0 ) {
                System.out.println( "vida de " + objetivo.getNombre() + " " + objetivo.getVida());
            }

        resultado = this.revisarCombatiente(objetivo);

        }else {
            resultado = false;
        }

        return resultado;

    }

    public boolean iniciarCombate(int numero, Combatiente combatiente1, Combatiente combatiente2){
        boolean resultado;
            if(numero == 0){
                System.out.println("Pasaste turno");
                resultado = this.atacar(combatiente2, combatiente1);
            }else if (numero == 1) {
                resultado = this.atacar(combatiente1, combatiente2);
                resultado = this.atacar(combatiente2, combatiente1);
            }else {
            System.out.println("Lograste huir");
            resultado = false;
            }
            return resultado;
        
    }

    public void recibirTurnoAtacar(Combatiente combatiente){
        if (true) {
            
        }
    }

}