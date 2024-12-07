public class ElectricPoweredVehicle extends Vehicle {
    private int kWpower; //power in kilowatts

    public ElectricPoweredVehicle(int kWpower, String name) {
        super(name);
        this.kWpower = kWpower;

    }

    public int getkWpower() {
        return kWpower;
    }
}
