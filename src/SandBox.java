public class SandBox {
    public static void main(String[] args) {
      /*  ElectricCar redTesla = new ElectricCar(100,"myRedTesla", 700);
        redTesla.move();
        redTesla.accelerate();
        redTesla.stop();

      */



       SailBoat myYacht = new SailBoat("My yacht");
       Galley alexanderTheGreatsGalley = new Galley("Alexander The Great's Galley");

        //WindPoweredVehicle.isWindy =true;
         WindPoweredVehicle.isWindy =false;
       myYacht.move();
       alexanderTheGreatsGalley.move();

    }
}
