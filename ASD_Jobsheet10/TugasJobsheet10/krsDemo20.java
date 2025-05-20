package tugasJobshet10;

import java.util.Scanner;

public class krsDemo20 {
    public static void menu(){
        System.out.println("\n === Menu Antrian KRS === ");
        System.out.println("1. Tambahkan Antrian KRS Mahasiswa");
        System.out.println("2. Layani KRS Mahasiswa");
        System.out.println("3. Lihat 2 Mahasiswa Terdepan");
        System.out.println("4. Jumlah Mahasiswa dalam Antrian");
        System.out.println("5. Lihat Semua Antrian");
        System.out.println("6. Lihat Mahasiswa Terakhir");
        System.out.println("7. Cek Jumlah antrian");
        System.out.println("8. Cek Sisa Mahasiswa belum KRS");
        System.out.println("9. Kosongkan Antrian");
        System.out.println("0. Keluar");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        antrian antri = new antrian(10);
        int pilih;
        do {
        menu();
        System.out.print("Pilih Menu: ");
        pilih = sc.nextInt();
        sc.nextLine();
        switch (pilih) {
            case 1:
                System.out.print("NIM :");
                String nim = sc.nextLine();
                System.out.print("NAMA :");
                String nama = sc.nextLine();
                System.out.print("Kelas :");
                String kelas = sc.nextLine();
                krs20 krs = new krs20(nama, nim, kelas);
                antri.tambahAntrian(krs);
                break;
            case 2:
                antri.layaniKrs20();
                break;
            case 3:
                antri.peekDepan();
                break;
            case 4:
            System.out.println("Jumlah Mahasiswa dalam Antrian: " + antri.getJmlAntri());
                break;
            case 5:
                antri.print();
                break;
            case 6:
                antri.peekBelakang();
                break;
            case 7:
                System.out.println("Cek Jumlah antrian: "+antri.getJmlProsesKRS());
                break;
            case 8:
            System.out.println("Sisa Mahasiswa belum proses KRS: "+antri.getSisaMhs());
                break;
            case 9:
                antri.clear();
                break;
            case 0:
                System.out.println("Thanks You");
                break;
            default:
                break;
        }
        } while (pilih != 0 || pilih > 10);
    }
}
