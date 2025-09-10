import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int a = scanner.nextInt();
        System.out.println("Nilai a =  " + a);
        scanner.close();
    }
}
