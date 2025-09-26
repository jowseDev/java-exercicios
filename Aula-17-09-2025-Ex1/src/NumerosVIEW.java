import javax.swing.*;

public class NumerosVIEW {
     public static void main(String []args){
         try{
             NumerosDTO numerosDTO = new NumerosDTO();
             NumerosCTR numerosCTR = new NumerosCTR();

             numerosDTO.setN1(Integer.parseInt(JOptionPane.showInputDialog("Informe o numero 1: ")));
             numerosDTO.setN2(Integer.parseInt(JOptionPane.showInputDialog("Informe o numero 2: ")));
             numerosDTO.setN3(Integer.parseInt(JOptionPane.showInputDialog("Informe o numero 3: ")));

            JOptionPane.showMessageDialog(null, numerosCTR.mostrarNumeros(numerosDTO));

         }catch (Exception e){
        JOptionPane.showMessageDialog(null,e);
         }
     }
}
