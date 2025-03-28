package mx.unam.aragon.modelo;

public class Circulo extends FiguraBidimensional{
    private float radio;
    private float diametro;
    private float circunferencia;
  //Constructores
    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public float getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(float circunferencia) {
        this.circunferencia = circunferencia;
    }

    //Métodos que calculan propiedades de un círculo:
    public float calcularCircunferencia(){
        return (float)(radio*Math.PI);
    }
    public float calcularRadio(){
        return this.radio;
    }
    public float calcularDiametro(){
        return (radio*2);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", diametro=" + calcularDiametro() +
                ", circunferencia=" + calcularCircunferencia() +
                '}';
    }


}

