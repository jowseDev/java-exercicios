package Exercicio;

public class TriDAO {
    private String resposta;
    public String CalcularTriangulo(TriDTO triDTO){

        double tri = TriDTO.ladoA + triDTO.ladoB + triDTO.ladoC;

        if(tri > 180 || tri < 180){
            this.resposta = "Triangulo Invalido";
        }else if(tri == 180){
            this.resposta = "Triangulo Valido";
        }
        return resposta;
    }

    public String  CalcularTrianguloValido(TriDTO triDTO){

    }


}
