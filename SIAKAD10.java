import java.util.Scanner;
public class SIAKAD10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahsiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahmatkul = sc.nextInt();

        int[][] nilai = new int[jumlahsiswa][jumlahmatkul];

        for (int i = 0; i < jumlahsiswa; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalpersiswa = 0;

            for (int j = 0; j < jumlahmatkul; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalpersiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata mahasiswa ke-" + (i + 1) + ": " + totalpersiswa / jumlahmatkul);
        }
        System.out.println("\n==================================");
        System.out.println("Rata-rata nilai setiap mata kuliah: ");

        for (int j = 0; j < jumlahmatkul; j++) {
            double totalpermatkul = 0;
            
            for (int i = 0; i < jumlahsiswa; i++) {
                totalpermatkul += nilai[i][j];
            }
            System.out.println("Mata kuliah " + (j + 1) + ": " + totalpermatkul / jumlahsiswa);
        }
        sc.close();
    }
}