package model;
import controller.*;
import view.*;

public class ClienteDTO {

    public String nome, endereco, cidade, estado;
    public Integer numero_casa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getNumero_casa() {
        return numero_casa;
    }

    public void setNumero_casa(Integer numero_casa) {
        this.numero_casa = numero_casa;
    }
}
