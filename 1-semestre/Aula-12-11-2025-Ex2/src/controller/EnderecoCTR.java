package controller;
import model.EnderecoDAO;
import model.EnderecoDTO;

public class EnderecoCTR {
    EnderecoDAO enderecoDAO = new EnderecoDAO();

    public String MostrarMatrix(EnderecoDTO enderecoDTO){
        return enderecoDAO.MostrarMatrix(enderecoDTO);
    }

}
