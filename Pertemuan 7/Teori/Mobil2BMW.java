public class Mobil2BMW extends Mobil2{
    private Boolean powerTv;
    private int gear;
    private int channel;

    Mobil2BMW(){
        this.powerTv = false;
    }

//    Set & Get
    public void setGear(int gear) {
        this.gear = gear;
    }
    public int getGear() {
        return gear;
    }
    public void setPowerTv(Boolean powerTv) {
        this.powerTv = powerTv;
    }
    public Boolean getPowerTv() {
        return powerTv;
    }
    public void setChannel(int channel) {
        this.channel = channel;
    }
    public int getChannel() {
        return channel;
    }

//    show
    public void show(){
        System.out.println("Tv Menampilkan gambar");
    }

}