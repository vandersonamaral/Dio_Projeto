package com.projeto.gof.singleton;

/**
 * Singleton "Apressado".
 * @author Vandersonamaral
 */
public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {

        super();
    }
    public static SingletonEager getInstance() {
       return instance;
    }

}
