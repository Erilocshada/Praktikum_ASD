package Praktikum_ASD.ALSD_Jobsheet3.Praktikum03;

import java.util.Scanner;

public class mataKuliahMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tentukan Jumlah Elemen :");
        int arr = sc.nextInt();
        sc.nextLine();
        mataKuliah[] arrMataKuliah = new mataKuliah[arr];
        mataKuliah.tambahData(arrMataKuliah, sc);
        mataKuliah.cetakInfo(arrMataKuliah);
        
    }
}
