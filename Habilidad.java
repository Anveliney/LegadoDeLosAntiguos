public class Habilidad {
    
    private String nombreHabilidad;
    private double costoHabilidad;
    private double tiempoEnfriamiento;
    private double dañoHabilidad;

    public Habilidad(String nombreHabilidad, double costoHabilidad,
         double tiempoEnfriamiento, double dañoHabilidad){

        this.nombreHabilidad = nombreHabilidad;
        this.costoHabilidad = costoHabilidad;
        this.tiempoEnfriamiento = tiempoEnfriamiento;
        this.dañoHabilidad = dañoHabilidad;

    }

    public String getNombreHabilidad() {
        return nombreHabilidad;
    }

    public void setNombreHabilidad(String nombreHabilidad) {
        this.nombreHabilidad = nombreHabilidad;
    }

    public double getCostoHabilidad() {
        return costoHabilidad;
    }

    public void setCostoHabilidad(double costoHabilidad) {
        this.costoHabilidad = costoHabilidad;
    }

    public double getTiempoEnfriamiento() {
        return tiempoEnfriamiento;
    }

    public void setTiempoEnfriamiento(double tiempoEnfriamiento) {
        this.tiempoEnfriamiento = tiempoEnfriamiento;
    }

    public double getDañoHabilidad() {
        return dañoHabilidad;
    }

    public void setDañoHabilidad(double dañoHabilidad) {
        this.dañoHabilidad = dañoHabilidad;
    }

}
