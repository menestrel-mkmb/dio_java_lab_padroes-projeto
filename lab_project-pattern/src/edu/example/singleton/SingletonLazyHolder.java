package edu.example.singleton;

/*
 *
 * Singleton Preguiçoso Conservador
 * @author Michael
 *
 * */
public class SingletonLazyHolder {
    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instancia;
    }
}
