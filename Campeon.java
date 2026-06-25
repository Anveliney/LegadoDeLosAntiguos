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

            this.mana = 200;
            this.experienciaActual = 0;
            this.experienciaRequerida = 500;
    }

    @Override
    public void subirNivel(){
            this.setNivel(this.getNivel() + 1);  
    }

    public void adquirirExperiencia(double experienciaAdquirida){
        this.experienciaActual += experienciaAdquirida;
        if (this.experienciaActual >= this.experienciaRequerida) {
            this.experienciaRequerida += 500;
            this.subirNivel();
        }
    }
}