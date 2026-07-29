package org.example.habilidades;

public class Habilidad {

    private String nombre;
    private double costo;
    private double tiempoEnfriamiento;
    private boolean disponibleEnfriamiento;
    private double enfriamientoRestante;
    private double dano;
    private double curacion;

    public Habilidad(){}

    public Habilidad(String nombre, double dano, double curacion, double costo, double tiempoEnfriamiento) {

        this.nombre = nombre;
        this.dano = dano;
        this.curacion = curacion;
        this.costo = costo;
        this.tiempoEnfriamiento = tiempoEnfriamiento;
        this.disponibleEnfriamiento = true;

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

    public boolean getDisponibleEnfriamiento() {
        return disponibleEnfriamiento;
    }

    public void setDisponibleEnfriamiento(boolean disponibleEnfriamiento) {
        this.disponibleEnfriamiento = disponibleEnfriamiento;
    }

    public double getEnfriamientoRestante() {
        return enfriamientoRestante;
    }

    public void setEnfriamientoRestante(double enfriamiento) {
        this.enfriamientoRestante = enfriamiento;
    }
}