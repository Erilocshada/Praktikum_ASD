package ALSD_Jobsheet12;
import java.util.Scanner;

public class DLLMain {
    public static void main(String[] args) {
        doubleLinkedList list = new doubleLinkedList();
        Scanner sc = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\n Menu DLL Mahasiswa");
            System.out.println("1. Tambah data diawal");
            System.out.println("2. Tambah data diAkhir");
            System.out.println("3. Hapus diawal");
            System.out.println("4. Hapus diAkhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("7. Tambah data setelah data");
            System.out.println("8. Tambah data");
            System.out.println("9. Hapus data setelah data");
            System.out.println("10. Hapus data menggunakan index");
            System.out.println("11. Menampilkan data awal");
            System.out.println("12. Menampilkan data akhir");
            System.out.println("13. Menampilkan data menggunakan index");
            System.out.println("14. Menampilkan Size data");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu : ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    Mahasiswa20 mhs = inputMahasiswa(sc);
                    list.addFirst(mhs);
                    break;
                case 2:
                    mhs = inputMahasiswa(sc);
                    list.addLast(mhs);
                    break;
                case 3:
                    list.removeFirst();
                    break;
                case 4:
                    list.removeLast();
                    break;
                case 5:
                    list.print();
                    break;
                case 6:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String Carinim = sc.nextLine();
                    node20 found = list.search(Carinim);
                    break;
                case 7:
                    System.out.print("Masukkan nim setelah siapa ingin ditambahkan: ");
                    String keyNIM = sc.nextLine();
                    Mahasiswa20 mhsInsertAfter = inputMahasiswa(sc);
                    list.insertAfter(keyNIM, mhsInsertAfter);
                    break;
                case 8:
                    mhs = inputMahasiswa(sc);
                    System.out.print("Masukkan Indexs ke :");
                    int index = sc.nextInt();
                    list.add(mhs, index);
                    sc.nextLine();
                    break;
                case 9:
                    System.out.print("Masukkan nim setelah siapa ingin dihapus: ");
                    String rmKey = sc.nextLine();
                    list.removeAfter(rmKey);
                    break;
                case 10:
                    System.out.print("Masukkan Index ke :");
                    int rmIndex = sc.nextInt();
                    list.remove(rmIndex);
                    break;
                case 11:
                    list.getFirst();
                    break;
                case 12:
                    list.getLast();
                    break;
                case 13:
                    System.out.print("Masukkan index ke :");
                    int getIndex = sc.nextInt();
                    list.getIndex(getIndex);
                    break;
                case 14:
                    System.out.println("Total Size :"+list.getSize());
                    break;
                case 0:
                    System.out.println("Keluar dari Program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while ( pilihan != 0);
    }
    public static Mahasiswa20 inputMahasiswa(Scanner sc){
        System.out.print("Masukkan NIM   : ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK   : ");
        double ipk = sc.nextDouble();
        sc.nextLine();

        return new Mahasiswa20(nim, nama, kelas, ipk);
    }
}