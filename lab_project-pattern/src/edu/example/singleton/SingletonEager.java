package edu.example.singleton;

/*
 *
 * Singleton Guloso
 * @author Michael
 *
* */

public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        super();
    }
    public static SingletonEager getInstance() {
        return instance;
    }
}
