package Exercicio;

public class CalcularSalario {
    private Double salario = 1000.0, taxAumento = 1.5;
    private int ano;

    public double CalcularAumento(int ano) {
        this.ano = ano;

        if (salario < 2010) {
            this.salario = this.salario * (1 + (this.taxAumento / 100));

            for (int i = 2012; i < ano; i++) {
                this.taxAumento = this.taxAumento * 2;
                this.salario = this.salario + (1 + (this.taxAumento / 100));
            }

            return this.salario;
        } else {
            return this.salario;
        }
    }
}