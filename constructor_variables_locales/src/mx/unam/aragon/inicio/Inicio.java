package mx.unam.aragon.inicio;

import mx.unam.aragon.modelo.Calculadora;

public class Inicio {
    public static void main(String[] args) {
        Calculadora calculadora=new Calculadora(8, 9);
        System.out.println(calculadora);
        Calculadora calculadoraDos= new Calculadora();
        System.out.println(calculadoraDos);

        System.out.println(calculadora.suma());
        System.out.println(calculadoraDos.suma(9,6));

        System.out.println(calculadora.resta());
        System.out.println(calculadoraDos.resta(3,2));

        System.out.println(calculadora.division());
        System.out.println(calculadoraDos.division(8,4));

        System.out.println(calculadora.multiplicacion());
        System.out.println(calculadoraDos.multiplicacion(7,9));

        System.out.println(calculadora.toString());
        System.out.println(calculadoraDos.toString());
        Calculadora prueba=new Calculadora(1,0);
        System.out.println(prueba.toString());
        System.out.println(prueba.division());
    }

}
