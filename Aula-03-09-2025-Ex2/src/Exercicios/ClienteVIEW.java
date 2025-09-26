package Exercicios;

import javax.swing.*;

public class ClienteVIEW {
    public static void main(String[] args) {
        try {
            ClienteCTR clienteCTR = new ClienteCTR();
            ClienteDTO clienteDTO = new ClienteDTO();

            clienteDTO.setNome(JOptionPane.showInputDialog("Informe seu nome:"));
            clienteDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:")));
            clienteDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:")));

            JOptionPane.showMessageDialog(null, clienteCTR.mostrarNomeRg(clienteDTO));
            JOptionPane.showMessageDialog(null, clienteCTR.mostrarNomeIdade(clienteDTO));
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro: no sistema: " + e.getMessage());
        }
    }

}
