import java.util.ArrayList;

public class Inherintance_ArrayList {
    public static void main(String args[]){
        Kamera kamera = new Kamera();
        System.out.println(kamera.sisaKamera());

        kamera.tambahKamera("Nikon D3300");
        kamera.tambahKamera("Canon EOS 750D");
        kamera.tambahKamera("Canon EOS 5D Mark IV");
        System.out.println(kamera.sisaKamera());

        kamera.gantiKamera(1,"Canon EOS 5D Mark III");
        System.out.println(kamera.sisaKamera());

        kamera.kameraRusak(0);
        System.out.println(kamera.sisaKamera());
    }
}

class Kamera_Store {
    ArrayList<String> gear = new ArrayList<String>();

    public Kamera_Store(){
    }
    public void setKamera(ArrayList<String> gear) {
        this.gear = gear;
    }
    public ArrayList<String> getKamera(){
        return this.gear;
    }

}

class Kamera extends Kamera_Store {
    public void tambahKamera(String gear){
        super.getKamera().add(gear);
    }
    public String kameraRusak(int index){
        return super.getKamera().remove(index);
    }
    public void gantiKamera(int index, String gear){
        super.getKamera().set(index, gear);
    }
    public ArrayList<String> sisaKamera(){
        return super.getKamera();
    }
}