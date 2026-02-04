package Exercicio;

public class Tabuada {
    private int numero;
    private String imprimir="";

    public String Calcular_Tabuada(int numero){
        this.numero = numero;

        for(int i = 0; i < 10; i++){
            this.imprimir = this.imprimir + "\n" + i + " X " +
            this.numero + " = " + i*this.numero;
        }
    return this.imprimir;
    }


}
