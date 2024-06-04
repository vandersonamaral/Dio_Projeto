package com.projeto.gof.strategy;

public class ComortamentoAgressivp implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente...");
    }
}
