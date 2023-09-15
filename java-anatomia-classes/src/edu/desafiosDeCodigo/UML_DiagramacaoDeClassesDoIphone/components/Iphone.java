package edu.semanaBase.desafiosDeCodigo.UML_DiagramacaoDeClassesDoIphone.components;

import edu.semanaBase.desafiosDeCodigo.UML_DiagramacaoDeClassesDoIphone.funcionalidades.navegadorWeb;
import edu.semanaBase.desafiosDeCodigo.UML_DiagramacaoDeClassesDoIphone.funcionalidades.reprodutorMidia;
import edu.semanaBase.desafiosDeCodigo.UML_DiagramacaoDeClassesDoIphone.funcionalidades.telefone;
public class Iphone implements navegadorWeb, reprodutorMidia, telefone {
    @Override
    public void exibirPagina() {
        System.out.print("Abrido o navegador e exibindo a página inicial!");
    }

    @Override
    public void atualizarPaginar() {
        System.out.print("Atualizando, aguarde!");
    }

    @Override
    public void adicionarAba() {
        System.out.print("Abrindo nova gia.");
    }

    @Override
    public void fecharPagina() {
        System.out.print("Fechando guia.");
    }

    @Override
    public void reproduzir() {
        System.out.print("Reproduzindo mídia...");
    }

    @Override
    public void pausar() {
        System.out.print("Pausado....");
    }

    @Override
    public void passarMusica() {
        System.out.print("reproduzindo próxima mídia.");
    }

    @Override
    public void voltarMusica() {
        System.out.print("Reproduzindo mídia anterior.");
    }

    @Override
    public void ligar() {
        System.out.print("Realizando chamada...");
    }

    @Override
    public void desligar() {
        System.out.print("Encerrando ligação!");
    }

    @Override
    public void atender() {
        System.out.print("Atender ligação.");
    }

    @Override
    public void correioDeVoz() {
        System.out.print("Abrindo correio de voz.");
    }
}
