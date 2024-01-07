package designPattern.creational.factory;

public class TestFactory {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("PC","50GB","HDD","64VPCU");
        Computer server = ComputerFactory.getComputer("Server","500GB","SuperHDD","6400VPCU");

        System.out.println("PC : "+pc);
        System.out.println("Server : "+server);
    }


}
