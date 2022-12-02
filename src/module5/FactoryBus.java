package module5;

public class FactoryBus {
    protected int capacity;
    protected String name = "Factory Bus 002";

    public FactoryBus() {
        System.out.println("\nManufatured : 12/12/12\n");
    }

    void engineCheck(){
        System.out.printf("%s is ready to go \n", name);
    }

    void applyBreak(){
        System.out.println("Break is applies and working");
    }

    void color(){
        System.out.println("Default Color");
    }
}
