package ru.valaubr.structure.proxy.realizations;

import lombok.NoArgsConstructor;
import ru.valaubr.structure.proxy.RealObject;
import ru.valaubr.structure.proxy.Subject;

@NoArgsConstructor
public class LazyInitProxy implements Subject {
    private RealObject realObject;

    @Override
    public void request() {
        if (realObject == null) {
            realObject = new RealObject();
            realObject.request();
        }
    }
}
