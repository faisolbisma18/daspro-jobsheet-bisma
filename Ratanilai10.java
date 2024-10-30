import java.util.Scanner;
public class Ratanilai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j, i = 1;
        float nilai, totalnilai, ratanilai;

        while (i <= 5){
            totalnilai = 0;
            System.out.println("input nilai mahasiswa ke " + i);

            for (j = 1; j <= 5; j++){
                System.out.print("nilai ke-" + j + " = ");
                nilai = sc.nextFloat();
                totalnilai += nilai;
            }

            ratanilai = totalnilai / 5;
            System.out.println("Rata-rata nilai mahasiswa ke " + i + " adalah " + ratanilai + "\n");
            i++;
        }
        sc.close();
    }
    
}
