import java.util.Scanner;

public class PemilihanHariDenganIf<NoAbsen> {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan bilangan bulat
        System.out.print("Masukkan angka (1-7): ");
        int hari = scanner.nextInt();
        
        // Menggunakan pernyataan if untuk menentukan jenis hari
        if (hari >= 1 && hari <= 5) {
            System.out.println("Weekday");
        } else if (hari == 6 || hari == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid Number");
        }
        
        // Menutup scanner
        scanner.close();
    }
}
