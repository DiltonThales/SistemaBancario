package br.com.poo.banco.main;

import br.com.poo.banco.bonificacao.ControleBonificacoes;
import br.com.poo.banco.funcionarios.Funcionario;
import br.com.poo.banco.funcionarios.Gerente;
import br.com.poo.banco.funcionarios.Secretaria;
import br.com.poo.banco.interfaceusuario.InterfaceUsuario;

public class TesteFuncionario {
    public static void main(String[] args) {

        InterfaceUsuario ui = new InterfaceUsuario();

        Gerente gerente1 = new Gerente("Maria",14000.0);
        ui.mostrarNaTela(gerente1.getNome());
        ui.mostrarNaTela(String.valueOf(gerente1.getSalario()));
        ui.mostrarNaTela("Bonificação: " + gerente1.calcularBonificacao() + "\n");

        Secretaria secretaria1 = new Secretaria("Joana",2000.0,123);
        ui.mostrarNaTela(secretaria1.getNome());
        ui.mostrarNaTela(String.valueOf(secretaria1.getSalario()));
        ui.mostrarNaTela("Bonificação: " + secretaria1.calcularBonificacao() + "\n");

        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Funcionário Teste");
        funcionario1.setSalario(1500.0);
        ui.mostrarNaTela("Bonificação funcionário: " + funcionario1.calcularBonificacao(500.0));

        Gerente gerente2 = new Gerente("José",12500.00,"Gerente Administrativo");

        Funcionario funcionario2 = gerente2;
        ui.mostrarNaTela("Bonificação: " + funcionario2.calcularBonificacao());
        ui.mostrarNaTela(gerente2.getTipo());

        // Certo, pois sempre um gerente será um funcionário
        // Poliformismo
        Funcionario funcionario3 = new Gerente("João",10000.0);
        // Errado, pois nem sempre um funcionario é um gerente
        //Gerente gerente4 = new Funcionario();

        ControleBonificacoes controleBonificacoes = new ControleBonificacoes();

        controleBonificacoes.registarBonificacao(gerente1);
        controleBonificacoes.registarBonificacao(secretaria1);

        ui.mostrarNaTela("Total Bonificações: " + controleBonificacoes.obterBonificacao());

    }
}
