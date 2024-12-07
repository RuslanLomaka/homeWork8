abstract class Vehicle {
   private Vehicle(){};// we don't want inheritances to have this constructor

    private String name;

    Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void move(String pointA, String pointB){
        System.out.println(this.name + "is moving from" + pointA + "to"+ pointB);
    }

    public void move() {
        System.out.println(this.name + "is moving.");
    }

    public void getPushed(Object obj) {
        System.out.println(this.name + "is being pushed by " + obj + ".");
        this.move();
    }

    public void getPulled(Object obj) {

        System.out.println(this.name + "is being pulled by " + obj + ".");
        this.move();
    }

    public void accelerate() {
        System.out.println(this.name + "is accelerating.");
        this.move();
    }

    public void slowDown() {
        System.out.println(this.name + "is slowing down.");
    }

    public void stop() {
        this.slowDown();
        System.out.println(this.name + "is halt.");
    }

    @Override
    public String toString() {
        return name;
    }
}