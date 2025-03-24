package mx.unam.aragon.modelo;

public class Plumon {
    private String marca;
    private String color;
    private String tamano;

    //métodos
    public void pintar(){
        color = "negro";
        this.marca = "Azor";
    }
    public void segundo(){
    }
    
    //Para pensar: Revisar mejor la sintaxis.
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca= marca;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

}
