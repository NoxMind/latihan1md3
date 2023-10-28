import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * kelas yang mempresentasikan HitungLuasPersegiPanjang
 */
public class HitungLuasPersegiPanjang {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(in);
        out.println("[[PROGRAM PERHITUNGAN LUAS PERSEGI PANJANG]]");

        /**
         * @param panjang persegi panjang
         * @param lebar persegi panjang
         * @param luas persegi panjang
         */
        out.print("Masukkan panjang persegi panjang anda: ");
        double panjang = scanner.nextDouble();

        out.print("Masukkan lebar persegi panjang anda: ");
        double lebar = scanner.nextDouble();

        double luas = panjang * lebar;

        out.println("Luas persegi panjang adalah: " + luas);

        scanner.close();
    }

    /**
     *Mendapatkan hasil luas nya
     *
     * @return Luas persegi panjang
     */
    public static double hitungLuasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }
}

