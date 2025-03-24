package mx.unam.aragon.modelo;

public class Procesador {
    //atributos
    private String generacion;
    private String modelo;
    private String hilos;
    private String velocidad;
    //Get&Setter

    public String getGeneracion() {
        return generacion;
    }

    public void setGeneracion(String generacion) {
        this.generacion = generacion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getHilos() {
        return hilos;
    }

    public void setHilos(String hilos) {
        this.hilos = hilos;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }
    //toString

    @Override
    public String toString() {
        return "Procesador{" +
                "generacion='" + generacion + '\'' +
                ", modelo='" + modelo + '\'' +
                ", hilos='" + hilos + '\'' +
                ", velocidad='" + velocidad + '\'' +
                '}';
    }
    //Métodos
    public void overclock(){
    }
    public void limiteDeMemoria(){
    }
    public void eleccionDeNucleos(){
    }
    public void limitarFrecuencia(){
    }

}
