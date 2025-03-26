package mx.unam.aragon.modelo;

public class Vehiculo {
    private String modelo;
    private String compania;
    private String marca;
    private Precio precio;

    //Composición en la clase Padre:
    public Precio getPrecio(){
        return precio;
    }

    public void setPrecio(Precio precio) {
        this.precio = precio;
    }

    public Vehiculo() {
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", compania='" + compania + '\'' +
                ", marca='" + marca + '\'' +
                '}'+" Precio="+precio;
    }
}

//by matcaz