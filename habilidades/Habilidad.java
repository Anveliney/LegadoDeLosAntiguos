package habilidades;

public class Habilidad {

    private String nombre;
    private double costo;
    private double tiempoEnfriamiento;
    private double dano;
    private double curacion;

    public Habilidad(String nombre, double dano, double curacion) {

        this.nombre = nombre;
        this.dano = dano;
        this.curacion = curacion;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getTiempoEnfriamiento() {
        return tiempoEnfriamiento;
    }

    public void setTiempoEnfriamiento(double tiempoEnfriamiento) {
        this.tiempoEnfriamiento = tiempoEnfriamiento;
    }

    public double getDano() {
        return dano;
    }

    public void setDano(double dano) {
        this.dano = dano;
    }

    public double getCuracion() {
        return curacion;
    }

    public void setCuracion(double curacion) {
        this.curacion = curacion;
    }

}