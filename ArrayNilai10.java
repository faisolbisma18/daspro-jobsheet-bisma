import java.util.Scanner;
public class ArrayNilai10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] nilaiakhir = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai akhirke-"+i+" : ");
            nilaiakhir[i] = sc.nextInt();


        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai akhir ke-"+i+" adalah "+nilaiakhir[i]);
        
        }
        sc.close();
    }
    
}
