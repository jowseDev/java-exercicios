package Exercicios;

public class NotaDAO {

    public String mostrarNota(NotaDTO notaDTO) {

        int media = (int) (notaDTO.getNota1() + notaDTO.getNota2()) / 2;

        if(media > 7){
            return "Parabens, " + notaDTO.getNome() + " você foi aprovado!";
        }else if(media >= 4){
            return "Atenção!, " + notaDTO.getNome() + " você está de recuperação!!";
        }else{
            return "Atenção!, " +  notaDTO.getNome() + " voce reprovou!!!";
        }

    }
}
