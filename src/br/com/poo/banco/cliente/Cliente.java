package br.com.poo.banco.cliente;

import br.com.poo.banco.conta.Banco;

public class Cliente {
    private String nome;
    private String cpf;
    private Banco banco;

    //Sobrecarga de metódos
    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Banco getBanco() {
        return banco;
    }
}
