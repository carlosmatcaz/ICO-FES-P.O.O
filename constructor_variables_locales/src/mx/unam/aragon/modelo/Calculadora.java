package mx.unam.aragon.modelo;

public class Calculadora{
    private float numeroUno;
    private float numeroDos;
    //Constructor propiedades de la clase
    public Calculadora(){
        numeroUno=1;
        numeroDos=1;
    }

    public Calculadora(float numeroUno, float numeroDos){
        this.numeroUno=numeroUno;
        verificar(numeroDos);

    }
    //Get&Setter
    public float getNumeroUno(){
        return numeroUno;
    }
    public float getNumeroDos(){
        return numeroDos;
    }

    //Operaciones básicas

    //Suma

    public float suma(){

        return (numeroUno + numeroDos);
    }
    public float suma(float numeroUno, float numeroDos){
        this.numeroUno=numeroUno;
        this.numeroDos=numeroDos;
        return this.suma();
    }

    //Resta
    public float resta(){
        return (numeroUno - numeroDos);
    }

    public float resta(float numeroUno, float numeroDos){
        this.numeroUno=numeroUno;
        this.numeroDos=numeroDos;
        return this.resta();
    }

    //Division

    public float division(){
        return (numeroUno/numeroDos);
    }

    public float division(float numeroUno, float numeroDos){
        this.numeroUno=numeroUno;
        verificar(numeroDos);
        //V1
//        if (numeroDos !=0){
//            this.numeroDos=numeroDos;
//        }else{
//            this.numeroDos=1;
//        }
        //V2
//        if (numeroDos == 0){
//            this.numeroDos=1;
//        }else{
//            this.numeroDos=numeroDos;
//        }
        return this.division();
    }

    //Multiplicacion

    public float multiplicacion(){
        return (numeroUno*numeroDos);
    }

    public float multiplicacion(float numeroUno, float numeroDos){
        this.numeroUno=numeroUno;
        this.numeroDos=numeroDos;
        return this.multiplicacion();
    }


    //ToString

    @Override
    public String toString() {
        return "Calculadora{" +
                "numeroUno=" + numeroUno +
                ", numeroDos=" + numeroDos +
                '}';
    }
    private void verificar(float numeroDos){
        if (numeroDos !=0){
            this.numeroDos=numeroDos;
        }else{
            this.numeroDos=1;
        }
    }
}
