package personajes;
public class Organico {
    private double vida;
    private double vidaMaxima;
    private String nombre;
    private double golpeBasico;
    private double armadura;
    private double resistenciaMagica;
    private double esquivar;
    private double oroOtorgado;
    private double experienciaOtorgada;
    private double nivel;
    private boolean vivo;

    public Organico() {

    }


    public Organico(String nombre) {
        this.nombre = nombre;
    }

    public Organico(String nombre, double vidaMaxima, double golpeBasico,
        double armadura, double resistenciaMagica,
        double oroOtorgado, double experienciaOtorgada) {
        this.nombre = nombre;
        this.vida = vidaMaxima;
        this.vidaMaxima = vidaMaxima;
        this.golpeBasico = golpeBasico;
        this.esquivar = 0;
        this.experienciaOtorgada = experienciaOtorgada;
        this.oroOtorgado = oroOtorgado;
        this.nivel = 1;
        this.vivo = true;
    }

    public void subirNivel(){
        System.out.println("Subir de nivel de Organico");   
    }

    public double recibirGolpe(double golpe){
        return this.vida -= golpe;
    }

    public void morir(){
        this.vivo = false;
    }

    public void revivir(){
        //pendiente
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

    public double getArmadura() {
        return armadura;
    }

    public void setArmadura(double armadura) {
        this.armadura = armadura;
    }

    public double getResistenciaMagica() {
        return resistenciaMagica;
    }

    public void setResistenciaMagica(double resistenciaMagica) {
        this.resistenciaMagica = resistenciaMagica;
    }

    public double getEsquivar() {
        return esquivar;
    }

    public void setEsquivar(double esquivar) {
        this.esquivar = esquivar;
    }

    public boolean getVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }



}