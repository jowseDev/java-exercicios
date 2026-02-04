public class MotoristaDAO {

    private String msg;

    public String calcularDAO(MotoristaDTO motoristaDTO){
        if(motoristaDTO.getIdade() >= 18){
            this.msg = "O motorista pode ter CNH!";
        }else{
            this.msg = "O motorista não pode ter CNH!";
        }
        return this.msg;
    }

}
