package p2Jobsheet10;

import java.util.Scanner;

public class layananAkademikSiakad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        antrianLayanan antrian = new antrianLayanan(5);
        int pilih;
        do {
            System.out.println("\n === Menu Antrian Layanan Akademik === ");
            System.out.println("1. Tambah Antrian Mahasiswa");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("NIM   :");
                    String nim = sc.nextLine();
                    System.out.print("NAMA  : ");
                    String nama = sc.nextLine();
                    System.out.print("PRODI :");
                    String prodi = sc.nextLine();
                    System.out.print("KELAS :");
                    String kelas = sc.nextLine();
                    mahasiswa20 mhs = new mahasiswa20(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    mahasiswa20 dilayani = antrian.layaniMhs();
                    if (dilayani != null) {
                        System.out.print("Melayani Mahasiswa :");
                        dilayani.tampilData();
                    }
                    break;
                case 3:
                    antrian.liatTerdepan();
                    break;
                case 4:
                    antrian.print();
                    break;
                case 5:
                    antrian.getJmlAntri();
                    break;
                case 0:
                    System.out.println(" === Thanks You === ");
                default:
                    System.out.println("Pilih menu dengan benar");
                    break;
            }
        } while (pilih != 0 || pilih > 5);
    }
}
