public class VeiculoDAO {
    public String imprimiDadosVeiculo(VeiculoDTO veiculoDTO) {
        return "A Placa é: " + veiculoDTO.getPlaca() +
                "\nA cor é: " + veiculoDTO.getCor();
    }
}
