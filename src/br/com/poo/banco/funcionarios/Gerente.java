package br.com.poo.banco.funcionarios;

public class Gerente extends  Funcionario{
    private int senha;
    private String tipo;

    public Gerente(String nome, double salario){
        this.nome = nome;
        this.salario = salario;

    }

    @Override
    public double calcularBonificacao(){
        return salario * 0.20;
    }

}
