package view;
import controller.*;
import model.ClienteDTO;
import model.FisicoDTO;
import model.JuridicoDTO;
import javax.swing.*;

public class ClienteVIEW {
    public static void main(String[] args){
        FisicoCTR fisicoCTR = new FisicoCTR();
        FisicoDTO fisicoDTO = new FisicoDTO();
        JuridicoDTO juridicoDTO = new JuridicoDTO();
        JuridicoCTR juridicoCTR = new JuridicoCTR();
        ClienteDTO clienteDTO = new ClienteDTO();

        try {
            clienteDTO.setNome(JOptionPane.showInputDialog("Digite o nome cliente: "));
            clienteDTO.setEndereco(JOptionPane.showInputDialog("Digite o endereço: "));
            clienteDTO.setNumero_casa(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da casa: ")));
            clienteDTO.setCidade(JOptionPane.showInputDialog("Digite a cidade: "));
            clienteDTO.setEstado(JOptionPane.showInputDialog("Digite o estado:"));

            int opc = Integer.parseInt(JOptionPane.showInputDialog("Selecione a Opção: \n 1--Cliente Jurídco; \n 2--Cliente Fisico" ));;

            if(opc == 1){
                juridicoDTO.setJur_cnpj(JOptionPane.showInputDialog("Digite o CNPJ: "));
                juridicoDTO.setJur_ie(JOptionPane.showInputDialog("Digite o Ingresso Estadual: "));

                    JOptionPane.showMessageDialog(null, juridicoCTR.mostrarDAdosClienteC(clienteDTO) + "\n" +
                            juridicoCTR.mostrarDadosClienteViewJ(juridicoDTO));


            } else if (opc == 2) {
                fisicoDTO.setFis_cpf(JOptionPane.showInputDialog("Digite o CPF: "));
                fisicoDTO.setFis_rg(JOptionPane.showInputDialog("Digite o RG: "));

                JOptionPane.showMessageDialog(null, fisicoCTR.mostrarDAdosClienteC(clienteDTO) + "\n" +
                        fisicoCTR.mostrarDadosCliViewF(fisicoDTO));
            }

        } catch (Exception erro) {
            System.out.printf(String.valueOf(erro));
        }



    }
}
