package view;

import controller.NumeroCTR;
import model.NumeroDTO;

import javax.swing.*;

public class NumeroVIEW {

    public static void main(String[] args){

        NumeroDTO numeroDTO = new NumeroDTO();
        NumeroCTR numeroCTR = new NumeroCTR();

        int num[][] = new int[2][3];

        for(int linha = 0; linha < 2; linha++){
            for(int coluna = 0; coluna < 3 ; linha++){
                num[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero da linha: " + linha + "Coluna" + coluna));
            }
        }
    numeroDTO.getN(num);
        JOptionPane.showMessageDialog(null, numeroCTR.mostrarDados(numeroDTO));
    }
}
