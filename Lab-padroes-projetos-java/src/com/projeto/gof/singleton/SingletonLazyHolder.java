package com.projeto.gof.singleton;

/**
 * Singleton "Lazy Holder".
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 * @author Vandersonamaral
 */
public class SingletonLazyHolder {
    private static class instanceHolder{
        public static SingletonLazyHolder instance= new SingletonLazyHolder();
    }


    private SingletonLazyHolder() {
        super();
    }
    public static SingletonLazyHolder getInstance() {
        return instanceHolder.instance;
    }

}
