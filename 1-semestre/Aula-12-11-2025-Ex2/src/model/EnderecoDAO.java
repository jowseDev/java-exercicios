package model;

public class EnderecoDAO {
    private String resposta;

    public String MostrarMatrix(EnderecoDTO enderecoDTO){
        String[][] end = new String[2][5];

        for(int linha = 0; linha < 5; linha++){
            for(int coluna = 0; coluna < 2; coluna++){
                this.resposta = end[linha][coluna] + " ";
            }
            this.resposta = "\n";
        }
        return resposta;
    }
}
