package Praktikum_ASD.ALSD_Jobsheet4;

import java.util.Scanner;

public class mainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai    :");
        int nilai = sc.nextInt();

        faktorial fk = new faktorial();
        System.out.println("Nilai Faktorial "+nilai+"menggunakan BF :"+fk.faktorialBF(nilai));
        System.out.println("Nilai Faktorial "+nilai+"menggunakan DC :"+fk.faktorialDC(nilai));
    }
}
