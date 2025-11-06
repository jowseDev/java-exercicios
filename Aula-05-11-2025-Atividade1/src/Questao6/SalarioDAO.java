package Questao6;

public class SalarioDAO {
    SalarioDTO dto = new SalarioDTO();
    public Integer calcularSalarioFunc(SalarioDTO dto){

        int v_hora = dto.getV_SalarioMinimo() / 8;
        int v_horaExtra = dto.getV_SalarioMinimo() / 4;
        int salarioBruto = dto.getN_HorasTrabalhadas() * v_hora;
        int adc_HorasExtras = dto.getN_HorasExTras() *v_horaExtra;

        return dto.setSalarioFinal_Func(salarioBruto + adc_HorasExtras);
    }


}
