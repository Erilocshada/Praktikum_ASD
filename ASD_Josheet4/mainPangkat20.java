package Praktikum_ASD.ALSD_Jobsheet4;

import java.util.Scanner;

public class mainPangkat20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Elemen :");
        int elemen = sc.nextInt();
        pangkat20[] png = new pangkat20[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai basis elemen ke-"+(i+1)+ ": ");
            int basis = sc.nextInt();
            System.out.print("Masukkan Pangkat basis elemen ke-"+(i+1)+": ");
            int pangkat = sc.nextInt();
            png[i] = new pangkat20(basis, pangkat);
        }
        System.out.println("Hasil Pangkat BruteForce");
        for (pangkat20 p : png) {
            System.out.println(p.nilai +"^"+p.pangkat+": "+p.pangkatBF(p.nilai, p.pangkat));
        }
        System.out.println("Hasil Pangkat Devide and Conquer");
        for (pangkat20 p : png) {
            System.out.println(p.nilai +"^"+p.pangkat+": "+p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}
