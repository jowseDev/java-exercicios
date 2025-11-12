package model;

public class NumeroDAO {
    String resposta = "";
    public String MostrarMatrx(NumeroDTO numeroDTO) {
        int[][] n = numeroDTO.getN(num);
        for(int linha = 0; linha < 2; linha++){
            for(int coluna = 0; coluna < 3; coluna++){
                this.resposta += n[linha][coluna] + " ";
            }
            this.resposta += "\n";
        }
        return this.resposta;
    }
}