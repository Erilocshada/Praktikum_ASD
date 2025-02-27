package Praktikum_ASD.ALSD_Jobsheet3.Praktikum03;

import java.util.Scanner;

public class mataKuliah {
    public String kode;
    public String nama;
    public int sks;
    public int jmlJam;

    public mataKuliah(String kode, String nama, int sks, int jmlJam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jmlJam = jmlJam;
    }
    public static void tambahData(mataKuliah[] arrMataKuliah, Scanner sc) {
        String kode, nama, dummy;
        int sks, jmlJam;
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah Ke- " + (i + 1));
            System.out.print("Kode      : ");
            kode = sc.nextLine();
            System.out.print("Nama      : ");
            nama = sc.nextLine();
            System.out.print("SKS       : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah jam: ");
            dummy = sc.nextLine();
            jmlJam = Integer.parseInt(dummy);
            System.out.println("----------------------");

            arrMataKuliah[i] = new mataKuliah(kode, nama, sks, jmlJam);
        }
    }
    
}
