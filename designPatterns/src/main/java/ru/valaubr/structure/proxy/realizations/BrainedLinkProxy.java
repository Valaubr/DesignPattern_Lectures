package ru.valaubr.structure.proxy.realizations;

import ru.valaubr.structure.proxy.RealObject;
import ru.valaubr.structure.proxy.Subject;

public class BrainedLinkProxy implements Subject {
    private RealObject realObject;
    private long counter = 0;

    public BrainedLinkProxy(RealObject realObject) {
        this.realObject = realObject;
    }

    @Override
    public void request() {
        System.out.println(++counter);
        realObject.request();
    }
}
