import java.util.ArrayList;

public class Combatiente extends Organico{

    ArrayList<Habilidad> listaHabilidades;

    public Combatiente(){
        super();
    }
    
    public Combatiente(String nombre, double vidaMaxima, double golpeBasico,
        double armadura, double resistenciaMagica,
        double oroOtorgado, double experienciaOtorgada
    ){

        super(nombre, vidaMaxima, golpeBasico,
            armadura, resistenciaMagica, oroOtorgado, 
            experienciaOtorgada);

            this.listaHabilidades = new ArrayList<>();

    }

    public void agregarHabilidad(Habilidad habilidad){
        this.listaHabilidades.add(habilidad);
    }

    @Override
    public void subirNivel(){
        this.setNivel(this.getNivel() + 1);
    }


}
