package designPattern.creational.singleton;

import java.io.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SingletonTester {


    public static void main(String[] args) throws Exception {
        //Testing Eager Initialization of Singleton
//        IntStream.range(0,10).forEach(i-> System.out.println(EagerInitSingleton.getInstance()));

//        //Testing Static Block Initialization of Singleton
//        IntStream.range(0,10).forEach(i-> System.out.println(StaticBlockSingleton.getInstance()));

        //Testing Lazy Initialization of Singleton
//        Set<LazyInitSingleton> set = new HashSet<>();
//        IntStream.range(0,999999999).parallel().forEach(i-> set.add(LazyInitSingleton.getInstance()));
//        System.out.println("Size of Set  : "+set.size());

        //Testing ThreadSafe Lazy Initialization of Singleton
//        Set<ThreadSafeLazySingleton> set = new HashSet<>();
//        IntStream.range(0,1000).parallel().forEach(i-> set.add(ThreadSafeLazySingleton.getInstance()));
//        System.out.println("Size of Set  : "+set.size());


        //Testing Double Check ThreadSafe Initialization of Singleton
//        Set<ThreadSafeDoubleCheckSingleton> set = new HashSet<>();
//        IntStream.range(0,9000).parallel().forEach(i-> set.add(ThreadSafeDoubleCheckSingleton.getInstance()));
//        System.out.println("Size of Set  : "+set.size());


        //Testing Double Check ThreadSafe Initialization of Singleton
        Set<Set<SerialisedSingleton>> superSet = new HashSet<>();
        IntStream.range(0,20).forEach(i-> {
            try {
                superSet.add(getDeserialisedSingleTon(i));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        Set<SerialisedSingleton> finalList =  superSet.stream().flatMap(i->i.stream()).collect(Collectors.toSet());
        System.out.println("Desrialised Objects count "+finalList.size());

    }

    private static Set<SerialisedSingleton>  getDeserialisedSingleTon(int i ) throws Exception{
        SerialisedSingleton instanceOne = SerialisedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        out.writeObject(instanceOne);
        out.close();

        //deserialize the saved object
        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
        SerialisedSingleton instanceTwo = (SerialisedSingleton) in.readObject();
        in.close();

        Set<SerialisedSingleton> set = new HashSet<>();
        set.add(instanceOne);
        set.add(instanceTwo);

        return set;
    }



}
