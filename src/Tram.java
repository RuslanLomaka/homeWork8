public class Tram extends ElectricPoweredVehicle implements isPublicTransport{
    public Tram(int kWpower, String name) {
        super(kWpower, name);
    }

    public void raisePontoon( ){
        System.out.println(this.getName()+ "'s pontoon is raising. Raised.");
    }

    public void lowerPontoon( ){
        System.out.println(this.getName()+ "'s pontoon is lowing down. Lowed down.");
    }

    @Override
    public void pickPassengers() {
        System.out.println(getName()+" is picking passengers. Done.");
    }

    @Override
    public void dropPassengers() {
        System.out.println(getName()+" is dropping passengers. Done.");
    }
}
