import java.util.Scanner;
public class Menukafe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi goreng", "Mie goreng", "Roti bakar", "Kentang goreng", "Teh tarik", "Cappucino", "Chocolate ice"};

        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String carimakanan = sc.nextLine();

        boolean ditemukan = false;
        for (String item : menu) {
            if (item.equalsIgnoreCase(carimakanan)) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Makanan '" + carimakanan + "' tersedia di menu.");
        }else{
            System.out.println("Makanan '" + carimakanan + "' tidak tersedia di menu.");
        }
        sc.close();
    }
}
