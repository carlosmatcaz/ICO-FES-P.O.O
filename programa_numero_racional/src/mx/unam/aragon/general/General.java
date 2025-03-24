package mx.unam.aragon.general;
import mx.unam.aragon.racional.Racional;

public class General {
    public static void main(String[] args) {
        Racional r1= new Racional(1,2);
        Racional r2= new Racional(3,4);

        //Suma
        Racional resultadoSuma=r1.suma_racional(r2);
        System.out.println(resultadoSuma);
        //Resta
        Racional resultadoResta=r1.resta_racional(r2);
        System.out.println(resultadoResta);
        //Division
        Racional resultadoDivision=r1.division_racional(r2);
        System.out.println(resultadoDivision);
        //Multipĺicacion
        Racional resultadoMultiplicacion=r1.multiplicacion_racional(r2);
        System.out.println(resultadoMultiplicacion);
    }
//        Racional racional= new Racional(1,2);
//        System.out.println(racional);
//        Racional racionalDos = new Racional();
//        System.out.println(racionalDos);
//        //Suma
//        System.out.println(racional.suma_racional(racionalDos));
//        System.out.println(racionalDos.suma_racional(racionalDos));
//        //Resta
//        System.out.println(racional.resta_racional(racionalDos));
//        System.out.println(racionalDos.resta_racional(racionalDos));
//        //Multiplicacion
//        System.out.println(racional.multiplicacion_racional(racionalDos));
//        System.out.println(racionalDos.multiplicacion_racional(racionalDos));
//        //Division
//        System.out.println(racional.division_racional(racionalDos));
//        System.out.println(racionalDos.division_racional(racionalDos));
//    }
}


//MATCAZ
