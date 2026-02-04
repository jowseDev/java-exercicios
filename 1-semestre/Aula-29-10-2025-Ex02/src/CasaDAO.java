public class CasaDAO {
    public String publicarDadosDAO(CasaDTO dto){
        return  "O endereço da casa é:" + dto.Endereco + "\n" +
                "O Numero da casa é:" + dto.numero + "\n" +
                "O Bairro da casa é:" + dto.Bairro + "\n" +
                "O endereço da casa é:" + dto.Cidade + "\n" +
                "O proptietario da casa é:" + dto.Proprietario + "\n";
    }

}
