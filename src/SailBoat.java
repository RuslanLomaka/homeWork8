public class SailBoat extends WindPoweredVehicle{
    SailBoat(String name) {
        super(name);
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
            System.out.println(getName()+" cant move.");
        }
    }
    @Override
    public void accelerate() {

        if (isWindy){
            System.out.println(getName() + "is accelerating.");
            this.move();
        }

    }

}

