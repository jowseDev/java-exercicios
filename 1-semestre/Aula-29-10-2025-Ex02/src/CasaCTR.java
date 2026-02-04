public class CasaCTR {
    CasaDAO casaDAO = new CasaDAO();
    String publicarDadosCTR(CasaDTO casaDTO){
        return casaDAO.publicarDadosDAO(casaDTO);

    }

}
