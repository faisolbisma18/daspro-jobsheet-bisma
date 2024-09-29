
import java.util.Scanner;
public class kategoriumur10 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukkan usia anda: ");

            if (scanner.hasNextInt()) {
            int usia = scanner.nextInt();
            if (usia >= 0) {
            if (usia <= 12) {
            System.out.println("kategori usia anda: anak");
            } else if (usia <= 19) {
            System.out.println("kategori usia anda: remaja");
            } else if (usia <= 64) {
            System.out.println("kategori usia anda: dewasa");
            } else {
            System.out.println("kategori usia anda: lansia");
            }
            } else {
            System.out.println("input tidak valid. usia harus berupa angka positif.");
            }
            } else {
            System.out.println("input tidak valid. harap masukkan angka.");
            }
        }
    }
