public class WindPoweredVehicle extends Vehicle {
    public static boolean isWindy;

    WindPoweredVehicle(String name) {
        super(name);
    }

    public void catchWind() {
        if (isWindy) {
            System.out.println(this.getName() + " is catching wing. Success, wind detected!");
        } else {
            System.out.println(this.getName() + " is catching wing. Fail, no wind detected!");
        }
    }
}
