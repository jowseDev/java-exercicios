package view;

import controller.EnderecoCTR;
import model.EnderecoDTO;

import javax.swing.*;

public class EnderecoVIEW {
    public static void main(String[] args){

        EnderecoDTO enderecoDTO = new EnderecoDTO();
        EnderecoCTR enderecoCTR = new EnderecoCTR();

        String end[][] = new String[2][5];

        for(int linha = 0; linha < 5; linha++){
            for(int coluna = 0; coluna < 2 ; linha++){
                end[linha][coluna] = JOptionPane.showInputDialog("Informe o Nomo: " + linha + "Informe o endereço: " + coluna);
            }
        }
        enderecoDTO.setEnd(end);
        JOptionPane.showMessageDialog(null, enderecoCTR.MostrarMatrix(enderecoDTO));
    }
}
