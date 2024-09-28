import java.util.Scanner;


public class PemilihanBilangan10{
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan sebuah angka: ");
        int angka = sc.nextInt();

        String hasil = (angka % 2 == 0) ? "termasuk bilangan genap" : "termasuk bilangan ganjil";
        System.out.println("angka " + angka + " " + hasil);
        

    }
}