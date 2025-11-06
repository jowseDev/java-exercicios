package controller;
import model.*;
import view.*;

public class FisicoCTR {
    FisicoDAO fisicoDAO = new FisicoDAO();
    FisicoDTO fisicoDTO = new FisicoDTO();
    ClienteDTO clienteDTO = new ClienteDTO();
    ClienteDAO clienteDAO = new ClienteDAO();

    public String mostrarDadosCliViewF(FisicoDTO fisicoDTO){
        return fisicoDAO.mostrarDadosClienteF(fisicoDTO);
    }
    public String mostrarDAdosClienteC(ClienteDTO clienteDTO){
        return clienteDAO.mostrarDadosCliente(clienteDTO);
    }

}
