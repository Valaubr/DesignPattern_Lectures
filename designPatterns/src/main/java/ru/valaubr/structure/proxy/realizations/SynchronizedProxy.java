package ru.valaubr.structure.proxy.realizations;

import lombok.AllArgsConstructor;
import ru.valaubr.structure.proxy.RealObject;
import ru.valaubr.structure.proxy.Subject;

@AllArgsConstructor
public class SynchronizedProxy implements Subject {
    private RealObject realObject;

    @Override
    public void request() {
        synchronized (realObject) {
            realObject.request();
        }
    }
}
