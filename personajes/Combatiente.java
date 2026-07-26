package org.example.personajes;
import org.example.habilidades.Habilidad;
import java.util.ArrayList;

public class Combatiente extends Organico{

    private double recursoMax;
    private double recurso;
    ArrayList<Habilidad> listaHabilidades;
    private static final int MAX_HABILIDADES = 4;

    public Combatiente(){
        super();
    }
    
    public Combatiente(String nombre, double vidaMaxima, double golpeBasico,
        double armadura, double resistenciaMagica,
        double oroOtorgado, double experienciaOtorgada,
        double recurso
    ){

        super(nombre, vidaMaxima, golpeBasico,
            armadura, resistenciaMagica, oroOtorgado, 
            experienciaOtorgada);

            this.listaHabilidades = new ArrayList<>();
            this.recursoMax = recurso;
            this.recurso = recurso;

    }

    public void agregarHabilidad(Habilidad habilidad){
        if(listaHabilidades.size() <= MAX_HABILIDADES){
            listaHabilidades.add(habilidad);
        }
    }

    public Habilidad getHabilidad(int numero){
        return listaHabilidades.get(numero);
    }

    public void mostrarListaHabilidad(){
        for(int i = 0; i < listaHabilidades.size(); i++){
            System.out.println(i + " - " + listaHabilidades.get(i).getNombre());
        }
    }

    public int getTamanoListaHabilidad(){
        return listaHabilidades.size();
    }

    public double getRecursoMax() {
        return recursoMax;
    }

    public void setRecursoMax(double recursoMax) {
        this.recursoMax = recursoMax;
    }

    public double getRecurso() {
        return recurso;
    }

    public void setRecurso(double recurso) {
        this.recurso = recurso;
    }

    @Override
    public void subirNivel(){
        System.out.println("Subir de nivel de Combatiente");
    }

}
