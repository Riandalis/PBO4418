public class MotorVehicle extends Vehicle {

    public int sizeOffEngin = 1;
    public String licencePlate = "k 1234 NK";

    public MotorVehicle(){
    }

    public MotorVehicle(int sizeOffEngin, String licencePlate){
        this.sizeOffEngin = sizeOffEngin;
        this.licencePlate = licencePlate;
    }

    public int getSizeOfEngine(){
        return this.sizeOffEngin;
    }
    public String getLicencePlate(){
        return this.licencePlate;
    }

}
