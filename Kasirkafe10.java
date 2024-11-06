import java.util.Scanner;
public class Kasirkafe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahpesanan = sc.nextInt();
        sc.nextLine();

        String[] namapesanan = new String[jumlahpesanan];
        double[] hargapesanan = new double[jumlahpesanan];

        for (int i = 0; i < jumlahpesanan; i++) {
            System.out.print("Masukkan pesanan ke-" + (i + 1) + ": ");
            namapesanan[i] = sc.nextLine();

            System.out.print("Masukkan harga " + namapesanan[i] + ": ");
            hargapesanan[i] = sc.nextDouble();
            sc.nextLine();
        }
        
        double totalbiaya = 0;
        for (double harga : hargapesanan) {
            totalbiaya += harga;
        }

        System.out.println("\nDaftar pesanan:");
        for (int i = 0; i < jumlahpesanan; i++) {
            System.out.println((i + 1) + ". " + namapesanan[i] + "- Rp" + hargapesanan[i]);
        }
        System.out.println("\nTotal biaya: Rp" + totalbiaya);

        sc.close();

        
    }
    
}
