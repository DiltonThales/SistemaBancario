package br.com.poo.banco.interfaceusuario;

import java.util.Scanner;

public class InterfaceUsuario {
    private Scanner ler;
    public InterfaceUsuario(){

        //System.in é que eu vou ter uma entrada de dados
        this.ler = new Scanner(System.in);
    }

    public Scanner lerDados(){
        return this.ler;
    }

    public void mostrarNaTela(String mensagem){
        System.out.println(mensagem);
    }
}
