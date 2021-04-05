import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class Inheritance_Queue {

    public static void main(String args[]){
        Kamera kamera = new Kamera();
        System.out.println(kamera.sisaKamera());

        kamera.tambahKamera("Nikon D3300");
        kamera.tambahKamera("Canon EOS 750D");
        kamera.tambahKamera("Canon EOS 5D Mark II");
        kamera.tambahKamera("Canon EOS 5D Mark III");
        kamera.tambahKamera("Canon EOS 5D Mark IV");
        System.out.println(kamera.sisaKamera());

        kamera.kameraRusak(3);
        System.out.println(kamera.sisaKamera());
    }

    class Kamera_Store {
        Queue<String> gear = new LinkedList<String>();

        public Kamera_Store(){
        }
        public void setKamera(Queue<String> gear) {
            this.gear = gear;
        }
        public Queue<String> getKamera(){
            return this.gear;
        }

    }

    static class Kamera extends Kamera_Store {
        public void tambahKamera(String gear){
            super.getKamera().add(gear);
        }
        public Queue<String> sisaKamera(){
            return super.getKamera();
        }

        public void kameraRusak(int i) {
            System.out.println(super.getKamera().poll());
        }
    }

}
