package br.com.poo.banco.conta;

import br.com.poo.banco.cliente.Cliente;

import java.util.Random;

public class Conta {
    private String tipo;
    private int numero;
    private double saldo;
    private Cliente cliente;
    private Banco banco;

    //static se refere a classe e nao ao objeto
    public static int totalContas;

    public Conta(String tipo, Cliente cliente, Banco banco){
        this.tipo = tipo;
        this.numero = new Random().nextInt(10000);
        this.saldo = 0.0;
        this.cliente = cliente;
        this.banco = banco;
        Conta.totalContas += 1;
    }

    public static int getTotalContas(){
        return Conta.totalContas;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public boolean sacar(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else {
            return false;
        }
    }

    public boolean transferir(double valor, Conta contaDestino){
        if(this.sacar(valor)){
            contaDestino.depositar(valor);
            return true;
        }else {
            return false;
        }
    }

    public String obterDados(){
        return "Número: " + this.numero + " / Tipo: " + this.tipo + " / Proprietário: " + this.cliente.getNome() + " / Saldo: " + this.saldo;
    }
}
