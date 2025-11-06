public class NumeroDAO {

    private String resposta = "";

    public String VerificarPosicao(NumeroDTO numeroDTO){
        int n[] = numeroDTO.getN();
        for(int i = 0; i < n.length; i++){
            if(cont % 2 == 0){
                this.resposta += n[cont] + "\n";
            }
        }
        return resposta;
    }
}
