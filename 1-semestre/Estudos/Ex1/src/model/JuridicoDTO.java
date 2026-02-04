package model;
import controller.*;
import view.*;

public class JuridicoDTO extends ClienteDTO {
    public String jur_cnpj, jur_ie;

    public String getJur_cnpj() {
        return jur_cnpj;
    }

    public void setJur_cnpj(String jur_cnpj) {
        this.jur_cnpj = jur_cnpj;
    }

    public String getJur_ie() {
        return jur_ie;
    }

    public void setJur_ie(String jur_ie) {
        this.jur_ie = jur_ie;
    }
}
