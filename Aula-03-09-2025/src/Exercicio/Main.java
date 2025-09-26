package Exercicio;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
    try{
        Tabuada tabuada = new Tabuada();
        JOptionPane.showMessageDialog(null,
                tabuada.calcular(
                        Integer.parseInt(
                                JOptionPane.showInputDialog("Informe o numero: ")
                        )
                ));
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Erro 001 - Deve ser informado somente numeros!!");
        System.out.println("Erro: " + e.getMessage());
    }finally{
        JOptionPane.showMessageDialog(null, "Fim do sistema!");
       }
    }
}