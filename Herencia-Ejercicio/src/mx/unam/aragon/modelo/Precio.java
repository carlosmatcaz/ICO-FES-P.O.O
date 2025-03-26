package mx.unam.aragon.modelo;

public class Precio {
    private Double costo;
    private String pais;
    private String moneda;

    public Precio() {
        moneda="Pejecoins";
        pais="México";
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    @Override
    public String toString() {
        return "Precio{" +
                "costo=" + costo +
                ", pais='" + pais + '\'' +
                ", moneda='" + moneda + '\'' +
                '}';
    }
}
