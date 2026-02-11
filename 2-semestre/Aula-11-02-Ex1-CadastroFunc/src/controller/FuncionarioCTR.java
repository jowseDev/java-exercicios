package controller;

import model.FuncionarioDAO;
import model.FuncionarioDTO;

public class FuncionarioCTR {
    
    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    
    public String gravarFuncionario(FuncionarioDTO funcionarioDTO){
        return funcionarioDAO.gravarFuncionario(funcionarioDTO);
    }
}
