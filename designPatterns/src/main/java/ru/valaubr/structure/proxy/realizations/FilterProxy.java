package ru.valaubr.structure.proxy.realizations;

import lombok.AllArgsConstructor;
import ru.valaubr.structure.proxy.RealObject;
import ru.valaubr.structure.proxy.Subject;

@AllArgsConstructor
public class FilterProxy implements Subject {
    private RealObject realObject;

    @Override
    public void request() {
        if (System.getenv("STAND") != null) {
            realObject.request();
        }
    }
}
