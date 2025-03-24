package mx.unam.aragon.modelo;

public class Monitor {
    //Atributos
    private String marca;
    private String tamano;
    private String panel;
    private String tasaDeRefresco;
    private String acabado;
    //Get&Setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getTasaDeRefresco() {
        return tasaDeRefresco;
    }

    public void setTasaDeRefresco(String tasaDeRefresco) {
        this.tasaDeRefresco = tasaDeRefresco;
    }

    public String getPanel() {
        return panel;
    }

    public void setPanel(String panel) {
        this.panel = panel;
    }

    public String getAcabado() {
        return acabado;
    }

    public void setAcabado(String acabado) {
        this.acabado = acabado;
    }

    @Override
    public String toString() {
        return "Teclado{" +
                "marca='" + marca + '\'' +
                ", tamano='" + tamano + '\'' +
                ", panel='" + panel + '\'' +
                ", tasaDeRefresco='" + tasaDeRefresco + '\'' +
                ", acabado='" + acabado + '\'' +
                '}';
    }
    //Métodos
    public void encender(){
    }
    public void apagar(){
    }
    public void cambiarBrillo(){
    }
    public void modoDeVideo(){
    }
    public void entrada(){
    }

}
