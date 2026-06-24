
public class Campeon extends Combatiente{

    private double mana;
    private double experienciaRequerida;
    private double experienciaActual;

    public Campeon(){
        super();
    }

    public Campeon(String nombre, double vidaMaxima,
        double golpeBasico, double oroOtorgado, 
        double experienciaOtorgada  
    ){
        super(nombre, vidaMaxima, golpeBasico, oroOtorgado,
            experienciaOtorgada);

            this.experienciaActual = 0;
    }
}