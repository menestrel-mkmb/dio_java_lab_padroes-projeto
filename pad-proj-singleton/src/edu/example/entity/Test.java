package edu.example.entity;

import edu.example.singleton.SingletonEager;
import edu.example.singleton.SingletonLazy;
import edu.example.singleton.SingletonLazyHolder;

/*
*
* Testes relacionados ao modo Singleton de criação de instância
*
* */
public class Test {

    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstance();
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        SingletonEager eager = SingletonEager.getInstance();

        System.out.println("Lazy: " + lazy + "\nLazyHolder: " + lazyHolder + "\nEager: " + eager);

        lazy = SingletonLazy.getInstance();
        lazyHolder = SingletonLazyHolder.getInstance();
        eager = SingletonEager.getInstance();
        System.out.println("\nInstâncias 'alteradas'");
        System.out.println("Lazy: " + lazy + "\nLazyHolder: " + lazyHolder + "\nEager: " + eager);
    }
}
