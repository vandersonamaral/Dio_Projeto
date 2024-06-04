package com.projeto.gof.strategy;

public class ComortamentoDefensivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Movendo-se defensivamente...");
    }
}
