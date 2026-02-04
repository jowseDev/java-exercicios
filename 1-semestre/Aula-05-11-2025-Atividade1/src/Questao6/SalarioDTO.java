package Questao6;

public class SalarioDTO {

    public int N_HorasTrabalhadas, V_SalarioMinimo, N_HorasExTras, SalarioFinal_Func;

    public int getN_HorasTrabalhadas() {
        return N_HorasTrabalhadas;
    }

    public void setN_HorasTrabalhadas(int n_HorasTrabalhadas) {
        N_HorasTrabalhadas = n_HorasTrabalhadas;
    }

    public int getV_SalarioMinimo() {
        return V_SalarioMinimo;
    }

    public void setV_SalarioMinimo(int v_SalarioMinimo) {
        V_SalarioMinimo = v_SalarioMinimo;
    }

    public int getN_HorasExTras() {
        return N_HorasExTras;
    }

    public void setN_HorasExTras(int n_HorasExTras) {
        N_HorasExTras = n_HorasExTras;
    }

    public int getSalarioFinal_Func() {
        return SalarioFinal_Func;
    }

    public Integer setSalarioFinal_Func(int salarioFinal_Func) {
        SalarioFinal_Func = salarioFinal_Func;
        return null;
    }
}
