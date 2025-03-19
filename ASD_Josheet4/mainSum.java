package Praktikum_ASD.ALSD_Jobsheet4;

import java.util.Scanner;

public class mainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Elemen :");
        int elemen = sc.nextInt();

        sum20 sm = new sum20(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan Keuntungan ke-"+(i+1)+": ");
            sm.keuntungan[i] = sc.nextDouble();
        }
        System.out.println("Total Keuntungan menggunakan BruteForce :"+sm.totalBF(sm.keuntungan,0,2));
        System.out.println("Total Keuntungan menggunakan Devide and Conquer :"+sm.totalDC(sm.keuntungan,0,elemen-1));
    }
}
