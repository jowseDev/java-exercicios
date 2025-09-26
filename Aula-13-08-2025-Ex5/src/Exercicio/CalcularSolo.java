package Exercicio;

public class CalcularSolo {
    private int s;
    private String resposta;

    public String calcular(int s) {
        this.s = s;

        if (s < 10) {
            resposta = "Rochoso!";
        } else if (s <= 40) {
            resposta = "Firme!";
        } else if (s <= 80) {
            resposta = "Pantanoso!";
        } else {
            resposta = "Muita água!";
        }

        return resposta;
    }
}
