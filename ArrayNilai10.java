import java.util.Scanner;
public class ArrayNilai10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] nilaiakhir = new int[10];

        for (int i = 0; i < nilaiakhir.length; i++){
            System.out.print("Masukkan nilai akhir ke-" +i+" : ");
            nilaiakhir[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (nilaiakhir[i] < 70) {
            System.out.println("Nilai akhir ke-" +i+"lulus");
            }else{
                System.out.println("Mahasiswa ke-"+i+"tidak lulus");

            }
        }
        sc.close();
    }
    
}
