package com.projeto.gof;

import com.projeto.gof.facade.Facade;
import com.projeto.gof.singleton.SingletonEager;
import com.projeto.gof.singleton.SingletonLazy;
import com.projeto.gof.singleton.SingletonLazyHolder;
import com.projeto.gof.strategy.*;

public class Teste {
    public static void main(String[] args) {

        // Singleton
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager=SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        //Strategy

        Comportamento normal =new ComortamentoNormal();
        Comportamento agressivo = new ComortamentoAgressivp();
        Comportamento defensivo = new ComortamentoDefensivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();


        // Facade

        Facade facade = new Facade();
        facade.migrarCLiente("Vanderson","39640-000");
    }
}
