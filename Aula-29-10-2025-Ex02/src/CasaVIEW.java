import javax.swing.*;

public class CasaVIEW {
    public static void main(String[] args){
        try{
            CasaDTO casaDTO = new CasaDTO();
            CasaCTR casaCTR = new CasaCTR();

            casaDTO.setProprietario(JOptionPane.showInputDialog("Digite o nome do proprietario:"));
            casaDTO.setEndereco(JOptionPane.showInputDialog("Digite o Endereço da Casa:"));
            casaDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o Numero da Casa:")));
            casaDTO.setCidade(JOptionPane.showInputDialog("Digite o Cidade da Casa:"));

            String opc = JOptionPane.showInputDialog("Deseja Adicionar mais informações sobre a casa? \n Sim = Continuar \n Não = Verificar Informações");
            if(opc.equalsIgnoreCase("Sim")){
                casaDTO.setN_Quartos(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Quartos na casa:")));
                casaDTO.setN_Banheiros(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de banheiros na casa: ")));
            }

            JOptionPane.showMessageDialog(null, casaCTR.publicarDadosCTR(casaDTO));

        }catch (Exception e){
            System.out.println(e);
        }



    }
}
