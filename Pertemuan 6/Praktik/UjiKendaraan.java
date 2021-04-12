public class UjiKendaraan {
    static void Kendaraan(Vehicle vehicle) {
        vehicle.goStraight();
    }
    public static void main(String[] args) {
        Bicycle sepeda = new Bicycle();
        Motorvehicle mesin = new Motorvehicle();
        Motorcycle motor = new Motorcycle();
        Car mobil = new Car();

        sepeda.ringBell();
        Kendaraan(sepeda);

        System.out.println("----------------------------");
        mesin.Coba();
        Kendaraan(mesin);

        System.out.println("----------------------------");
        motor.AturGearFoot(2);
        motor.Cek();
        Kendaraan(motor);

        System.out.println("----------------------------");
        mobil.AturSeatBelt(1);
        System.out.println("Sabuk Sekarang Bernilai : "+ mobil.DapatSeatBelt());
        Kendaraan(mobil);


    }

}