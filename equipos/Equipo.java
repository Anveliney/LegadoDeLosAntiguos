package equipos;
import IAs.ControladorIA;
import java.util.ArrayList;
import personajes.Organico;

public class Equipo {
    
    private ArrayList<Organico> equipoLista;
    private String nombre;
    private boolean IA;
    private ControladorIA controlador;

    public Equipo(){}

    public Equipo(String nombre, boolean IA){

        this.equipoLista = new ArrayList<>();
        this.nombre = nombre;
        this.IA = IA;

        if (this.IA) {
            controlador = new ControladorIA();
        }
    }

    public void agregarPersonaje(Organico personaje){
        equipoLista.add(personaje);

    }

    public void mostrarPersonaje(){
        for (int i = 0; i < equipoLista.size(); i++) {
            System.out.println(equipoLista.get(i).getNombre());
        }
    }

    public ArrayList<Organico> getEquipoLista() {
        return equipoLista;
    }

    public void setEquipoLista(ArrayList<Organico> equipoLista) {
        this.equipoLista = equipoLista;
    }

    public int getTamanoLista(){
        return equipoLista.size();
    }

    public Organico getPersonaje(int numero){
        return equipoLista.get(numero);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getEquipoVivo(){
        
        for (int i = 0; i < equipoLista.size(); i++) {
            if(equipoLista.get(i).getVivo()){
                return true;
            }
        }
        return false;
    }

    public boolean getIA() {
        return IA;
    }

    public void setIA(boolean IA) {
        this.IA = IA;
    }

    public ControladorIA getControlador() {
        return controlador;
    }

    public void setControlador(ControladorIA controlador) {
        this.controlador = controlador;
    }

    public int calcularVivos(){
        int contador = 0;

        for (int i = 0; i < equipoLista.size(); i++) {
            if (equipoLista.get(i).getVivo()) {
                contador++;
            }    
        }

        return contador;
        
    }
    
}

