package mx.unam.aragon.modelo;

import java.util.Objects;

public class Figura {
    private float x;
    private float y;

    public Figura() {
        this (0,0);
    }

    public Figura(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }


    @Override
    public String toString() {
        return "Figura{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Figura figura = (Figura) o;
        return Float.compare(x, figura.x) == 0 && Float.compare(y, figura.y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
