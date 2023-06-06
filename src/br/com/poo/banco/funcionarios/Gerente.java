package br.com.poo.banco.funcionarios;


public class Gerente extends  Funcionario{
    private int senha;
    private String tipo;

    // instanciar um objeto a partir dela - instanciar um objeto de uma classe
    public Gerente(String nome, double salario){
        this.nome = nome;
        this.salario = salario;

    }

    public Gerente(String nome, double salario, String tipo){
        this.nome = nome;
        this.salario = salario;
        this.tipo = tipo;

    }

    @Override
    public double calcularBonificacao(){
        return salario * 0.20;
    }

    public String getTipo() {
        return tipo;
    }
}
