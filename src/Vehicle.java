abstract class Vehicle {
    String name;

    public void move() {
        System.out.println(this.name + "is moving.");
    }

    public void push() {
        System.out.println(this.name + "is being pushed.");
        this.move();
    }

    public void pull() {

        System.out.println(this.name + "is being pushed.");
        this.move();
    }

    public void accelerate() {
        System.out.println(this.name + "is accelerating.");
        this.move();
    }

    public void slowDown(){
        System.out.println(this.name + "is slowing down.");

    }

    public void stop() {
        this.slowDown();
        System.out.println(this.name + "is halt.");
    }


}
