package module5;

public class FactoryBus {
    protected  int capacity;
    protected String name = "Factory bus 002";
    FactoryBus(){
        System.out.println("\n Manufactured : 12/12/12\n");
    }
    void engineCheck(){
        System.out.printf("%s is ready to go \n", name);
    }
    void applyBrake(){
        System.out.println("Brake is applied and working");
    }
    void Color(){
        System.out.println("Default Color");
    }
}