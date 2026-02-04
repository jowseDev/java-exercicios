package model;
import controller.*;
import view.*;

public class FisicoDAO {
    FisicoDTO fisicoDTO = new FisicoDTO();

    public String mostrarDadosClienteF(FisicoDTO fisicoDTO){
        return  "Os dados do cliente Físico são:  \n" +
                "O CPF é: \n" + fisicoDTO.getFis_cpf() +
                "O RG é: \n" + fisicoDTO.getFis_rg();


    }
}
