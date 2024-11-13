import java.util.Scanner;

public class FlowchartProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan panjang array: ");
        int length = input.nextInt();
        
        double[] array = new double[length];
        double[] rata2Nilai = new double[6]; 
        double[] totalNilai = new double[6]; 
        
        
        for (int i = 0; i < length; i++) {
            System.out.print("Masukkan nilai array[" + i + "]: ");
            array[i] = input.nextDouble();
        }
        
        
        for (int i = 0; i < length; i++) {
            int j = 0;
            double sum = 0;
            int count = 0;
            
            while (j < 6) {
                System.out.print("Masukkan nilai untuk array[" + j + "]: ");
                double nilai = input.nextDouble();
                
                if (nilai >= 1 && nilai <= 5) {
                    totalNilai[j] = nilai;
                    sum += nilai;
                    count++;
                }
                
                j++;
            }
            
            
            if (count > 0) {
                rata2Nilai[i % 6] = sum / count;
            }
        }
        
        
        System.out.println("\nHasil Rata-rata:");
        for (int i = 0; i < 6; i++) {
            System.out.printf("Rata-rata nilai ke-%d: %.2f\n", (i + 1), rata2Nilai[i]);
        }
        
        input.close();
    }
}
