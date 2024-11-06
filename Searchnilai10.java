import java.util.Scanner;
public class Searchnilai10 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
    
    System.out.print("masukkan jumlah nilai mahasiswa yang akan di input: ");
    int jumlahnilai = sc.nextInt();

    int[] nilaiMahasiswa = new int[jumlahnilai];

    for (int i = 0; i < jumlahnilai; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
        nilaiMahasiswa[i] = sc.nextInt();
    }

    double totalNilai = 0;
    for (int nilai : nilaiMahasiswa) {
        totalNilai += nilai;
    }

    double ratarata = totalNilai / jumlahnilai;

    int nilaitertinggi = nilaiMahasiswa[0];
    int nilaiterendah = nilaiMahasiswa[0];
    for (int nilai : nilaiMahasiswa) {
        if (nilai > nilaitertinggi) {
            nilaitertinggi = nilai;
        }
    }

    System.out.println("\nNilai mahasiswa yang telah di masukkan:");
    for (int nilai : nilaiMahasiswa) {
        System.out.println(nilai);
    }
    System.out.println("\nNilai rata-rata: " + ratarata);
    System.out.println("nilai tertinggi: " + nilaitertinggi);
    System.out.println("nilai terendah: " + nilaiterendah);

    sc.close();
    
}

}  
