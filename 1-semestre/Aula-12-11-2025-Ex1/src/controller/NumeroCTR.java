package controller;

import model.NumeroDAO;
import model.NumeroDTO;

public class NumeroCTR {
    NumeroDAO numeroDAO = new NumeroDAO();

    public String mostrarDados(NumeroDTO numeroDTO){
        return numeroDAO.MostrarMatrx(numeroDTO);
    }
}
