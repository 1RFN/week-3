import java.util.Scanner;
public class cekNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = scanner.nextInt();
        
        if (nilai > 100) {
            System.out.println("Error!!! NILAI NGGAK MANUK AKAL!!!");
        }
        if (nilai >= 85 && nilai <= 100) {
            System.out.println("Grade: A");
        } else if (nilai >= 70 && nilai <= 84 ) {
            System.out.println("Grade: B");
        } else if (nilai >= 60 && nilai <= 69 ) {
            System.out.println("Grade: C");
        } else if (nilai >= 50 && nilai <= 59) {
            System.out.println("Grade: D");
        } else if (nilai >= 0 && nilai <= 49){
            System.out.println("Grade: F");
        }

        if (nilai >= 60 && nilai <= 100){
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }
        scanner.close();
    }
}
