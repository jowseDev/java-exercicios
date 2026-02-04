package controller;
import model.AlunoDTO;
import model.AlunoDAO;

public class AlunoCTR {
    AlunoDAO alunoDAO = new AlunoDAO();

    public void calcularNotas(AlunoDTO alunoDTO){
        alunoDAO.processarInformacoesAluno(alunoDTO);
    }
    public String mostrarResultado(AlunoDTO alunoDTO){
       return alunoDAO.gerarRelatorioAlunos(alunoDTO);
    }

}
