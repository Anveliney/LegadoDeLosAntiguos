package tienda;
import items.Item;
import java.util.ArrayList;

public class Tienda {
    
    public Tienda(){

    }

    ArrayList<Item> listaItemsVenta;

    public void agregarItemVenta(Item item){
        listaItemsVenta.add(item);
    }
}
