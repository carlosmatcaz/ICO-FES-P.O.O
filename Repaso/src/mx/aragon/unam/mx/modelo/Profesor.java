package mx.aragon.unam.mx.modelo;

public class Profesor extends Persona{
    private String numeroTrabajador;

    public Profesor() {
    }

    public String getNumeroTrabajador() {
        return numeroTrabajador;
    }

    public void setNumeroTrabajador(String numeroTrabajador) {
        this.numeroTrabajador = numeroTrabajador;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "numeroTrabajador='" + numeroTrabajador + '\'' +
                '}'+"Apellido paterno= "+super.getApellidoPaterno()
                +" Celular="+super.getCelular();
    }
}
