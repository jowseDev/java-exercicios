public class ImovelDTO implements  IimovelDTO{
    public String Endereco, Bairro, Cidade, Proprietario;
    public int numero;

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public String getProprietario() {
        return Proprietario;
    }

    public void setProprietario(String proprietario) {
        Proprietario = proprietario;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
