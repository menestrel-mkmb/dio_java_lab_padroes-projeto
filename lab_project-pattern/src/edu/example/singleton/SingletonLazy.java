package edu.example.singleton;

/*
 *
 * Singleton Preguiçoso
 * @author Michael
 *
* */
public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstance() {
        if( instancia == null ) instancia = new SingletonLazy();
        return instancia;
    }
}
