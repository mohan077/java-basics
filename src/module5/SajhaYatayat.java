package module5;

public class SajhaYatayat extends FactoryBus{
    SajhaYatayat(){
    }
    SajhaYatayat(int capacity){
        this.capacity = capacity;
    }
    @Override
    void Color(){
        System.out.println("\nGreen Sajha Color\n");
    }
    void minimumCharge(){
        System.out.println("Minimum Charge is RS.20");
    }
    void capacity(){
        System.out.printf("Capacity is : %d",capacity);
    }
}