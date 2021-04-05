public class UjiCoba {

    public static void main(String[] args) {

        Bicycle sepeda = new Bicycle();
        MotorVehicle mtr = new MotorVehicle();

        System.out.println("---------------");
        System.out.println(sepeda.speed);
        System.out.println(sepeda.color);
        sepeda.turnRight();
        sepeda.ringBell();

        System.out.println("---------------");

        System.out.println(mtr.speed);
        System.out.println(mtr.color);
        System.out.println(mtr.licencePlate);
        System.out.println(mtr.sizeOffEngin);
        mtr.turnLeft();
        System.out.println(mtr.getLicencePlate());
        System.out.println(mtr.getSizeOfEngine());

        System.out.println("---------------");
    }

}
