public class MotoristaDAO {
    public String mostrarIdade(MotoristaDTO motoristaDTO){
        if(motoristaDTO.getIdade() <= 18){
            return "Você não pode ter carteira de motorista!";
        }else{
            return "Você pode ter carteira de motorista!";
        }
    }
}
