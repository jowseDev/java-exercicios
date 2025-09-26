package Exercicio;

import javax.swing.*;

public class Principal {

    public static void main(String[] args){
        Media media = new Media();

        JOptionPane.showMessageDialog(null, "A situação" +
                media.calcular(
                        Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota1: ")),
                                Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota1: "))));
    }


}
