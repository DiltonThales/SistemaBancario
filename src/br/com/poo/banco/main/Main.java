package br.com.poo.banco.main;

import br.com.poo.banco.cliente.Cliente;
import br.com.poo.banco.conta.Banco;
import br.com.poo.banco.conta.Conta;
import br.com.poo.banco.interfaceusuario.InterfaceUsuario;

public class Main {
    public static void main(String[] args) {

        // ui é User Interface
        InterfaceUsuario ui = new InterfaceUsuario();

        ui.mostrarNaTela("Entre com o nome do Banco: ");
        String nomeBanco = ui.lerDados().nextLine();

        ui.mostrarNaTela("Entre com a quantidade de máxima de contas: ");

        //nextInt serviço fornecido pelo Scanner para ler um valor inteiro
        int qtdeContas = ui.lerDados().nextInt();


        ui.mostrarNaTela("Entre com a quantidade máxima de clientes: ");
        int qtdeClientes = ui.lerDados().nextInt();

        Banco banco = new Banco(nomeBanco, qtdeContas, qtdeClientes);

        int opcao = -1;

        do{
            ui.mostrarNaTela("\nSistema Bancário " + banco.getNome() +
                    "\n=== Opções ===" +
                    "\n1 - Cadastrar Clientes" +
                    "\n2 - Cadastrar Contas" +
                    "\n3 - Listar Contas" +
                    "\n4 - Listar Clientes" +
                    "\n5 - Exibir total de Contas" +
                    "\n0 - Sair");
            opcao = ui.lerDados().nextInt();


            switch (opcao){
                case 1:
                    ui.mostrarNaTela("Nome do Cliente: ");
                    String nomeCliente = ui.lerDados().next();

                    ui.mostrarNaTela("CPF do cliente: ");
                    String cpfCliente = ui.lerDados().next();

                    Cliente cliente = new Cliente(nomeCliente, cpfCliente);
                    banco.cadastrarCliente(cliente);

                    break;

                case 2:
                    ui.mostrarNaTela("Tipo da Conta: ");
                    String tipoConta = ui.lerDados().next();
                    ui.mostrarNaTela("Índice do cliente");
                    int indiceCliente = ui.lerDados().nextInt();

                    Cliente clienteConta = banco.buscarClientePorIndice(indiceCliente);
                    Conta conta = new Conta(tipoConta, clienteConta, banco);

                    banco.cadastrarConta(conta);

                    break;

                case 3:
                    banco.listarContas();
                    break;

                case 4:
                    banco.listarClientes();
                    break;

                case 5:
                    ui.mostrarNaTela("Total de Contas: " + Conta.getTotalContas());
                    break;

                case 0:
                    ui.mostrarNaTela("Saindo.............");
                    break;

                default: ui.mostrarNaTela("Opção Inválida!!! ");
            }

        }while(opcao != 0);

    }
}
