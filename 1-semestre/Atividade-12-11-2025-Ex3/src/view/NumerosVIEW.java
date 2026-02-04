package view;

import javax.swing.JOptionPane;
import model.NumerosDTO;
import model.NumerosDAO;

public class NumerosVIEW {
    public static void main(String[] args) {

        NumerosDTO numerosDTO = new NumerosDTO();
        NumerosDAO numerosDAO = new NumerosDAO();

        int[][] matriz = new int[5][5];

        // Preenchendo a matriz
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                matriz[linha][coluna] = Integer.parseInt(
                        JOptionPane.showInputDialog(
                                "Digite o valor para posição [" + linha + "][" + coluna + "]:"
                        )
                );
            }
        }

        // Enviando a matriz ao DTO
        numerosDTO.setEnd(matriz);

        // Mostrando a matriz completa
        String mostrarMatriz = numerosDAO.MostrarMatris(numerosDTO);
        JOptionPane.showMessageDialog(null, "Matriz Completa:\n" + mostrarMatriz);

        // Mostrando a diagonal
        String mostrarDiagonal = numerosCTR.MostrarMatrisDiagonal(numerosDTO);
        JOptionPane.showMessageDialog(null, "Diagonal Principal:\n" + mostrarDiagonal);
    }
}
