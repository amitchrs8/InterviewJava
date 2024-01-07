package designPattern.creational.singleton;

import java.io.Serializable;

public class SerialisedSingleton implements Serializable {

    private static final long serialVersionUUID = -312312312312L;

    private SerialisedSingleton() {
    }

    private static SerialisedSingleton instance;

    public static SerialisedSingleton getInstance() {
        if (instance == null) {
            instance = new SerialisedSingleton();
        }
        return instance;
    }


    protected Object readResolve() {
        return getInstance();
    }


}
