package controller;
import model.NumerosDAO;

public class NumerosCTR {
    NumerosDAO numerosDAO = new NumerosDAO();

    public String MostrarDados(NumerosDTO numerosDTO){
        return numerosDAO.MostrarMatris(numerosDTO);

    }

    public String MostrarDadosDiagonal(NumerosDTO numerosDTO){
        return numerosDAO.MostrarMatrisDiagonal(numerosDTO);

    }


}
