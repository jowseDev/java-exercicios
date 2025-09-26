package Exercicio;

import javax.swing.*;

public class SoloVIEW {
public static void main(String[] args) {
    try {
        SoloCTR soloCTR = new SoloCTR();
        SoloDTO soloDTO = new SoloDTO();

        soloDTO.setQtdAguaSolo(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de agua no solo:")));

        JOptionPane.showMessageDialog(null, soloCTR.mostrarSolo(soloDTO));

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}

}
