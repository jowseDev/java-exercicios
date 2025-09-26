package Exercicio;

public class Peso {
    private float peso, altr;
    private String resposta;

    public String Calcular(int peso, int altr){
        this.altr = altr;
        this.peso = peso;
        this.resposta = resposta;

        if(altr <= 1.20){
            if(peso <= 60){
                this.resposta = "A";
            } else if (peso > 60 || peso < 90) {
                this.resposta = "D";
            } else if (peso > 90) {
                this.resposta = "G";
            }
        }else if(altr > 1.20 || altr < 1.70){
            if(peso <= 60){
                this.resposta = "B";
            } else if (peso > 60 || peso < 90) {
                this.resposta = "E";
            } else if (peso > 90) {
                this.resposta = "H";
            }
        } else if (altr >= 1.70) {
            if(peso <= 60){
                this.resposta = "C";
            } else if (peso > 60 || peso < 90) {
                this.resposta = "F";
            } else if (peso > 90) {
                this.resposta = "I";
            }
        }
        return resposta;
    }

}
