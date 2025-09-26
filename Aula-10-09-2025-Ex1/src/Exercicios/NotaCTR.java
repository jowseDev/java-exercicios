package Exercicios;

public class NotaCTR {
    NotaDAO notaDAO = new NotaDAO();

    public String mostrarNota(NotaDTO notaDTO){ return notaDAO.mostrarNota(notaDTO);}
}
