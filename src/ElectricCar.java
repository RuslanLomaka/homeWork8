public class ElectricCar extends ElectricPoweredVehicle implements isPersonalTransport{



    public ElectricCar(int kWpower, String name, int batteryCapacity) {
        super(kWpower, name);
        this.batteryCapacity = batteryCapacity;
    }
    private int batteryCapacity;



    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public void putToGarage() {
        move("here", "garage");
    }

    @Override
    public void getOutGarage() {
        move("garage", "here");
    }
}
