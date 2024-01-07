package designPattern.creational.abstractFactory;

public class TestAbstractFactoryPattern {


    public static void main(String[] args) {

        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("200 GB","50000 GB","12.4 GHz"));
        System.out.println("PC Config for AbstractFActory : "+pc);
        System.out.println("Server Config for AbstractFActory : "+server);

    }



}
