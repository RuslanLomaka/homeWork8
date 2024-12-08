public class CartWagon extends MusculePoweredVehicle implements isCargoTransport{
    CartWagon(String name) {
        super(name);
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
