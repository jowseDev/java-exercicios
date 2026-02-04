package Exercicio;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        CalcularSolo solo = new CalcularSolo();

        int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do solo:"));
        String resultado = solo.calcular(valor);

        JOptionPane.showMessageDialog(null, "Tipo de solo: " + resultado);
    }
}
