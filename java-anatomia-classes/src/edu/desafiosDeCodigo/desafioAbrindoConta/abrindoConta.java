package edu.semanaBase.desafiosDeCodigo.desafioAbrindoConta;

/*
* Desafio
* Você é um desenvolvedor em início de carreira e foi contratado por um banco para criar um sistema básico de abertura de contas.
* Sua tarefa é implementar uma classe chamada "ContaBancaria" que represente uma conta bancária com as seguintes informações:
* número da conta, nome do titular e saldo.*/

public class abrindoConta {
    public static void main(String[] args) {
        // TODO: Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
        String nomeTitular = scanner.nextLine();
        double saldo = scanner.nextDouble();

        // TODO: Criar uma instância de "ContaBancaria" com os valores de Entrada.
        ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldo);

        System.out.println("Informacoes:");
        // TODO: Imprimir as informações da conta usando o objeto criado acima.
        System.out.println("Conta: " + conta.numero);
        System.out.println("Titular: " + conta.titular);
        System.out.printf("Saldo: R$ %.1f%n", conta.saldo);
    }
}

class ContaBancaria {
    int numero;
    String titular;
    double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
}
