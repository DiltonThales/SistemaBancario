package br.com.poo.banco.conta;

import br.com.poo.banco.cliente.Cliente;
import br.com.poo.banco.interfaceusuario.InterfaceUsuario;

public class Banco {
    private String nome;
    private Conta[] contas;
    private Cliente[] clientes;

    public Banco(String nome, int qtdeContas, int qtdeClientes){
        this.nome = nome;
        this.contas = new Conta[qtdeContas];
        this.clientes = new Cliente[qtdeClientes];
    }

    public String getNome() {
        return nome;
    }

    public Cliente buscarClientePorIndice(int i){
        return clientes[i];
    }

    public void cadastrarCliente(Cliente cliente){
        cliente.setBanco(this);
        for (int i = 0; i < this.clientes.length; i++){
            if(this.clientes[i] == null){
                clientes[i] = cliente;
                //this.clientes[i].setBanco(this);
                break;
            }
        }
    }

    public void listarClientes(){
        InterfaceUsuario ui = new InterfaceUsuario();
        for(Cliente cliente : this.clientes){
            if (cliente != null){
                ui.mostrarNaTela(cliente.getNome()  + " " + cliente.getBanco().getNome());
            }
        }
    }

    public void cadastrarConta(Conta conta){
        for (int i = 0; i < this.contas.length; i++){
            if (this.contas[i] == null){
                this.contas[i] = conta;
                break;
            }
        }
    }

    public void listarContas(){
        InterfaceUsuario ui = new InterfaceUsuario();
        boolean contaVazia = true;

        for (Conta conta : this.contas){
            if(conta != null){
                ui.mostrarNaTela(conta.obterDados());
                contaVazia = false;
            }
        }

        if(contaVazia){
            ui.mostrarNaTela("Não há contas cadastradas!");
        }
    }
}
