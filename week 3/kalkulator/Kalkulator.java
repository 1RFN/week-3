import java.util.Scanner;
public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = scanner.nextInt();

        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Pembagian");
        System.out.println("4. Perkalian");
        System.out.print("Masukkan pilihan: ");
        int c = scanner.nextInt();

        switch (c) {
            case 1:
                Tambah tambah = new Tambah();
                tambah.a = a;
                tambah.b = b;
                System.out.println("Hasil penjumlahan: " + tambah.hitung());
                break;
            case 2:
                Kurang kurang = new Kurang();
                kurang.a = a;
                kurang.b = b;
                System.out.println("Hasil pengurangan: " + kurang.hitung());
                break;
            case 3:
                Bagi bagi = new Bagi();
                bagi.a = a;
                bagi.b = b;
                System.out.println("Hasil pembagian: " + bagi.hitung());
                break;
            case 4:
                Kali kali = new Kali();
                kali.a = a;
                kali.b = b;
                System.out.println("Hasil perkalian: " + kali.hitung());
                break;
            default:
                System.out.println("Operasi tidak dikenali");
        }

        scanner.close();
    }
}
