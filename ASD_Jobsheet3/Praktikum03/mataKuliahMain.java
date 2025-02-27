package Praktikum_ASD.ALSD_Jobsheet3.Praktikum03;

import java.util.Scanner;

public class mataKuliahMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mataKuliah[] arrMataKuliah = new mataKuliah[3];
        String kode,nama,dummy;
        int sks,jmlJam;
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah Ke- "+(i+1));
            System.out.print("Kode      :");
            kode = sc.nextLine();
            System.out.print("Nama      :");
            nama = sc.nextLine();
            System.out.print("SKS       :");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah jam:");
            dummy = sc.nextLine();
            jmlJam = Integer.parseInt(dummy);
            System.out.println("----------------------");

            arrMataKuliah[i] = new mataKuliah(kode, nama,sks,jmlJam);
            
        }
        for (int i = 0; i < 3; i++) {
                System.out.println("Data Matakuliah Ke-"+(i+1));
                System.out.println("Kode        :"+arrMataKuliah[i].kode);
                System.out.println("Nama        :"+arrMataKuliah[i].nama);
                System.out.println("Kode        :"+arrMataKuliah[i].sks);
                System.out.println("Jumlah Jam  :"+arrMataKuliah[i].jmlJam);
        }
    }
}
