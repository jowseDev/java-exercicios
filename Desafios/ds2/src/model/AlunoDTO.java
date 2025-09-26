package model;

public class AlunoDTO {

    private String nome, sexo;
    private int idade, qtdAlunos, qtdHomen, qtdMulher;
    private double nota, somaNotas, maiorNotaHomen, MaiorNotaMulher;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    public int getQtdHomen() {
        return qtdHomen;
    }

    public void setQtdHomen(int qtdHomen) {
        this.qtdHomen = qtdHomen;
    }

    public int getQtdMulher() {
        return qtdMulher;
    }

    public void setQtdMulher(int qtdMulher) {
        this.qtdMulher = qtdMulher;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getSomaNotas() {
        return somaNotas;
    }

    public void setSomaNotas(double somaNotas) {
        this.somaNotas = somaNotas;
    }

    public double getMaiorNotaHomen() {
        return maiorNotaHomen;
    }

    public void setMaiorNotaHomen(double maiorNotaHomen) {
        this.maiorNotaHomen = maiorNotaHomen;
    }

    public double getMaiorNotaMulher() {
        return MaiorNotaMulher;
    }

    public void setMaiorNotaMulher(double maiorNotaMulher) {
        MaiorNotaMulher = maiorNotaMulher;
    }
}
