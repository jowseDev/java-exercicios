package Exercicio;

public class Tabuada {

    private int numero;
    private String resp="";
    public String calcular(int numero){
        try{
            this.numero = numero;
            for(int i=1; i < 10; i++){
                this.resp += this.numero + " x " + i + " = " + this.numero * i + "\n";
            }
            return this.resp;
        }catch(Exception e){
            return this.resp;
        }
    }
}
