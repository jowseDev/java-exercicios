package controller;

import model.CalculadoraDAO;
import model.CalculadoraDTO;

public class CalculadoraCTR {
    CalculadoraDAO calculadoraDAO = new CalculadoraDAO();

    public Double CalcularView(CalculadoraDTO calculadoraDTO){
    return calculadoraDAO.Calcular(calculadoraDTO);
    }



}
