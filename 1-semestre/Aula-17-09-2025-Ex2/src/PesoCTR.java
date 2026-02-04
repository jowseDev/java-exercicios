public class PesoCTR {
    PesoDAO pesoDAO = new PesoDAO();
    public String mostrarPeso(PesoDTO pesoDTO){
        return pesoDAO.calcularPS(pesoDTO);
    }
}
