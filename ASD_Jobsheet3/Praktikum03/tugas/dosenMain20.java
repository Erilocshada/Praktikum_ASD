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
        dataDosen20 dataDosen20 = new dataDosen20();
        while (true) {
        System.out.println("1. Data Semua Dosen");
        System.out.println("2. Jumlah Dosen Per Jenis Kelamin");
        System.out.println("3. Rata rata Usia Dosen Per Jenis Kelamin");
        System.out.println("4. Info dosen paling tua");
        System.out.println("5. Info dosen paling muda");
        System.out.println("6. Keluar");
        System.out.print("Masukkan Pilihan :");
        int pilihan = sc.nextInt();
        sc.nextLine();
        switch (pilihan) {
            case 1:
            dataDosen20.dataSemuaDosen(arrDosen20);
                break;
            case 2:
            dataDosen20.jumlahDosenPerJenisKelamin(arrDosen20);
                break;
            case 3:
                dataDosen20.rataRataUsiaDosenPerJenisKelamin(arrDosen20);
                break;
            case 4:
                dataDosen20.dosenPalingTua(arrDosen20);
                break;
            case 5:
                dataDosen20.dosenPalingMuda(arrDosen20);
                break;
            case 6:
                System.out.println("Terima Kasih");
                break;
        
            default:
            System.out.println("Masukkan Pilihan dengan benar");
                break;
        }
        if (pilihan == 6) {
            break;
        }
    }
    }
}
