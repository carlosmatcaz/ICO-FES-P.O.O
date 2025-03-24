package mx.unam.aragon.inicio;

import mx.unam.aragon.modelo.*;

public class Inicio {
    public static void main(String[] args) {
        Bocina bocina= new Bocina();
        bocina.setCanal("Izquierdo");
        bocina.setTipoDePanel("Amortiguado");
        bocina.setDecibeles("Estandar");
        bocina.setTamano("Theater");
        bocina.setTipoDeAltavoz("Tweeter");
        System.out.println(bocina.toString());

        Monitor monitor=new Monitor();
        monitor.setAcabado("Plastico");
        monitor.setMarca("Acer");
        monitor.setPanel("LCD");
        monitor.setTamano("25 inches");
        monitor.setTasaDeRefresco("60 hz");
        System.out.println(monitor.toString());

        Mouse mouse=new Mouse();
        mouse.setColor("Negro");
        mouse.setDpi("Estandar");
        mouse.setForma("Clásica");
        mouse.setModoDeConexion("USB");
        mouse.setTipoDeElectronica("Mecanico");
        System.out.println(mouse.toString());

        Procesador procesador=new Procesador();
        procesador.setGeneracion("4");
        procesador.setHilos("4");
        procesador.setVelocidad("2.80 ghz");
        procesador.setModelo("DualCore");
        System.out.println(procesador.toString());

        Teclado teclado=new Teclado();
        teclado.setColor("Gris");
        teclado.setIdioma("Espanol");
        teclado.setNumeroDeTeclas("120");
        teclado.setTipoDeConexion("WIFI");
        teclado.setTipoDeMecanismo("Mecanico");
        System.out.println(teclado.toString());

    }


}
