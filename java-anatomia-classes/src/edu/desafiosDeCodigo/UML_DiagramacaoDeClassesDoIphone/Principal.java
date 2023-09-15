package edu.semanaBase.desafiosDeCodigo.UML_DiagramacaoDeClassesDoIphone;

import edu.semanaBase.desafiosDeCodigo.UML_DiagramacaoDeClassesDoIphone.components.Iphone;

public class Principal {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("Realizando Chamada - Telefone");
        iphone.ligar();
        System.out.println();
        iphone.atender();
        System.out.println();
        iphone.correioDeVoz();
        System.out.println();

        System.out.println();
        System.out.println("IPOD - Repodutor de Mídia.");

        iphone.reproduzir();
        System.out.println();
        iphone.passarMusica();
        System.out.println();
        iphone.voltarMusica();
        System.out.println();
        iphone.pausar();
        System.out.println();

        System.out.println();

        System.out.println("Navegador Web - Safari");
        iphone.adicionarAba();
        System.out.println();
        iphone.exibirPagina();
        System.out.println();
        iphone.atualizarPaginar();
    }
}
