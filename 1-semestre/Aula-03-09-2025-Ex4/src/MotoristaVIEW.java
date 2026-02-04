import javax.swing.*;

public class MotoristaVIEW {

    public static void main(String[] args) {
        try {
            MotoristaDTO motoristaDTO = new MotoristaDTO();
            MotoristaCTR motoristaCTR = new MotoristaCTR();

            motoristaDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: ")));

            JOptionPane.showMessageDialog(null, motoristaCTR.mostrarIdade(motoristaDTO));
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }


}
l