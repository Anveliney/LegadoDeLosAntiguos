public class Habilidad {
    
    private String nombreHabilidad;
    private double costoHabilidad;
    private double tiempoEnfriamiento;
    private double danoHabilidad;
    private double curacion;

    public Habilidad(String nombreHabilidad, double costoHabilidad,
         double tiempoEnfriamiento, double danoHabilidad, double curacion){

        this.nombreHabilidad = nombreHabilidad;
        this.costoHabilidad = costoHabilidad;
        this.tiempoEnfriamiento = tiempoEnfriamiento;
        this.danoHabilidad = danoHabilidad;
        this.curacion = curacion;

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

    public double getDanoHabilidad() {
        return danoHabilidad;
    }

    public void setDanoHabilidad(double danoHabilidad) {
        this.danoHabilidad = danoHabilidad;
    }

    public double getCuracion() {
        return curacion;
    }

    public void setCuracion(double curacion) {
        this.curacion = curacion;
    }

}
