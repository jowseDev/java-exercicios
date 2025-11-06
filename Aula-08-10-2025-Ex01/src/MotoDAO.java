public class MotoDAO extends VeiculoDAO {
    public String imprimiDadosMoto(MotoDTO motoDTO) {
        return imprimiDadosVeiculo(motoDTO) +
                "\nA Cilindrada é: " + motoDTO.getCilindrada() +
                "\nO tipo do Motor é: " + motoDTO.getTipo_motor();
    }
}
