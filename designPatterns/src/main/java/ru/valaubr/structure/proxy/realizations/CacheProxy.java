package ru.valaubr.structure.proxy.realizations;

import ru.valaubr.structure.proxy.RealObject;
import ru.valaubr.structure.proxy.Subject;

import java.time.LocalDateTime;

public class CacheProxy implements Subject {
    private RealObject realObject;
    private String cahce = "";
    private LocalDateTime cacheLiveTime = LocalDateTime.now();

    public CacheProxy(RealObject realObject) {
        this.realObject = realObject;
    }

    @Override
    public void request() {
        if (LocalDateTime.now().isBefore(cacheLiveTime)) {
            System.out.println(cahce);
        } else {
            realObject.request();
            cahce = "realObjectResponse at " + LocalDateTime.now();
            cacheLiveTime = LocalDateTime.now().plusMinutes(20);
        }
    }
}
