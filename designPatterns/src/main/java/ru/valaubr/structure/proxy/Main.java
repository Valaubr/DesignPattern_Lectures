package ru.valaubr.structure.proxy;

import ru.valaubr.structure.proxy.realizations.*;

public class Main {
    public static void main(String[] args) {
        RealObject realObject = new RealObject();
        Subject lazyProxy = new LazyInitProxy();
        Subject filterProxy = new FilterProxy(realObject);
        Subject facadeProxy = new FacadeProxy(realObject);
        Subject cacheProxy = new CacheProxy(realObject);
        Subject brainedLinkProxy = new BrainedLinkProxy(realObject);

        lazyProxy.request();
        filterProxy.request();
        facadeProxy.request();
        System.out.println("-------------------------------");
        cacheProxy.request();
        cacheProxy.request();
        System.out.println("-------------------------------");
        brainedLinkProxy.request();
        brainedLinkProxy.request();
        brainedLinkProxy.request();
        brainedLinkProxy.request();
    }
}
