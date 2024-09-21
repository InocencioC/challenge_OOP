package org.example;

public class ContaPoupanca {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public ContaPoupanca() {  //construtor sugerido pela IDE
        super();
    }

    public void imprimirExtrato() {
        System.out.println("#### Extrato de Conta Poupança #####");
        super.imprimirInfosComuns();
    }
}
