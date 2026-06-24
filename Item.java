public class Item {
    
    private String nombreItem;
    private double danoItem;
    private double vidaItem;
    private double manaItem;

    public Item(String nombreItem ,double  danoItem, double vidaItem, double  manaItem){
        this.nombreItem = nombreItem;
        this.danoItem = danoItem;
        this.vidaItem = vidaItem;
        this.manaItem = manaItem;
    }

    public double getDanoItem() {
        return danoItem;
    }

    public void setNombreItem(String nombreItem){
        this.nombreItem = nombreItem;
    }

    public String getNombreItem(){
        return nombreItem;
    }

    public void setDanoItem(double danoItem) {
        this.danoItem = danoItem;
    }

    public double getVidaItem() {
        return vidaItem;
    }

    public void setVidaItem(double vidaItem) {
        this.vidaItem = vidaItem;
    }

    public double getManaItem() {
        return manaItem;
    }

    public void setManaItem(double manaItem) {
        this.manaItem = manaItem;
    }

}
