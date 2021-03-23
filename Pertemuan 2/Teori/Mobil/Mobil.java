public class Mobil {
    String warna;
    int tahunProduksi;
    boolean on;
    int gigi = 0;

    Mobil(){
    }

//    Hidupkan & Matikan Mobil
    void turnOn(){
        on = true;
    }
    void turnOff(){
        on = false;
    }

//    SETTING GIGI
    void setGigi(int newGigi){
        if (on & newGigi < 5){
            gigi = newGigi;
        } else{
            System.out.println("salah memasukkan gigi");
        }
    }
    void gigiUp(){
        if (on & gigi < 5){
            gigi++;
        } else{
            System.out.println("salah memasukkan gigi");
        }
    }
    void gigiDown(){
        if (on & gigi < 5){
            gigi--;
        } else{
            System.out.println("salam memasukkan gigi");
        }
    }

    public static void main(String[] args){
//        Membuat Object
        Mobil mobilku = new Mobil();

//        Memanggil Atribut Bernilai nilai
        mobilku.warna = "Hitam";
        mobilku.tahunProduksi = 2021;

//        Memanggil atribut dan memberi nilai
        System.out.println("Warna : " + mobilku.warna);
        System.out.println("Tahun : " + mobilku.tahunProduksi);

        mobilku.turnOn();
        mobilku.setGigi(0);
        System.out.println("Gigi = " + mobilku.gigi);
        mobilku.gigiUp();
        System.out.println("Gigi = " + mobilku.gigi);




    }
}
