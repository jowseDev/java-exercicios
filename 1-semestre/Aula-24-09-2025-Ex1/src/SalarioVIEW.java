import javax.swing.*;

public class SalarioVIEW {
    public static void main(String[] args) {
        try {
            SalarioDTO salarioDTO = new SalarioDTO();
            SalarioCTR salarioCTR = new SalarioCTR();

            int opcao;
            do {
                salarioDTO.setSalario(Integer.parseInt(JOptionPane.showInputDialog("Informe seu salário: ")));
                salarioDTO.setSexo(JOptionPane.showInputDialog("Informe seu sexo (M/F): "));

                salarioCTR.processarDados(salarioDTO);

                opcao = Integer.parseInt(JOptionPane.showInputDialog("Deseja informar outro habitante? (1-Sim / 0-Não): "));
            } while (opcao == 1);

            JOptionPane.showMessageDialog(null, salarioCTR.mostrarResultados(salarioDTO));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
}

