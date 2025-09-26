package Exercicio;

public class SoloDAO {
    private String resposta;
    public String mostrarSolo(SoloDTO soloDTO) {

       if(soloDTO.qtdAguaSolo > 80){
            this.resposta =  "Quandidade de agua invalida!";
       }else if(soloDTO.qtdAguaSolo <= 80 && soloDTO.qtdAguaSolo > 40){
            this.resposta = "Solo: Pantanoso.";
       }else if(soloDTO.qtdAguaSolo <= 40 && soloDTO.qtdAguaSolo > 10){
           this.resposta = "Solo: Firme.";
       }else if(soloDTO.qtdAguaSolo <= 10){
           this.resposta = "Solo: Rochoso.";
       }
        return this.resposta;
    }



}
