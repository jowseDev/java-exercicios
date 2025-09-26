package Exercicio;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        CalcularSalario calcular = new CalcularSalario();

        int ano = (int) Double.parseDouble(JOptionPane.showInputDialog("Informe o ano:"));

        Double resultado = calcular.CalcularAumento(ano);
        JOptionPane.showMessageDialog(null, "Seu novo salário é: " + String.format("%.2f", resultado));

    }
}
