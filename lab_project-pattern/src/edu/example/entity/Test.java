package edu.example.entity;

import edu.example.facade.Facade;
import edu.example.singleton.SingletonEager;
import edu.example.singleton.SingletonLazy;
import edu.example.singleton.SingletonLazyHolder;
import edu.example.strategy.*;

/*
*
* Testes relacionados aos padrões de projeto
*
* */
public class Test {

    public static void main(String[] args) {

        /*
        *  Modo Singleton de criação de instância
        * */

        SingletonLazy lazy = SingletonLazy.getInstance();
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        SingletonEager eager = SingletonEager.getInstance();

        System.out.println("Lazy: " + lazy + "\nLazyHolder: " + lazyHolder + "\nEager: " + eager);

        lazy = SingletonLazy.getInstance();
        lazyHolder = SingletonLazyHolder.getInstance();
        eager = SingletonEager.getInstance();
        System.out.println("\nInstâncias 'alteradas'");
        System.out.println("Lazy: " + lazy + "\nLazyHolder: " + lazyHolder + "\nEager: " + eager);

        /*
         *  Modo estratégia de comportamento
         * */

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        robo.mover();

        /*
        * Modo Facade para uso de recurso externo
        * */

        Facade facade = new Facade();
        facade.migrarCliente("Michael", "123");
    }
}
