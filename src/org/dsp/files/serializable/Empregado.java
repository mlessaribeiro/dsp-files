package org.dsp.files.serializable;

import java.io.Serializable;

public class Empregado implements Serializable {

    private String nome;
    private String endereco;
    private transient int cpf;
    private int numero;
    
    private int wololo;

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

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String toString() {
        return "Empregado       [nome=" + nome + " endereco=" + endereco 
                 + " cpf=" + cpf + " numero=" + numero + "]";
    }
    
}
