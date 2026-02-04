package controller;

import javax.swing.JOptionPane;
import model.MediaDTO;

public class MediaDAO {

    public void calcularMedia(MediaDTO mediaDTO) {
        double media = 0;

        switch (mediaDTO.getTipoCalculo()) {
            case 1:
                media = calcularMedia(mediaDTO.getN1(), mediaDTO.getN2());
                break;
            case 2:
                media = calcularMedia(mediaDTO.getN1(), mediaDTO.getN2(), mediaDTO.getN3());
                break;
            case 3:
                media = calcularMedia(mediaDTO.getN1(), mediaDTO.getN2(), mediaDTO.getN3(), mediaDTO.getN4());
                break;
            default:
                JOptionPane.showMessageDialog(null, "Tipo de cálculo inválido!");
                return;
        }

        JOptionPane.showMessageDialog(null, "A média do aluno é: " + media);
    }

    private double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    private double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    private double calcularMedia(double n1, double n2, double n3, double n4) {
        return (n1 + n2 + n3 + n4) / 4;
    }
}