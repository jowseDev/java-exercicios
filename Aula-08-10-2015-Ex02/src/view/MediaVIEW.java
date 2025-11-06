package view;

import javax.swing.JOptionPane;
import model.*;
import controller.*;

public class MediaVIEW {
    public static void main(String[] args) {
        MediaDTO mediaDTO = new MediaDTO();
        MediaDAO mediaDAO = new MediaDAO();

        mediaDTO.setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:")));
        mediaDTO.setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:")));
        mediaDTO.setN3(Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:")));
        mediaDTO.setN4(Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota:")));

        mediaDTO.setTipoCalculo(Integer.parseInt(JOptionPane.showInputDialog(
                "Digite o tipo de cálculo:\n" +
                        "1 - Usar N1 e N2\n" +
                        "2 - Usar N1, N2 e N3\n" +
                        "3 - Usar N1, N2, N3 e N4"
        )));

        mediaDAO.calcularMedia(mediaDTO);
    }
}
