import java.util.ArrayList;

public class Combatiente extends Organico{

    public Combatiente(){
        super();
    }
    
    public Combatiente(String nombre, double vidaMaxima,
        double golpeBasico, double oroOtorgado, 
        double experienciaOtorgada
    ){

        super(nombre, vidaMaxima, golpeBasico, oroOtorgado, 
            experienciaOtorgada);

    }

    ArrayList<Habilidad> listaHabilidades;
    ArrayList<Item> listaItem;

    public void agregarHabilidad(Habilidad habilidad){
        listaHabilidades.add(habilidad);
    }

    public void agregarItem(Item item){
        listaItem.add(item);
    }

}
