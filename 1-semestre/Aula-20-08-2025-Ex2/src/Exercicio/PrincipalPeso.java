package Exercicio;

import javax.swing.*;

public class PrincipalPeso {

    public static void main(String[] args){
        Peso peso = new Peso();
        int valor1 = (int) Double.parseDouble(JOptionPane.showInputDialog("Informe o seu Peso:"));
        int valor2 = (int) Double.parseDouble(JOptionPane.showInputDialog("Informe o sua Altura:"));
        String resultado = peso.Calcular(valor1, valor2);
        JOptionPane.showMessageDialog(null, "Sua classificação é: " + resultado);

    }
}
