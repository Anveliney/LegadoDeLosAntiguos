package personajes;
import items.Item;
import java.util.ArrayList;

public class Campeon extends Combatiente implements INivelable{

    private double mana;
    private double critico;
    private double experienciaRequerida;
    private double experienciaActual;
    ArrayList<Item> listaItem;

    public Campeon(){
        super();
    }

    public Campeon(String nombre, double vidaMaxima, double golpeBasico,
        double armadura, double resistenciaMagica,
        double oroOtorgado, double experienciaOtorgada
    ){
        super(nombre, vidaMaxima, golpeBasico, armadura,
            resistenciaMagica, oroOtorgado,
            experienciaOtorgada);

            this.critico = 0;
            this.mana = 200;
            this.experienciaActual = 0;
            this.experienciaRequerida = 500;
            this.listaItem = new ArrayList<>();
    }

    public void agregarItem(Item item){
        listaItem.add(item);
    }

    public void curar(){
        //pendiente
    }

    @Override
    public void subirNivel(){
            setNivel(getNivel() + 1);  
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public double getCritico() {
        return critico;
    }

    public void setCritico(double critico) {
        this.critico = critico;
    }

    public double getExperienciaRequerida() {
        return experienciaRequerida;
    }

    public void setExperienciaRequerida(double experienciaRequerida) {
        this.experienciaRequerida = experienciaRequerida;
    }

    public double getExperienciaActual() {
        return experienciaActual;
    }

    public void setExperienciaActual(double experienciaActual) {
        this.experienciaActual = experienciaActual;
    }
    
}