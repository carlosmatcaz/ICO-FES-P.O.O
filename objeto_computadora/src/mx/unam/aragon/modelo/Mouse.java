package mx.unam.aragon.modelo;

public class Mouse {
    //Atributos
    private String dpi;
    private String forma;
    private String tipoDeElectronica;
    private String color;
    private String modoDeConexion;
    //Get&Setter

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getTipoDeElectronica() {
        return tipoDeElectronica;
    }

    public void setTipoDeElectronica(String tipoDeElectronica) {
        this.tipoDeElectronica = tipoDeElectronica;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModoDeConexion() {
        return modoDeConexion;
    }

    public void setModoDeConexion(String modoDeConexion) {
        this.modoDeConexion = modoDeConexion;
    }
    //toString

    @Override
    public String toString() {
        return "Mouse{" +
                "dpi='" + dpi + '\'' +
                ", forma='" + forma + '\'' +
                ", tipoDeElectronica='" + tipoDeElectronica + '\'' +
                ", color='" + color + '\'' +
                ", modoDeConexion='" + modoDeConexion + '\'' +
                '}';
    }
    //Métodos
    public void click(){
    }
    public void clickDerecho(){
    }
    public void desplazamiento(){
    }
    public void desplazamientoDeRueda(){
    }
    public void botonAlternativo(){
    }
}