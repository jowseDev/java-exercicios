package Exercicios;

public class ClienteDAO {

    public String mostrarNomeRg (ClienteDTO clienteDTO) {
        return "O nome informado foi: " + clienteDTO.getNome()
                + "\n A idade informado foi: " + clienteDTO.getIdade();
    }
    public String mostrarNomeIdade (ClienteDTO clienteDTO) {
        return "O nome informado foi: " + clienteDTO.getNome() +
                "\n A idade informado foi: " + clienteDTO.getIdade();
    }
}
