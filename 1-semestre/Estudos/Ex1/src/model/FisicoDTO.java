package model;

public class FisicoDTO extends ClienteDTO{

    public String fis_cpf, fis_rg;

    public String getFis_cpf() {
        return fis_cpf;
    }

    public void setFis_cpf(String fis_cpf) {
        this.fis_cpf = fis_cpf;
    }

    public String getFis_rg() {
        return fis_rg;
    }

    public void setFis_rg(String fis_rg) {
        this.fis_rg = fis_rg;
    }
}
