package br.com.poo.banco.main;

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

    }
}
