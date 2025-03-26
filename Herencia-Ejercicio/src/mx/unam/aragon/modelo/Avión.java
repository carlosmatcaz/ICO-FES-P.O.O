package mx.unam.aragon.modelo;

public class Avión extends Vehiculo{
    private String modeloDeRadar;
    private String numeroDePisos;

    public Avión() {
    }

    public String getModeloDeRadar() {
        return modeloDeRadar;
    }

    public void setModeloDeRadar(String modeloDeRadar) {
        this.modeloDeRadar = modeloDeRadar;
    }

    public String getNumeroDePisos() {
        return numeroDePisos;
    }

    public void setNumeroDePisos(String numeroDePisos) {
        this.numeroDePisos = numeroDePisos;
    }

    @Override
    public String toString() {
        return "Avión{" +
                "modeloDeRadar='" + modeloDeRadar + '\'' +
                ", numeroDePisos='" + numeroDePisos + '\'' +
                '}'
                +" Modelo="+super.getModelo()
                +" Marca="+super.getMarca();
    }
}

//by matcaz