package mx.unam.aragon.modelo;

public class Computadora {
    //Atributos
    private Bocina bocina;
    private Monitor monitor;
    private Mouse mouse;
    private Procesador procesador;
    private Teclado teclado;
    //Constructor
    public Computadora(){
    }
    //Get&Setter
    public Bocina getBocina() {
        return bocina;
    }

    public void setBocina(Bocina bocina) {
        this.bocina = bocina;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }
    //toString


    @Override
    public String toString() {
        return "Computadora{" +
                "bocina=" + bocina +
                ", monitor=" + monitor +
                ", mouse=" + mouse +
                ", procesador=" + procesador +
                ", teclado=" + teclado +
                '}';
    }
    //Metodos
    public void reproducirMultimedia(){
    }
    public void editarTexto(){
    }
    public void intercambiarArchivos(){
    }
    public void realizarOperaciones(){
    }
    public void establecerProtocolos(){
    }
}
