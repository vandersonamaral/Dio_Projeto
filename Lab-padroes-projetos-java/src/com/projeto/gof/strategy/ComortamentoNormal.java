package com.projeto.gof.strategy;

public class ComortamentoNormal implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Movendo-se normalmente...");
    }
}
