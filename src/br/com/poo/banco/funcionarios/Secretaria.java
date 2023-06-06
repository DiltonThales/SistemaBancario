package br.com.poo.banco.funcionarios;

public class Secretaria extends Funcionario{
    private int registro;

    public Secretaria(String nome, double salario, int registro){
        this.nome = nome;
        this.salario = salario;
        this.registro = registro;
    }
    @Override
    public double calcularBonificacao(){
        return super.calcularBonificacao() + 200.0;
    }


}
