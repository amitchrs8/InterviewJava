package designPattern.creational.singleton;

public class ThreadSafeLazySingleton {
    private static ThreadSafeLazySingleton instance;

    private ThreadSafeLazySingleton(){
    }

    public static synchronized ThreadSafeLazySingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeLazySingleton();
        }
        return instance;
    }

}
