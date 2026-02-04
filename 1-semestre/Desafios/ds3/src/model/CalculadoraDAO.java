package model;

public class CalculadoraDAO {
    public Double Calcular(CalculadoraDTO dto){
        return dto.getN1() + dto.getN2();
    }

}
