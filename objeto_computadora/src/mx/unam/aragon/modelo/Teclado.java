package mx.unam.aragon.modelo;

public class Teclado {
    //Atributos
    private String color;
    private String idioma;
    private String numeroDeTeclas;
    private String tipoDeConexion;
    private String tipoDeMecanismo;
    //Get&Setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getNumeroDeTeclas() {
        return numeroDeTeclas;
    }

    public void setNumeroDeTeclas(String numeroDeTeclas) {
        this.numeroDeTeclas = numeroDeTeclas;
    }

    public String getTipoDeConexion() {
        return tipoDeConexion;
    }

    public void setTipoDeConexion(String tipoDeConexion) {
        this.tipoDeConexion = tipoDeConexion;
    }

    public String getTipoDeMecanismo() {
        return tipoDeMecanismo;
    }

    public void setTipoDeMecanismo(String tipoDeMecanismo) {
        this.tipoDeMecanismo = tipoDeMecanismo;
    }
    //toString

    @Override
    public String toString() {
        return "Teclado{" +
                "color='" + color + '\'' +
                ", idioma='" + idioma + '\'' +
                ", numeroDeTeclas='" + numeroDeTeclas + '\'' +
                ", tipoDeConexion='" + tipoDeConexion + '\'' +
                ", tipoDeMecanismo='" + tipoDeMecanismo + '\'' +
                '}';
    }
    //Métodos
    public void teclaPresionada(){
    }
    public void teclaFuncion(){
    }
    public void bloqueoDeNumeros(){
    }
    public void bloqMayus(){
    }
    public void tabulador(){
    }
    public void escape(){
    }
}
