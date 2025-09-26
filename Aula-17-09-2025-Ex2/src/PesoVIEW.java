import javax.swing.*;

public class PesoVIEW {
    public static void main(String[] args){
        try{
            PesoDTO pesoDTO = new PesoDTO();
            PesoCTR pesoCTR = new PesoCTR();

            pesoDTO.setPeso(Integer.parseInt(JOptionPane.showInputDialog("Digite o Peso: ")));
            pesoDTO.setAltr(Integer.parseInt(JOptionPane.showInputDialog("Digite a Altura: ")));

            JOptionPane.showMessageDialog(null,pesoCTR.mostrarPeso(pesoDTO));

        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }


    }
}
