package model;
import controller.*;
import view.*;

public class JuridicoDAO {
    JuridicoDTO juridicoDTO = new JuridicoDTO();

    public String mostrarDadosClienteJ(JuridicoDTO juridicoDTO){
        return "Os dados do cliente Jurídico são:  \n" +
                "O CNPJ é: \n" + juridicoDTO.getJur_cnpj() +
                "A IE(Inscrição Estadual) é:" + juridicoDTO.getJur_ie();
    }

}
