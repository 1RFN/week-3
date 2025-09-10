import java.util.Scanner;

public class BiayaLiburan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah hari liburan: ");
        int hari = scanner.nextInt();
        System.out.println("Masukkan harga paket yang diinginkan:");
        System.out.println("1. Paket A (Rp 1000000/hari)");
        System.out.println("2. Paket B (Rp 1500000/hari)");
        System.out.print("Masukkan pilihan paket (1/2): ");
        int paket = scanner.nextInt();
        int hargaPerHari;
        if (paket == 1) {
            hargaPerHari = 1000000;
        } else if (paket == 2) {
            hargaPerHari = 1500000;
        } else {
            System.out.println("Pilihan paket tidak valid.");
            return;
        }
        int total = 0;
        for (int i = 1; i <= hari; i++) {
            System.out.println("Hari ke-" + i + ": Rp " + hargaPerHari);
            total += hargaPerHari;
        }
        System.out.println("Total biaya liburan selama " + hari + " hari adalah: Rp " + total);
    }
}
