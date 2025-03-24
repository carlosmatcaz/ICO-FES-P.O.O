package mx.aragon.unam.mx.modelo;

public class Celular {
    private String modelo;
    private String compania;

    public Celular() {
        modelo="XXX";
        compania="X-FES";

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "modelo='" + modelo + '\'' +
                ", compania='" + compania + '\'' +
                '}';
    }

}

