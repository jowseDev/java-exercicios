public class NumerosCTR {
    NumerosDAO numerosDAO = new NumerosDAO();
    public String mostrarNumeros(NumerosDTO numerosDTO){
        return numerosDAO.calcularNumeros(numerosDTO);
    }

}
