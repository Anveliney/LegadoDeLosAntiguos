package personajes;
public class Minion extends Organico {

    public Minion(){
        super();
    }

    public Minion(String nombre, double vidaMaxima, double golpeBasico,
        double armadura, double resistenciaMagica,
        double oroOtorgado, double experienciaOtorgada
    ){

        super(nombre, vidaMaxima, golpeBasico, armadura,
            resistenciaMagica, oroOtorgado, experienciaOtorgada);
    }

    @Override
    public void subirNivel(){
        
    }
}
