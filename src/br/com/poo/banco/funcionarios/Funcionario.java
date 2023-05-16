package br.com.poo.banco.funcionarios;

public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;

    public double calcularBonificacao(){
        return salario * 0.10;
    }


    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
