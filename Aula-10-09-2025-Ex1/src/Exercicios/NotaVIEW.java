package Exercicios;

import javax.swing.*;

public class NotaVIEW {
    public static void main(String[] args) {
        try {
            NotaCTR notaCTR = new NotaCTR();
            NotaDTO notaDTO = new NotaDTO();

            notaDTO.setNome(JOptionPane.showInputDialog("Digite o seu nome:"));
            notaDTO.setNota1(Integer.parseInt(JOptionPane.showInputDialog("Digite o nota:")));
            notaDTO.setNota2(Integer.parseInt(JOptionPane.showInputDialog("Digite o nota:")));

            JOptionPane.showMessageDialog(null,notaCTR.mostrarNota(notaDTO));

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro!!!");
        }



    }
}
