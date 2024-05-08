package com.application;

import com.entities.util.Iphone;

public class TesteAparelho {
    public static void main(String[] args) {
        Iphone iphone11 =new Iphone();

        iphone11.adicionarNovaAba();
        iphone11.atender();
        iphone11.ligar();
    }
}
