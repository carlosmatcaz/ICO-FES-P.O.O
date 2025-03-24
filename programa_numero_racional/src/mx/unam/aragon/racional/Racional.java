package mx.unam.aragon.racional;

public class Racional {
    private int numerador;
    private int denominador;

    public Racional(){
        numerador=1;
        denominador=1;
    }
    public Racional(int numerador, int denominador){
        this.numerador=numerador;
        verificar(denominador);
    }

    //Get&Setter
    public int getNumerador() {
        return numerador;
    }
    public int getDenominador() {
        return denominador;
    }

    //Operaciones con fracciones
    //Suma
    public Racional suma_racional(Racional racionalDos){
        /*Nuevo numerador, utilizando los atributos de numerador
        y denominador previos para generar al nuevo racional*/
        int nuevoNumerador = (this.numerador*racionalDos.denominador)+(this.denominador*racionalDos.numerador);
        //Nuevo denominador, de igual manera
        int nuevoDenominador = (this.denominador*racionalDos.denominador);
        return new Racional(nuevoNumerador,nuevoDenominador);
    }
    //Resta
    public Racional resta_racional(Racional racionalDos){
        //Nuevo numerador
        int nuevoNumerador = (this.numerador*racionalDos.denominador)-(this.denominador*racionalDos.numerador);
        //Nuevo denominador
        int nuevoDenominador = (this.denominador*racionalDos.denominador);
        return new Racional(nuevoNumerador, nuevoDenominador);
    }
    //División
    public Racional division_racional(Racional racionalDos){
        //Nuevo numerador
        int nuevoNumerador = (this.numerador*racionalDos.denominador);
        //Nuevo denominador
        int nuevoDenominador = (this.denominador*racionalDos.numerador);
        return new Racional(nuevoNumerador, nuevoDenominador);
    }
    //Multiplicación
    public Racional multiplicacion_racional(Racional racionalDos){
        //Nuevo numerador
        int nuevoNumerador = (this.numerador*racionalDos.numerador);
        //Nuevo denominador
        int nuevoDenominador = (this.denominador*racionalDos.denominador);
        return new Racional(nuevoNumerador, nuevoDenominador);
    }

    //Verificación para evitar la división entre cero con alerta
    private void verificar(int denominador){
        if (denominador !=0){
            this.denominador=denominador;
        }else{
            this.denominador=1;
            System.out.println("No se puede dividir entre cero");
        }
    }

    @Override
    public String toString() {
        return "Racional{" +
                "numerador=" + numerador +
                ", denominador=" + denominador +
                '}';
    }
}

