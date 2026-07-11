package personajes;
import habilidades.Habilidad;
import java.util.ArrayList;

public class Combatiente extends Organico{

    ArrayList<Habilidad> listaHabilidades;
    private static final int MAX_HABILIDADES = 4;

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
        if(listaHabilidades.size() <= MAX_HABILIDADES){
            listaHabilidades.add(habilidad);
        }
    }

    public void obtenerHabilidades(){
        for(int i = 0; i < listaHabilidades.size(); i++){
            System.out.println(listaHabilidades.get(i).getNombreHabilidad());
        }
    }

    @Override
    public void subirNivel(){
        System.out.println("Subir de nivel de Combatiente");
    }


}
