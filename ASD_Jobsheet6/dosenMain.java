package Praktikum_ASD.ALSD_Jobsheet6;

import java.util.Scanner;

public class dosenMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dataDosen listDosen = new dataDosen();

        while (true) { 
            System.out.println("-- Sorting Menu --");
            System.out.println("1. Tambahkan Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting menggunakan Bubble Sort(ASC)");
            System.out.println("4. Sorting menggunakan Selection Sort(DSC)");
            System.out.println("5. Sorting menggunakan Insertion Sort(DSC)");
            System.out.println("6. Searching menggunakan Nama");
            System.out.println("7. Searching menggunakan Usia");
            System.out.println("8. Keluar");
            System.out.print("Pilih Salah Satu :");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan total data yang mau ditambahkan :");
                    int data = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < data; i++) {
                        System.out.print("\nKode              : ");
                        String kode = sc.nextLine();  

                        System.out.print("Nama              : ");
                        String nama = sc.nextLine();  

                        System.out.print("Jenis Kelamin (L/P): ");
                        char gender = sc.next().charAt(0);
                        boolean jk = (gender == 'L' || gender == 'l');  

                        System.out.print("Usia              : ");
                        int usia = sc.nextInt();
                        sc.nextLine();


                        dosen dsn = new dosen(kode, nama, jk, usia);
                        listDosen.tambah(dsn);
                    }
                    break;
                case 2 :
                    System.out.println("\n--- Data Keseluruhan ---");
                    listDosen.tampil();
                    break;
                case 3:
                    System.out.println("\n Data telah diSorting (ASC - Bubble Sort)");
                    listDosen.sortingASC();
                    listDosen.tampil();
                    break;
                case 4:
                    System.out.println("\n Data telah diSorting (DSC - Selection Sort)");
                    listDosen.sortingDSC();
                    listDosen.tampil();
                    break;
                case 5:
                    System.out.println("\n Data telah diSorting (DSC - Insertion Sort)");
                    listDosen.insertionSort();
                    listDosen.tampil();
                    break;
                case 6:
                sc.nextLine();
                System.out.print("Masukkan nama dosen yang mau dicari :");
                String cariNama = sc.nextLine();
                listDosen.sequentialSearching(cariNama);
                    break;
                case 7:
                    System.out.println();
                    System.out.print("Masukkan Usia yang mau dicari :");
                    int cariUsia = sc.nextInt();
                    listDosen.cariBinarySearch(cariUsia);
                    break;
                case 8:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Masukkan data dengan benar");
                    break;
            }
            if (pilihan == 8) {
                break;
            }
        }
    }
}
