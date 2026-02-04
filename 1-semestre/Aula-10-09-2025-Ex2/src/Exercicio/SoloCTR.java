package Exercicio;

public class SoloCTR {
    SoloDAO soloDAO =  new SoloDAO();

    public String mostrarSolo(SoloDTO soloDTO){ return soloDAO.mostrarSolo(soloDTO); }
}
