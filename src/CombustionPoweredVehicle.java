public class CombustionPoweredVehicle extends Vehicle {
    private int hpPower; //horse powers

    public CombustionPoweredVehicle(int hpPower, String name) {
        super(name);
        this.hpPower = hpPower;
    }

    public int getHpPower() {
        return hpPower;
    }

    public void refuel(String fuel) {
        System.out.println(this.getName() + "is refueled with" + fuel + ".");
    }
}


