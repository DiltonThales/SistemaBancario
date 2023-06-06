package br.com.poo.banco.bonificacao;

import br.com.poo.banco.funcionarios.Funcionario;

public class ControleBonificacoes {
    private double totalBonificacoes = 0;

    public void registarBonificacao(Funcionario funcionario){
        this.totalBonificacoes += funcionario.calcularBonificacao();

    }

    public double obterBonificacao(){
        return this.totalBonificacoes;

    }
}
