package model;

public class AlunoDAO {

    public void processarInformacoesAluno(AlunoDTO dto){

        String sexo = dto.getSexo().toUpperCase();
    if(sexo.equals("F")){
        dto.setQtdAlunos(dto.getQtdAlunos() + 1);
        dto.setQtdMulher(dto.getQtdMulher() + 1);
        if(dto.getNota() > dto.getMaiorNotaMulher()){
            dto.setMaiorNotaMulher(dto.getNota());
        }
    } else if (sexo.equals("M")) {
        dto.setQtdAlunos(dto.getQtdAlunos() + 1);
        dto.setQtdHomen(dto.getQtdHomen() + 1);
        if(dto.getNota() > dto.getMaiorNotaHomen()){
            dto.setMaiorNotaHomen(dto.getNota());
        }
    }
    dto.setSomaNotas(dto.getSomaNotas() + dto.getNota());
    }
    public String gerarRelatorioAlunos(AlunoDTO dto){

        double mediaNotas = (double) dto.getSomaNotas() / dto.getQtdAlunos();
        double pctHomens = (double) dto.getQtdHomen() / dto.getQtdAlunos() * 100;
        double pctMulheres = (double) dto.getQtdMulher() / dto.getQtdAlunos() * 100;

        return "A Média de notas da escola é: " + mediaNotas +
                "\n A porcentagem de homens é igual a: " + pctHomens + "%" +
                "\n A porcentagem de Mulheres é igual a: " + pctMulheres + "%" +
                "\n A maior nota de Homens é:" + dto.getMaiorNotaHomen() +
                "\n A maior nota das Mulheres é:" + dto.getMaiorNotaMulher();
    }

}
