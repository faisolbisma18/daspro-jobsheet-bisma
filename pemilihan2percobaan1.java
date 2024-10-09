import java.util.Scanner;

public class pemilihan2percobaan1 {
    public static void main(String[] args) {
    
        Scanner input10 = new Scanner(System.in);

        System.out.print("Masukkan tahun: ");
        int tahun = input10.nextInt(); 

        System.out.println("\nInformasi yang dimasukkan:");
        System.out.println("Tahun: " + tahun);

        if (tahun % 4 == 0) {
            if (tahun % 100 == 0)
            if (tahun % 400 == 0)
            System.out.println("tahun kabisat");
        } else {
            System.out.println("bukan tahun kabisat");
        }
        
    }
}