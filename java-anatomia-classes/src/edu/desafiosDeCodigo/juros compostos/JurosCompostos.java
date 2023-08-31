import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Imagine que você está desenvolvendo um aplicativo para um banco que deseja calcular os juros compostos de um investimento.
 *  Seu objetivo é criar uma função que receba três parâmetros: o valor inicial do investimento,
 *  a taxa de juros anual e o período de tempo em anos. 
 * A função deve calcular e retornar o valor final do investimento após o período determinado, 
 * levando em consideração os juros compostos
 */

public class JurosCompostos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double valorInicial = scanner.nextDouble();
        
        double taxaJuros = scanner.nextDouble();
        
        int periodo = scanner.nextInt();
        
        /*subtituir o double valorFinal = valorInicial por essa expressão abaixo,
        pois não conseguir encontrar outra forma.
        */
        double valor_final = 0.0;
        
        valor_final = calculoJuros(valorInicial, taxaJuros, periodo);
    
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.println("Valor final do investimento: R$ " + df.format(valor_final));
        
        scanner.close();
    }
    
    public static double calculoJuros(double valorInicial, double taxaJuros, int periodo) {
      return valorInicial * Math.pow(1 + taxaJuros, periodo); 
    }
}
