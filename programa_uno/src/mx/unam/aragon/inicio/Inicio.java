package mx.unam.aragon.inicio;

import mx.unam.aragon.modelo.Plumon;

public class Inicio {
    public static void main(String[] args){
        Plumon plumon=new Plumon();
        plumon.setMarca("Azor");
        System.out.println(plumon.getMarca());
    }
}
