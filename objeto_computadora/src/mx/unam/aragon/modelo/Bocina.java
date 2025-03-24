package mx.unam.aragon.modelo;

public class Bocina {
    private String tipoDePanel;
    private String tipoDeAltavoz;
    private String tamano;
    private String decibeles;
    private String canal;
    //Get&Setter

    public String getTipoDePanel() {
        return tipoDePanel;
    }

    public void setTipoDePanel(String tipoDePanel) {
        this.tipoDePanel = tipoDePanel;
    }

    public String getTipoDeAltavoz() {
        return tipoDeAltavoz;
    }

    public void setTipoDeAltavoz(String tipoDeAltavoz) {
        this.tipoDeAltavoz = tipoDeAltavoz;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getDecibeles() {
        return decibeles;
    }

    public void setDecibeles(String decibeles) {
        this.decibeles = decibeles;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }
    //toString

    @Override
    public String toString() {
        return "Bocina{" +
                "tipoDePanel='" + tipoDePanel + '\'' +
                ", tipoDeAltavoz='" + tipoDeAltavoz + '\'' +
                ", tamano='" + tamano + '\'' +
                ", decibeles='" + decibeles + '\'' +
                ", canal='" + canal + '\'' +
                '}';
    }
    //Métodos
    public void cambiarVolumen(){
    }
    public void mutear(){
    }
    public void cambiarCanal(){
    }
    public void alternarMonoStereo(){
    }

}
