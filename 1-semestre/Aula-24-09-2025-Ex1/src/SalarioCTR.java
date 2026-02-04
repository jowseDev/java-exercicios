public class SalarioCTR {
    SalarioDAO salarioDAO = new SalarioDAO();

    public void processarDados(SalarioDTO salarioDTO) {
        salarioDAO.calcularSalario(salarioDTO);
    }

    public String mostrarResultados(SalarioDTO salarioDTO) {
        return salarioDAO.mostrarResultados(salarioDTO);
    }
}
