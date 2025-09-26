package Exercicio;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int canal;
        int c4 = 0, c5 = 0, c7 = 0, c12 = 0, outros = 0;

        do {
            canal = Integer.parseInt(
                    JOptionPane.showInputDialog(null,
                            "Digite o canal (4, 5, 7, 12) ou 0 para sair:")
            );

            if (canal == 4) {
                c4++;
            } else if (canal == 5) {
                c5++;
            } else if (canal == 7) {
                c7++;
            } else if (canal == 12) {
                c12++;
            } else if (canal != 0) {
                outros++;
            }

        } while (canal != 0);

        String resultado = "Audiência por canal:\n"
                + "Canal 4: " + c4 + "\n"
                + "Canal 5: " + c5 + "\n"
                + "Canal 7: " + c7 + "\n"
                + "Canal 12: " + c12 + "\n"
                + "Outros canais: " + outros;

        JOptionPane.showMessageDialog(null, resultado);
    }
}
