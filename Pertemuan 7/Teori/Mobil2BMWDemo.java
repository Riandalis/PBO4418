public class Mobil2BMWDemo {

    public static void main(String[] args) {

        Mobil2BMW mobil = new Mobil2BMW();
        mobil.setPower(Boolean.TRUE);
        mobil.setPowerTv(Boolean.TRUE);
        mobil.setGear(2);
        mobil.setChannel(3);
        System.out.println("Mobil dihidupkan "+mobil.getPower());
        System.out.println("Tv dinyalakan "+mobil.getPowerTv());
        System.out.println("Channel tv : "+mobil.getChannel());
        System.out.println("Gigi Mobil : "+mobil.getGear());
        mobil.setGear(3);
        System.out.println("Ubah gigi ke "+mobil.getGear());
        mobil.setPower(Boolean.FALSE);
        System.out.println("Matikan mobil : "+mobil.getPower());

    }

}