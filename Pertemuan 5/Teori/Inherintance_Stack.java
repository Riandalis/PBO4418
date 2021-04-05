import java.util.Stack;

public class Inherintance_Stack {
    public static void main(String args[]){
        Kamera kamera = new Kamera();
        System.out.println(kamera.sisaKamera());

        kamera.tambahKamera("Nikon D3300");
        kamera.tambahKamera("Canon EOS 750D");
        kamera.tambahKamera("Canon EOS 5D Mark IV");
        System.out.println(kamera.sisaKamera());

        kamera.gantiKamera(1,"Canon EOS 5D Mark III");
        System.out.println(kamera.sisaKamera());

        kamera.kameraRusak();
        System.out.println(kamera.sisaKamera());
    }
}

class Kamera_Store{
    Stack<String> gear = new Stack<String>();

    public Kamera_Store(){
    }
    public void setKamera(Stack<String> gear) {
        this.gear = gear;
    }
    public Stack<String> getKamera(){
        return this.gear;
    }
}

class Kamera extends Kamera_Store {
    public void tambahKamera(String gear){
        super.getKamera().push(gear);
    }
    public String kameraRusak(){
        return super.getKamera().pop();
    }
    public void gantiKamera(int index, String gear){
        super.getKamera().set(index, gear);
    }
    public Stack<String> sisaKamera(){
        return super.getKamera();
    }
}