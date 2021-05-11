public class test {
  public static void main(String[] args) {
    Mobil mobil1 = new Sedan("ProMax","Lambo","S-001",100000000);
    Mobil mobil2 = new Minibus("ProMas","LamLam","MB-001",40000000);
    Mobil mobil3 = new Bus("ProBus","BusTam","B-001",80000000);

    Karyawan karyawan1 = new Karyawan("Rian","Sales",4);

    System.out.println("  ");

    Pembeli pembeli1 = new Individu("Dalis",1234567);
    pembeli1.addMobil(mobil1);
    pembeli1.addMobil(mobil2);

    System.out.println("  ");
    
    pembeli1.getMobil();

    System.out.println("  ");
    karyawan1.setGaji(pembeli1.invoice());
    System.out.println("Gaji Karyawan : Rp." + karyawan1.getGaji());
    System.out.println("  ");


    Pembeli pembeli2 = new Borongan("Raka",1234567);
    pembeli2.addMobil(mobil3,4);
    // pembeli2.addMobil(mobil3);
    // pembeli2.addMobil(mobil3);

    System.out.println("  ");

    pembeli2.getMobil();

    // System.out.println("  ");

    karyawan1.setGaji(pembeli2.invoice());
    System.out.println("Gaji Karyawan : Rp." + karyawan1.getGaji());
    System.out.println("  ");

    karyawan1.getPembeli(pembeli1);
    System.out.println("  ");
    karyawan1.getPembeli(pembeli2);

  }
}
