package com.dio.projetobanco;

import java.util.List;

public class main {
    public static void main(String args[]){

        Banco banco = new Banco();

        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        cliente1.setNome("William Henrique Campos");
        cliente2.setNome("Jose de Arimateia");

        Conta cc1 = new ContaCorrente(cliente1);
        Conta cc2 = new ContaCorrente(cliente2);

        //banco.setContas(cc1);
        //banco.setContas(cc2);
        cc1.depositar(1000);
        cc1.sacar(450);

        cc1.transferir(550, cc2);
        cc2.sacar(250);
        cc1.imprimirExtrato();
        cc2.imprimirExtrato();

        //banco.imprimirClientes();

    }


}
