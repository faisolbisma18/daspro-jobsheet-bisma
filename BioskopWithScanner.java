import java.util.Scanner;
public class BioskopWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        int pilihan;

        while (true) {
            System.out.println("\n=== Menu bioskop ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan baris (1-4): ");
                    int baris = sc.nextInt();
                    System.out.print("Masukkan kolom (1-2): ");
                    int kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil ditambahkan!");
                    }else{
                        System.out.println("Baris atau kolom tidak valid.");
                    }
                    break;

                case 2:
                    System.out.println("\nDaftar penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            String namapenonton = penonton[i][j];
                            if (namapenonton == null) {
                                namapenonton = "kosong";
                            }
                            System.out.printf("Baris %d, kolom %d: %s\n", i + 1, j + 1, namapenonton);
                        }
                    }
                    break;

                    case 3:
                        System.out.println("Terima kasih.");
                        sc.close();
                        return;

                    default:
                        System.out.println("Pilihan tidak valid. Silahkan pilih menu yang tersedia.");
                        break;
            }
        }
    

    }
    
}
