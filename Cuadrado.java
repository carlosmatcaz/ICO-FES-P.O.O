package mx.unam.aragon.modelo;

public class Cuadrado extends FiguraBidimensional {
    public Cuadrado(float x, float y) {
        super(x, y);
    }

    public float calcularArea() {
        return x*y;
    }
}