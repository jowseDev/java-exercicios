import javax.swing.*;

public class MotoristaVIEW {
    public static void main(String[] args){
        try{
            MotoristaDTO motoristaDTO = new MotoristaDTO();
            MotoristaCTR motoristaCTR = new MotoristaCTR();
            motoristaDTO.setIdade(
                    Integer.parseInt(
                            JOptionPane.showInputDialog("Informe a idade:")
                    )
            );
            JOptionPane.showMessageDialog(null, motoristaCTR.calcularCTR(motoristaDTO
            ));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



}
