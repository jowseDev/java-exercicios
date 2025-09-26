public class SalarioDTO {
    private int salario;
    private String sexo;
    private int qtdHabitantes;
    private int somaSalarios;
    private int qtdHomens;
    private int qtdMulheres;
    private int qtdMulheresSalarioBaixo;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getQtdHabitantes() {
        return qtdHabitantes;
    }

    public void setQtdHabitantes(int qtdHabitantes) {
        this.qtdHabitantes = qtdHabitantes;
    }

    public int getSomaSalarios() {
        return somaSalarios;
    }

    public void setSomaSalarios(int somaSalarios) {
        this.somaSalarios = somaSalarios;
    }

    public int getQtdHomens() {
        return qtdHomens;
    }

    public void setQtdHomens(int qtdHomens) {
        this.qtdHomens = qtdHomens;
    }

    public int getQtdMulheres() {
        return qtdMulheres;
    }

    public void setQtdMulheres(int qtdMulheres) {
        this.qtdMulheres = qtdMulheres;
    }

    public int getQtdMulheresSalarioBaixo() {
        return qtdMulheresSalarioBaixo;
    }

    public void setQtdMulheresSalarioBaixo(int qtdMulheresSalarioBaixo) {
        this.qtdMulheresSalarioBaixo = qtdMulheresSalarioBaixo;
    }
}
