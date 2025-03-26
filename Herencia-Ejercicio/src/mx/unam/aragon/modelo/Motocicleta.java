package mx.unam.aragon.modelo;

public class Motocicleta extends Vehiculo{
    private String cilindraje;
    private String modeloDeCasco;

    public Motocicleta() {
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getModeloDeCasco() {
        return modeloDeCasco;
    }

    public void setModeloDeCasco(String modeloDeCasco) {
        this.modeloDeCasco = modeloDeCasco;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "cilindraje='" + cilindraje + '\'' +
                ", modeloDeCasco='" + modeloDeCasco + '\'' +
                '}'
                +" Modelo="+super.getModelo()
                +" Marca="+super.getMarca()
                +" Precio="+super.getPrecio();
    }
}

//by matcaz