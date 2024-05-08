package com.entities.util;

import com.entities.AparelhoTelefonico;
import com.entities.NavegadoInternet;
import com.entities.ReprodutorMusicial;

public class Iphone implements AparelhoTelefonico , NavegadoInternet, ReprodutorMusicial {
    @Override
    public void ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio voz");

    }

    @Override
    public void enviarPagina() {
        System.out.println("Enviando Pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica");

    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica");

    }
}
