import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int  km ;
        double perKm = 2.20, toplamTutar , baslangicUcreti=10;
        Scanner input = new Scanner(System.in);

        System.out.print("Katedilen Mesafeyi Giriniz : ");
        km =input.nextInt();

        toplamTutar = (km*perKm);
        toplamTutar += baslangicUcreti;

        toplamTutar = (toplamTutar<20) ? 20 : toplamTutar;
        System.out.println("Toplam Tutar" + toplamTutar);


    }
}
