package module5;

public class NepalYatayat extends FactoryBus{
    NepalYatayat(){

    }

    @Override
    void Color() {
        System.out.println("\nNY Color\n");
    }
    void capacity(int capacityInput){
        capacity = capacityInput;
        System.out.printf("Bus capacity is : %d", capacityInput);
    }
    void MinimumCharge(){
        System.out.println("Minimum Charge is RS. 25");
    }
}
