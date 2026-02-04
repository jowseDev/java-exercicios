import javax.swing.JOptionPane;

public class VeiculoVIEW {
    public static void main(String[] args) {
        // Carro
        CarroDTO carroDTO = new CarroDTO();
        CarroCTR carroCTR = new CarroCTR();

        carroDTO.setPlaca(JOptionPane.showInputDialog("Informe a Placa"));
        carroDTO.setCor(JOptionPane.showInputDialog("Informe a Cor"));
        carroDTO.setPotencia(Integer.parseInt(JOptionPane.showInputDialog("Informe a Potência")));
        carroDTO.setQtd_portas(Integer.parseInt(JOptionPane.showInputDialog("Informe as portas")));

        JOptionPane.showMessageDialog(null, carroCTR.imprimiDadosCarro(carroDTO));

        // Moto
        MotoDTO motoDTO = new MotoDTO();
        MotoCTR motoCTR = new MotoCTR();

        motoDTO.setPlaca(JOptionPane.showInputDialog("Informe a Placa"));
        motoDTO.setCor(JOptionPane.showInputDialog("Informe a Cor"));
        motoDTO.setCilindrada(Integer.parseInt(JOptionPane.showInputDialog("Informe a Cilindrada")));
        motoDTO.setTipo_motor(JOptionPane.showInputDialog("2T / 4T"));

        JOptionPane.showMessageDialog(null, motoCTR.imprimiDadosMoto(motoDTO));
    }
}
