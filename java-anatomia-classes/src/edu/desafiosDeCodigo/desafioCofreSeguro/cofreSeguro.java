package edu.semanaBase.desafiosDeCodigo.desafioCofreSeguro;

import java.util.Scanner;

public class cofreSeguro {
    /*
    * Descrição
    * Você foi contratado para desenvolver um sistema de cofres seguros. O objetivo é criar dois tipos de cofres:
    * um Cofre Digital, que é aberto por senha, e um Cofre Físico, que é aberto por chave.
    * */

    abstract class Cofre {
        protected String tipo;
        protected String metodoAbertura;

        public Cofre(String tipo, String metodoAbertura) {
            this.tipo = tipo;
            this.metodoAbertura = metodoAbertura;
        }

        public void imprimirInformacoes() {
            System.out.println("Tipo: " + this.tipo);
            System.out.println("Metodo de abertura: " + this.metodoAbertura);
        }
    }

    class CofreDigital extends Cofre {

        private int senha;

        public CofreDigital(int senha) {
            super("Cofre Digital", "Senha");
            this.senha = senha;
        }

        public boolean validarSenha(int confirmacaoSenha) {
            return confirmacaoSenha == this.senha;
        }
    }

    class CofreFisico extends Cofre {

        public CofreFisico() {
            super("Cofre Fisico", "Chave");
        }
    }

    public class Desafio {
        public static void main(String[] args) {
            // Lê o tipo de cofre (primeira linha da entrada)
            Scanner scanner = new Scanner(System.in);
            String tipoCofre = scanner.nextLine();

            // Verifica o tipo de cofre e realiza ação apropriada
            if (tipoCofre.equalsIgnoreCase("digital")) {
                int senha = scanner.nextInt();
                int confirmacaoSenha = scanner.nextInt();
                CofreDigital cofreDigital = new CofreDigital(senha);

                if (cofreDigital.validarSenha(confirmacaoSenha)) {
                    System.out.println("Tipo: Cofre Digital");
                    System.out.println("Metodo de abertura: Senha");
                    System.out.println("Cofre aberto!");
                } else {
                    System.out.println("Tipo: Cofre Digital");
                    System.out.println("Metodo de abertura: Senha");
                    System.out.println("Senha incorreta!");
                }
            } else if (tipoCofre.equalsIgnoreCase("fisico")) {
                CofreFisico cofreFisico = new CofreFisico();
                System.out.println("Tipo: Cofre Fisico");
                System.out.println("Metodo de abertura: Chave");
            }

            scanner.close();
        }
}
