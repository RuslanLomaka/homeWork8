public class Bicycle extends MusculePoweredVehicle implements isPersonalTransport {
    Bicycle(String name) {
        super(name);
    }

    public void pedal() {
        System.out.println(this.getName() + " is being pedalled");
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
