import java.util.Scanner;
public class DaftarAtlet10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan jumlah politeknik yang mendaftar: ");
        int jumlahpoliteknik = sc.nextInt();
        sc.nextLine();

        for (int p = 1; p <= jumlahpoliteknik; p++) {
            System.out.print("\nMasukkan nama politeknik ke-" + p + ": ");
            String namapoliteknik = sc.nextLine();

            System.out.println("masukkan 5 nama atlet cabang olahraga badminton");
            System.out.print("atlet 1: ");
            String atletbadminton1 = sc.nextLine();
            System.out.print("atlet 2: ");
            String atletbadminton2 = sc.nextLine();
            System.out.print("atlet 3: ");
            String atletbadminton3 = sc.nextLine();
            System.out.print("atlet 4: ");
            String atletbadminton4 = sc.nextLine();
            System.out.print("atlet 5: ");
            String atletbadminton5 = sc.nextLine();

            System.out.println("Masukkan 5 nama atlet cabang olaharga tenis meja");
            System.out.print("atlet 1: ");
            String atlettenis1 = sc.nextLine();
            System.out.print("atlet 2: ");
            String atlettenis2 = sc.nextLine();
            System.out.print("atlet 3: ");
            String atlettenis3 = sc.nextLine();
            System.out.print("atlet 4: ");
            String atlettenis4 = sc.nextLine();
            System.out.print("atlet 5: ");
            String atlettenis5 = sc.nextLine();

            System.out.println("Masukkan 5 nama atlet cabang olahraga basket");
            System.out.print("atlet 1: ");
            String atletbasket1 = sc.nextLine();
            System.out.print("atlet 2: ");
            String atletbasket2 = sc.nextLine();
            System.out.print("atlet 3: ");
            String atletbasket3 = sc.nextLine();
            System.out.print("atlet 4: ");
            String atletbasket4 = sc.nextLine();
            System.out.print("atlet 5: ");
            String atletbasket5 = sc.nextLine();

            System.out.println("Masukkan 5 nama atlet cabang olahraga bola voli");
            System.out.print("atlet 1: ");
            String atletvoli1 = sc.nextLine();
            System.out.print("atlet 2: ");
            String atletvoli2 = sc.nextLine();
            System.out.print("atlet 3: ");
            String atletvoli3 = sc.nextLine();
            System.out.print("atlet 4: ");
            String atletvoli4 = sc.nextLine();
            System.out.print("atlet 5: ");
            String atletvoli5 = sc.nextLine();

            System.out.println("\n===== informasi nama atlet porseni =====");
            System.out.println("politeknik: " + namapoliteknik);

            System.out.println("cabang olahraga badminton");
            System.out.println("atlet: " + atletbadminton1 + ", " + atletbadminton2 + ", " + atletbadminton3 + ", " + atletbadminton4 + ", " + atletbadminton5);

            System.out.println("cabang olahraga tenis meja");
            System.out.println("atlet: " + atlettenis1 + ", " + atlettenis2 + ", " + atlettenis3 + ", " + atlettenis4 + ", " + atlettenis5);

            System.out.println("cabang olaharaga basket");
            System.out.println("atlet: " + atletbasket1 + ", " + atletbasket2 + ", " + atletbasket3 + ", " + atletbasket4 + ", " +atletbasket5);

            System.out.println("cabang olahraga bola voli");
            System.out.println("atlet: " + atletvoli1 + ", " + atletvoli2 + ", " + atletvoli3 + ", " + atletvoli4 + ", " +atletvoli5);

        }

        sc.close();

    }
    
}
