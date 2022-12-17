package module5;

public class MainFive {
    public static void main(String[] args){
        FactoryBus bus= new FactoryBus();
        bus.engineCheck();
        bus.applyBrake();
        System.out.println("_______");

        NepalYatayat NY = new NepalYatayat();
        NY.name = "Nepal Yatayat";
        NY.engineCheck();
        NY.applyBrake();
        NY.capacity(27);
        NY.Color();
        System.out.println("________");

        SajhaYatayat SY = new SajhaYatayat(32);
        SY.name = "Sajha Yatayat";
        SY.engineCheck();
        SY.applyBrake();
        SY.minimumCharge();
        SY.capacity();
        SY.Color();
    }
}
