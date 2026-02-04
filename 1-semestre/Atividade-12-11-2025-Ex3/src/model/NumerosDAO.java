package model;
import controller.*;

public class NumerosDAO {

    public String MostrarMatris(NumerosDTO numerosDTO){
        String resposta = "";
        int[][] end = numerosDTO.getEnd();

        for(int linha = 0; linha < 5; linha++){
            for(int coluna = 0; coluna < 5; coluna++){
                resposta += end[linha][coluna] + " ";
            }
            resposta += "\n";
        }
        return resposta;
    }

    public String MostrarMatrisDiagonal(NumerosDTO numerosDTO){
        String resposta = "";
        int[][] end = numerosDTO.getEnd();

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
