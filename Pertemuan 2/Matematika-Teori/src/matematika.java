public class matematika {
    int x,y,hasil;

    void penjumlahan(int x, int y){
        hasil = x + y;
        System.out.println("Penjumlahan : "+ x + " + " + y + " = " + hasil);
    }
    void pengurangan(int x, int y){
        hasil = x - y;
        System.out.println("Pengurangan : "+ x + " - " + y + " = " + hasil);
    }
    void perkalian(int x, int y){
        hasil = x * y;
        System.out.println("Perkalian : "+ x + " * " + y + " = " + hasil);
    }
    void pembagian(int x, int y){
        hasil = x / y;
        System.out.println("Pembagian : "+ x + " / " + y + " = " + hasil);
    }

    public static void main(String[] args){
        matematika mat1 = new matematika();
        mat1.penjumlahan(20,20);
        mat1.pengurangan(10,5);
        mat1.perkalian(10,20);
        mat1.pembagian(20,10);
    }
}
