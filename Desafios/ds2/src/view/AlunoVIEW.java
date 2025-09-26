package view;
import controller.AlunoCTR;
import model.AlunoDTO;
import javax.swing.*;


public class AlunoVIEW {
    public static void main(String[] args){
    try {
        AlunoDTO alunoDTO = new AlunoDTO();
        AlunoCTR alunoCTR = new AlunoCTR();
        int opc = 0;
        do {
            alunoDTO.setNota(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota: ")));
            alunoDTO.setSexo(JOptionPane.showInputDialog("F = Feminino \n M = Masculino \n Digite seu sexo: "));

            alunoCTR.calcularNotas(alunoDTO);

            opc = Integer.parseInt(JOptionPane.showInputDialog("Deseja informar outro Aluno? (1-Sim / 0-Não): "));
        } while (opc == 1);

        JOptionPane.showMessageDialog(null, alunoCTR.mostrarResultado(alunoDTO));

    } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }

}
}
