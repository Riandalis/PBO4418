public class Buku {

    String judul, pengarang, penerbit;
    int tahun;

    Buku(String judul,String pengarang, String penerbit, int tahun){
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }
    void cetakBuku(){
        System.out.println("Judul = " + this.judul);
        System.out.println("Pengarang = " + this.pengarang);
        System.out.println("Penerbit = " + this.penerbit);
        System.out.println("Tahun = " + this.tahun);
    }


    public static void main(String[] args){
        Buku buku1 = new Buku("PBO dengan Java","Indrajani","Elexmedia",2007);
        buku1.cetakBuku();

        Buku buku2 = new Buku("Dasar Pemrogrmaman Java","Abdul Kadir","Andi Offset",2004);
        buku2.cetakBuku();


    }
}
