package ru.valaubr.structure.proxy.realizations;

import lombok.NoArgsConstructor;
import ru.valaubr.structure.proxy.Subject;

import java.net.MalformedURLException;
import java.rmi.server.RMIClassLoaderSpi;

@NoArgsConstructor
public class RemoteProxy implements Subject {
    private RMIClassLoaderSpi classLoader;

    @Override
    public void request() {
        try {
            classLoader.getClassLoader("RemoteClassLoader");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
