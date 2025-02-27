package Praktikum_ASD.ALSD_Jobsheet3.Praktikum03.tugas;

import java.util.Scanner;

public class dosenMain20 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Tentukan Jml data yang dimasukkan:");
    int jml = sc.nextInt();
    sc.nextLine();

    dosen20[] arrDosen20 = new dosen20[jml];
    for (int i = 0; i < arrDosen20.length; i++) {
        System.out.println("Masukkan Data Dosen Ke-"+(i+1));
        System.out.print("Kode          :");
        String kode = sc.nextLine();
        System.out.print("Nama          :");
        String nama = sc.nextLine();
        System.out.print("Jenis Kelamin (L/P):");
        char jk= sc.next().charAt(0);
        boolean jenisKelamin = (jk == 'L' || jk == 'l');
        sc.nextLine();
        System.out.print("Usia          :");
        int usia = sc.nextInt();
        sc.nextLine();

        arrDosen20[i] = new dosen20(kode, nama, jenisKelamin, usia);
        }
        System.out.println("------------Data Dosen-------------");
        for (int i = 0; i < arrDosen20.length; i++) {
            System.out.println("Data Dosen Ke-"+(i+1));
            System.out.println("Kode            :"+arrDosen20[i].kode);
            System.out.println("Nama            :"+arrDosen20[i].nama);
            System.out.println("Jenis Kelamin   :"+(arrDosen20[i].jenisKelamin ? "Laki Laki":"Perempuan"));
            System.out.println("Usia            :"+arrDosen20[i].usia);
            System.out.println("----------------------------------");
        }
    }

    
}
