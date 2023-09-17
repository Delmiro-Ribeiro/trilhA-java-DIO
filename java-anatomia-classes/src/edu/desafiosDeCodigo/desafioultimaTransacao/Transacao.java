package edu.semanaBase.desafiosDeCodigo.desafioultimaTransacao;

import java.util.Scanner;

public class Transacao {
    /*
    * Descrição
    * Neste desafio, você criará uma solução para um sistema bancário utilizando conceitos de orientação a objetos.
* A implementação solicitada pela equipe de desenvolvimento da empresa bancária,
* gostaria de fosse realizado uma melhoria no sistema de registros, onde é recebido os dados brutos dos registros bancários.
* O objetivo é obter as informações de uma forma mais amigavel para o cliente e não oferecer informações brutas.
    *
    * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String entrada = scanner.nextLine();
        String[] partes = entrada.split(",");

        if (partes.length == 4) {
            String data = partes[0];
            String hora = partes[1];
            String descricao = partes[2];
            double valor = Double.parseDouble(partes[3]);

            // Cria uma instância de Transacao com os valores lidos
            Transacao transacao = new Transacao(data, hora, descricao, valor);

            // Imprime as informações da transação
            transacao.imprimir();
        } else {
            System.out.println("Registro inválido.");
        }
    }
}

class Transacao {
    private String data;
    private String hora;
    private String descricao;
    private double valor;

    public Transacao(String data, String hora, String descricao, double valor) {
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
        this.valor = valor;
    }

    public void imprimir() {
        System.out.println(this.descricao);
        System.out.println(this.data);
        System.out.println(this.hora);
        System.out.printf("%.2f", this.valor);
    }
}
