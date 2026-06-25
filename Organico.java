public class Organico {
    private double vida;
    private double vidaMaxima;
    private String nombre;
    private double golpeBasico;
    private double oroOtorgado;
    private double experienciaOtorgada;
    private double nivel;

    public Organico() {

    }

    public Organico(String nombre) {
        this.nombre = nombre;
    }

    public Organico(String nombre, double vidaMaxima, double golpeBasico,
        double oroOtorgado, double experienciaOtorgada) {
        this.nombre = nombre;
        this.vida = vidaMaxima;
        this.vidaMaxima = vidaMaxima;
        this.golpeBasico = golpeBasico;
        this.experienciaOtorgada = experienciaOtorgada;
        this.oroOtorgado = oroOtorgado;
        this.nivel = 1;
    }

    public void subirNivel(){
        this.nivel++;   
    }

    public double recibirGolpe(double golpe){
        return this.vida -= golpe;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(double vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getGolpeBasico() {
        return golpeBasico;
    }

    public void setGolpeBasico(double golpeBasico) {
        this.golpeBasico = golpeBasico;
    }

    public double getOroOtorgado() {
        return oroOtorgado;
    }

    public void setOroOtorgado(double oroOtorgado) {
        this.oroOtorgado = oroOtorgado;
    }

    public double getExperienciaOtorgada() {
        return experienciaOtorgada;
    }

    public void setExperienciaOtorgada(double experienciaOtorgada) {
        this.experienciaOtorgada = experienciaOtorgada;
    }

    public double getNivel() {
        return nivel;
    }

    public void setNivel(double nivel) {
        this.nivel = nivel;
    }

}