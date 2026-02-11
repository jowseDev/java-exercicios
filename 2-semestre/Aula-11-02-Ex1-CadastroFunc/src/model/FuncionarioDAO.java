
package model;

public class FuncionarioDAO {
    
    public String gravarFuncionario(FuncionarioDTO funcionarioDTO){
           return "Os dados gravados são: " + 
                   "\n Nome: " + funcionarioDTO.getNome() +
                   "\n Nome: " + funcionarioDTO.getLogadouro() +
                   "\n Nome: " + funcionarioDTO.getNumero() +
                   "\n Nome: " + funcionarioDTO.getBairro() +
                   "\n Nome: " + funcionarioDTO.getCidade() +
                   "\n Nome: " + funcionarioDTO.getEstado() +
                   "\n Nome: " + funcionarioDTO.getCep() +
                   "\n Nome: " + funcionarioDTO.getCpf() 
                   +"\n Nome: " + funcionarioDTO.getRg();
                   
    }
}