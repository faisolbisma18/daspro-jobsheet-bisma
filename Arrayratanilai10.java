import java.util.Scanner;
public class Arrayratanilai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();

        int[] nilaiMhs= new int[jumlahMhs];
        double totallulus=0, totaltidaklulus=0;
        int jmllulus=0, jmltidaklulus=0;

        for (int i=0; i<jumlahMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke- "+(i+i)+" : ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] >70) {
                totallulus += nilaiMhs[i];
                jmllulus++;
            }else{
                totaltidaklulus += nilaiMhs[i];
                jmltidaklulus++;
            }
        }
        double rata2lulus = jmllulus > 0 ? totallulus/jmllulus : 0;
        double rata2tidaklulus = jmltidaklulus > 0 ? totaltidaklulus/jmltidaklulus : 0;

        System.out.println("Rata-rata nilai lulus = " + rata2lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2tidaklulus);

        sc.close();
    }
}