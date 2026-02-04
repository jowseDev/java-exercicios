package view;

import controller.CalculadoraCTR;
import model.CalculadoraDTO;

import javax.swing.*;

public class CalculadoraVIEW {

    public static void main(String[] args){
        CalculadoraDTO calculadoraDTO = new CalculadoraDTO();
        CalculadoraCTR calculadoraCTR = new CalculadoraCTR();

        calculadoraDTO.setN1(Double.valueOf(JOptionPane.showInputDialog("Digite o numero 1:")));
        calculadoraDTO.setN2(Double.valueOf(JOptionPane.showInputDialog("Digite o numero 2:")));

        JOptionPane.showMessageDialog(null, "A Resposta é: " + calculadoraCTR.CalcularView(calculadoraDTO));


    }

}
