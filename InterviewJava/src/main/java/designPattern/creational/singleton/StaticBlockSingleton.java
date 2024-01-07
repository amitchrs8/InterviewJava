package designPattern.creational.singleton;

public class StaticBlockSingleton {

    private static StaticBlockSingleton instance = null;

    static {
        instance = new StaticBlockSingleton();
    }

    private StaticBlockSingleton(){
    }

    public static StaticBlockSingleton getInstance(){
        return instance;
    }


}
