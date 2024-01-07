package designPattern.creational.singleton;

public class LazyInitSingleton {

    private static LazyInitSingleton instance = null;

    private LazyInitSingleton(){

    }

    public static LazyInitSingleton getInstance(){
        if(instance ==null){
            instance = new LazyInitSingleton();
        }
        return instance;
    }
}
