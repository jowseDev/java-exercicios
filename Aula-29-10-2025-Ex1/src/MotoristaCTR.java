public class MotoristaCTR {
    MotoristaDAO motoristaDAO = new MotoristaDAO();

    public String calcularCTR(MotoristaDTO motoristaDTO){
        return motoristaDAO.calcularDAO(motoristaDTO);
    }
}