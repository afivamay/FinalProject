import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lamaSewa, jarakTempuh;
        int biayaMobil, biayaSupir, biayaBBM, totalBiaya;

        System.out.println("Masukan berapa lama sewa: ");
        lamaSewa = sc.nextInt();
        
        System.out.println("Masukan jarak tempuh: ");
        jarakTempuh = sc.nextInt();

        biayaMobil = 300000 * lamaSewa;
        biayaSupir = 200000 * lamaSewa;
        biayaBBM = 1000 * jarakTempuh;

        totalBiaya = biayaMobil + biayaSupir + biayaBBM;
        System.out.println("Jadi total biaya " + totalBiaya);
        System.out.println("Halo ini linda");
        sc.close();
    }
}
