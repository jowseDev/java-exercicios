package controller;
import model.*;

public class JuridicoCTR {
    JuridicoDTO juridicoDTO = new JuridicoDTO();
    JuridicoDAO juridicoDAO = new JuridicoDAO();
    ClienteDTO clienteDTO = new ClienteDTO();
    ClienteDAO clienteDAO = new ClienteDAO();

    public String mostrarDadosClienteViewJ(JuridicoDTO juridicoDTO){
        return juridicoDAO.mostrarDadosClienteJ(juridicoDTO);
    }

    public String mostrarDAdosClienteC(ClienteDTO clienteDTO){
        return clienteDAO.mostrarDadosCliente(clienteDTO);
    }

}
