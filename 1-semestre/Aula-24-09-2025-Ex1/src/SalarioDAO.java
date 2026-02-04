public class SalarioDAO {
    public void calcularSalario(SalarioDTO salarioDTO) {
        salarioDTO.setQtdHabitantes(salarioDTO.getQtdHabitantes() + 1);
        salarioDTO.setSomaSalarios(salarioDTO.getSomaSalarios() + salarioDTO.getSalario());

        String sexo = salarioDTO.getSexo().toUpperCase();
        if (sexo.equals("F")) {
            salarioDTO.setQtdMulheres(salarioDTO.getQtdMulheres() + 1);
            if (salarioDTO.getSalario() <= 300) {
                salarioDTO.setQtdMulheresSalarioBaixo(salarioDTO.getQtdMulheresSalarioBaixo() + 1);
            }
        } else if (sexo.equals("M")) {
            salarioDTO.setQtdHomens(salarioDTO.getQtdHomens() + 1);
        } else {
            throw new IllegalArgumentException("Sexo inválido! Digite apenas M ou F.");
        }
    }

    public String mostrarResultados(SalarioDTO salarioDTO) {
        double media = (double) salarioDTO.getSomaSalarios() / salarioDTO.getQtdHabitantes();
        double percHomens = (double) salarioDTO.getQtdHomens() / salarioDTO.getQtdHabitantes() * 100;
        double percMulheres = (double) salarioDTO.getQtdMulheres() / salarioDTO.getQtdHabitantes() * 100;
        double percMulheresBaixo = salarioDTO.getQtdMulheres() > 0
                ? (double) salarioDTO.getQtdMulheresSalarioBaixo() / salarioDTO.getQtdMulheres() * 100
                : 0;

        return "Média salarial: " + media +
                "\nPercentual de homens: " + percHomens + "%" +
                "\nPercentual de mulheres: " + percMulheres + "%" +
                "\nPercentual de mulheres com salário <= 300: " + percMulheresBaixo + "%";
    }
}
