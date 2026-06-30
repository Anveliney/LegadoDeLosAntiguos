
import java.util.ArrayList;

public class Equipo {
    
    ArrayList<Campeon> equipoLista;

    public void agregarCampeon(Campeon campeon){
        equipoLista.add(campeon);
    }

    public void mostrarCampeon(){
        for (int i = 0; i < equipoLista.size(); i++) {
    System.out.println(equipoLista.get(i).getNombre());}
    }
}
