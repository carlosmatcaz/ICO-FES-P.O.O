package mx.unam.aragon.inicio;

import mx.unam.aragon.modelo.Precio;
import mx.unam.aragon.modelo.Automóvil;
import mx.unam.aragon.modelo.Avión;
import mx.unam.aragon.modelo.Motocicleta;

public class Inicio {
    public static void main(String[] args) {
        Automóvil interceptorV8=new Automóvil();
        interceptorV8.setCompania("Ford");
        interceptorV8.setMarca("Falcon");
        interceptorV8.setModelo("XB8");
        interceptorV8.setKilometraje("1");
        interceptorV8.setCapacidadCajuela("El inge y cuatro lobas");
        //Composición con precio:
        interceptorV8.setPrecio(new Precio());

        System.out.println(interceptorV8.toString());

        Avión milleniumFalcon=new Avión();
        milleniumFalcon.setCompania("IDK");
        milleniumFalcon.setMarca("YODA");
        milleniumFalcon.setModelo("SOLO");
        milleniumFalcon.setModeloDeRadar("Mágico");
        milleniumFalcon.setNumeroDePisos("1");
        //Composición con precio:
        milleniumFalcon.setPrecio(new Precio());

        System.out.println(milleniumFalcon.toString());

        Motocicleta mortalika=new Motocicleta();
        mortalika.setCompania("Italika");
        mortalika.setModelo("DT150");
        mortalika.setMarca("Mortalika");
        mortalika.setModeloDeCasco("Ninguno");
        mortalika.setCilindraje("150cc");
        //Composición con precio:
        mortalika.setPrecio(new Precio());

        System.out.println(mortalika.toString());

    }

}

//by matcaz