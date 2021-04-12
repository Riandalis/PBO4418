import Transportasi.Bicycle;
import Transportasi.Mobil;

public class TransportasiDemo {

    public static void main(String[] args) {
//        Mobil
        System.out.println("---Mobil---");
        Mobil objectMobil = new Mobil();
        objectMobil.info();

//        Bicycle
        System.out.println("---Sepeda---");
        Bicycle objectBicycle = new Bicycle();
        objectBicycle.info();
    }

}
