package mx.unam.aragon.modelo;

import java.util.Objects;

public class FiguraTridimensional extends Figura{

    private float z;

    public FiguraTridimensional(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "FiguraTridimensional{" +
                "z=" + z +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FiguraTridimensional that = (FiguraTridimensional) o;
        return Float.compare(z, that.z) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), z);
    }
}
