public class Galley extends WindPoweredVehicle{
    Galley(String name) {
        super(name);
    }

    public void row(){
        System.out.println(getName()+"'s slaves are rowing. They are sweating!");
    }

    public void unfoldSail(){
        System.out.println(getName()+"'s sail is unfolding. Done.");
    }

    public void foldSail(){
        System.out.println(getName()+"'s sail is folding. Done.");
    }

    @Override
    public void move(){
        this.unfoldSail();
        this.catchWind();
        if(isWindy){
            System.out.println(getName() + " is moving.");
        }else {
           row();
           System.out.println(getName() + " is moving.");
        }
    }
    @Override
    public void accelerate() {

        if (isWindy){
            System.out.println(getName() + " is accelerating.");
            this.move();
        }

    }


}
