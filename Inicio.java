package mx.unam.aragon.inicio;

import mx.unam.aragon.modelo.Circulo;
import mx.unam.aragon.modelo.Cuadrado;
import mx.unam.aragon.modelo.Figura;

public class Inicio {
    public static void main(String[] args) {
        Figura figura=new Figura();
        Figura figuraDos=new Figura();
        figuraDos.setX(23.23f);
        System.out.println(figura.equals(figuraDos));
        System.out.println("Hash_1:"+figura.hashCode());
        System.out.println("toString:"+figura.toString());
        System.out.println("Hash_2:"+figuraDos.hashCode());
        System.out.println("toString:"+figuraDos.toString());

        Circulo circulo=new Circulo();
        circulo.setRadio(10);
        System.out.println("Circunferencia: "+circulo.calcularCircunferencia());
        System.out.println(circulo.toString());

        Cuadrado cuadrado=new Cuadrado(20,10);
    }
}
