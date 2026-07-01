
import java.util.ArrayList;

public class Equipo {
    
    private ArrayList<Organico> equipoLista;

    public Equipo(){
        this.equipoLista = new ArrayList<>();
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

    public int getTamañoLista(){
        return equipoLista.size();
    }

    public Organico getPersonaje(int numero){
        return equipoLista.get(numero);
    }

    public boolean equipoVivo(){
        
        for (int i = 0; i < equipoLista.size(); i++) {
            if(equipoLista.get(i).getVivo()){
                return true;
            }
        }
        return false;
    }
}

