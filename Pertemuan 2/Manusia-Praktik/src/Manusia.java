public class Manusia{
    private String nama;
    private boolean PunyaTV;

    public Manusia(){

    }

    public Manusia(String nama){
        this.nama = nama;
    }

    public String namaSaya(){
        return this.nama;
    }

    public void beliTV(TV tiviku){
        PunyaTV = true;
    }

    public void jualSemuaTV(){
        PunyaTV = false;
    }

    public boolean cekTV(){
        return PunyaTV;
    }

    public static void main(String[] args){
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println(" tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
        System.out.println(" tv2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);

        Manusia man1 = new Manusia("\nErik");
        System.out.println(man1.namaSaya());
        TV tvku = new TV();
        man1.beliTV(tvku);
        System.out.println(man1.cekTV());
        man1.jualSemuaTV();
        System.out.println(man1.cekTV());
    }

}