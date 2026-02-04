import javax.swing.*;

public class NumerosVIEW {

    public static void main(String[] args){
        NumeroDTO numeroDTO = new NumeroDTO();
        NumerosCTR numerosCTR = new NumerosCTR();

        int num[] = new int[5];

        for(int i = 0; i < 5; i++){
            num[i] = Integer.parseInt(JOptionPane.showInputDialog(
                    "Informe o numero para a posição:" + i
            ));
        }
        numeroDTO.setN(num);
        JOptionPane.showMessageDialog(null, numerosCTR.VerificarPosicao(NumeroDTO));
    }

}
