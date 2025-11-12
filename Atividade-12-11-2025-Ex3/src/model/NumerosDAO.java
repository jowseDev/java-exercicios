package model;

public class NumerosDAO {

    public String MostrarMatris(NumerosDTO numerosDTO){
        String resposta = "";
        for(int linha = 0; linha < 5; linha++){
            for(int coluna = 0; coluna < 5; coluna++){
                this.resposta = end[linha][coluna] + " ";
            }
            this.resposta = "\n";
        }
    }

    public String MostrarMatrisDiagonal(NumerosDTO numerosDTO){
        String resposta = "";
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                if (linha == coluna) {
                    resposta += end[linha][coluna] + " ";
                } else {
                    resposta += "- ";
                }
            }
            resposta += "\n";
        }
        return resposta;
    }

}
