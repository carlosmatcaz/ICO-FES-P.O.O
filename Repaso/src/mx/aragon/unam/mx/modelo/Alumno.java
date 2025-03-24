package mx.aragon.unam.mx.modelo;

public class Alumno extends Persona{
    private String numeroCuenta;

    public Alumno() {
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                '}'+"Nombre= "+super.getNombre()
                +" Celular="+super.getCelular();
    }
}
