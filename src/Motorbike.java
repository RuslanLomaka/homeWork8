import org.w3c.dom.ls.LSOutput;

public class Motorbike extends CombustionPoweredVehicle implements isPersonalTransport{
    public Motorbike(int hpPower, String name) {
        super(hpPower, name);
    }

    public void makeNoise(){
        System.out.println(this.getName()+": Vrm... brm.... wreoooeeooeommmnnnnnn!!!");
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
