package Exercicio;
import javax.swing.JOptionPane;

public class PrincipalCalculo {
    public static void main(String[] args) {
        Calculo nota = new Calculo();

        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1:"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2:"));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 3:"));

        int p1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o peso 1:"));
        int p2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o peso 2:"));
        int p3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o peso 3:"));



        JOptionPane.showMessageDialog(null, "A média final é: " + nota.calcularMedia(n1, n2, n3, p1, p2, p3));
    }
}
