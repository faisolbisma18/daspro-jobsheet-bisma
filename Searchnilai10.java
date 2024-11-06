import java.util.Scanner;
public class Searchnilai10 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
    
    System.out.print("Masukkan banyak nilai yang akan di input: ");
    int jmlnilai = sc.nextInt();
    int[] arrnilai =new int[jmlnilai];

    for (int i = 0; i < jmlnilai; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
        arrnilai[i]=sc.nextInt();
    }
    System.out.print("Masukkan nilai yang akan dicari: ");
    int key = sc.nextInt();

    int hasil = 0;
    for(int i=0; i<arrnilai.length; i++) {
        if (key==arrnilai[i]) {
            hasil = i+1;
            break;
        }
    }
    System.out.println();
    if (hasil != 0) {
        System.out.println("Nilai "+key+" ketemu, merupakan nilai mahasiswa ke-"+hasil);
    }else{
        System.out.println("Nilai "+key+"tidak ditemukan dalam array.");
    }
    sc.close();
    
}

}  
