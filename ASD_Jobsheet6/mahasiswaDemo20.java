package Praktikum_ASD.ALSD_Jobsheet6;

import java.util.Scanner;

public class mahasiswaDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mahasiswaBerprestasi list = new mahasiswaBerprestasi();
        int jumMhs=5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa Ke -"+(i+1)+" : ");
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            String ip = sc.nextLine().replace(",", ".");
            double ipk = Double.parseDouble(ip);
            System.out.println("------------------------");
            list.tambah(new mahasiswa20(nim, nama, kelas, ipk));
        }
        list.tampil();
        // melakukan pencarian data sequential
        System.out.println("-----------------------------");
        System.out.println("Pencarian data");
        System.out.println("-----------------------------");
        System.out.println("Masukkan IPK mahasiswa yang dicari :");
        System.out.print("IPK\t :");
        String cariStr = sc.nextLine().replace(",", ".");
        double cari = Double.parseDouble(cariStr);

        System.out.println("Menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
        // melakukan pencarian data binary
        System.out.println("-----------------------------");
        System.out.println("Pencarian data");
        System.out.println("-----------------------------");
        System.out.println("Masukkan IPK mahasiswa yang dicari :");
        System.out.print("IPK\t :");
        String cariStr2 = sc.nextLine().replace(",", ".");
        double cari2 = Double.parseDouble(cariStr2);
        System.out.println("-----------------------------");
        System.out.println(" menggunakan binary search ");
        System.out.println("-----------------------------");
        double posisi2 = list.findBinarySearch(cari2, 0,jumMhs-1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari2, pss2);
        list.tampilDataSearch(cari2, pss2);
    }
}
