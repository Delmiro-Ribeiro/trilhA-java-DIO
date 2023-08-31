import java.util.Scanner;

/*
 * Você foi contratado por um banco para desenvolver um programa que auxilie seus clientes a realizar depósitos em suas contas.
 *  O programa deve solicitar ao cliente o valor do depósito e verificar se o valor é válido. 
 * Se o valor for maior do que zero, o programa deve adicionar o valor ao saldo da conta. 
 * Caso contrário, o programa deve exibir uma mensagem de erro e solicitar um novo valor.
 *  O programa deve continuar solicitando valores de depósito até que seja digitado um valor válido.
 */

public class OGrandeDeposito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0.0;
        
        
        
            double valor = scanner.nextDouble();

            if (valor > 0) {
                saldo = saldo + valor;
                System.out.println("Deposito realizado com sucesso!");
                System.out.printf("Saldo atual: R$ %.2f", saldo);
            } else if (valor == 0) {
                System.out.println("Encerrando o programa...");
                    //break;
            } else{
                System.out.println("Valor invalido! Digite um valor maior que zero.");
            }
        
            
        }

    }

