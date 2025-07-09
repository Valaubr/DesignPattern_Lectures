package ru.valaubr.structure.proxy;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RealObject implements Subject {
    @Override
    public void request() {
        System.out.println("RealObject is called");
    }

    public String getClassName() {
        return this.getClass().getName();
    }

    public String getMethodName() {
        return this.getClass().getName();
    }
}
