/*
 * Após uma análise cuidadosa realizada pela equipe de desenvolvimento de uma empresa bancaria,
 *  foi identificado a necessidade de uma nova funcionalidade para otimizar os processos e melhorias da experiência dos usuários.
 *  Agora, sua tarefa é implementar uma solução que organize em ordem alfabética uma lista de ativos 
 * que será informada pelos usuários. Os ativos são representados por strings que representam seus tipos, como por exemplo:
 *  Reservas de liquidez, Ativos intangiveis e dentre outros.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BancoOrganizadorAtivos {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> ativos = new ArrayList < > ();

    
        //Entrada dos tipos de ativos
        int quantidadeAtivos = scanner.nextInt();
        scanner.nextLine();
    
        // Entrada dos códigos dos ativos
        for (int i = 0; i < quantidadeAtivos; i++) {
          String codigoDoAtivo = scanner.nextLine();
          ativos.add(codigoDoAtivo);
        }
    
        //TODO: Ordenar os ativos em ordem alfabética.
         Collections.sort(ativos);
         
        //TODO: Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.
         for (String ativo : ativos) {
                System.out.println(ativo);
            }
    }    
}
