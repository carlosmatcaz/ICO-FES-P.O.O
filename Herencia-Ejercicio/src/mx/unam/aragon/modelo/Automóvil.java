package mx.unam.aragon.modelo;

public class Automóvil extends Vehiculo {
    private String kilometraje;
    private String capacidadCajuela;

    public Automóvil() {
    }

    public String getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getCapacidadCajuela() {
        return capacidadCajuela;
    }

    public void setCapacidadCajuela(String capacidadCajuela) {
        this.capacidadCajuela = capacidadCajuela;
    }

    @Override
    public String toString() {
        return "Automóvil{" +
                "kilometraje='" + kilometraje + '\'' +
                ", capacidadCajuela='" + capacidadCajuela + '\'' +
                '}'
                +" Modelo="+super.getModelo()
                +" Marca="+super.getMarca()
                +" Precio="+super.getPrecio();
    }
}

//by matcaz