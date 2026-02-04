package model;
import controller.*;
import view.*;

public class ClienteDAO {
    ClienteDTO clienteDTO = new ClienteDTO();

    public String mostrarDadosCliente(ClienteDTO clienteDTO){
        return "Os dados do cliente são:  \n"
                + "O Nome do é: \n" + clienteDTO.getNome() +
                "O Endereço é: \n" + clienteDTO.getEndereco() +
                "O Numero da casa é: \n" + clienteDTO.getNumero_casa() +
                "A Cidade é: \n" + clienteDTO.getCidade() +
                "O Estado é: \n" + clienteDTO.getEstado();
    }

}
