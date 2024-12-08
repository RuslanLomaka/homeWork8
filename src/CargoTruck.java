public class CargoTruck extends CombustionPoweredVehicle implements isCargoTransport {
    private int capacity;
    public CargoTruck(int hpPower, String name, int capacity) {
        super(hpPower, name);
        this.capacity = capacity;
    }

    @Override
    public void loadCargo() {
        System.out.println(getName() + "is loading cargo.Cargo loaded.");
    }

    @Override
    public void dropCargo() {
        System.out.println(getName() + "is unloading cargo.Cargo unloaded.");

    }
}
