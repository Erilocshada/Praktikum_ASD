package Tugas;
import java.util.Scanner;
public class mahasiswaDemo {
public static void menu(){
            System.out.println("\n==== MENU ====");
            System.out.println("1. Tambah Mahasiswa di Awal");
            System.out.println("2. Tambah Mahasiswa di Akhir");
            System.out.println("3. Tambah Mahasiswa Setelah Nama (insertAfter)");
            System.out.println("4. Tambah Mahasiswa di Indeks Tertentu (insertAt)");
            System.out.println("5. Tampilkan Data");
            System.out.println("6. Memanggil Antrian Mahasiswa diawal");
            System.out.println("7. Memanggil Antrian Mahasiswa diakhir");
            System.out.println("8. Memanggil Antrian Berdasarkan Key");
            System.out.println("0. Keluar");
    }
    public static mahasiswa20 inputMahasiswa(Scanner sc) {
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = sc.nextDouble();
        sc.nextLine();
        mahasiswa20 mhs = new mahasiswa20(nama, nim, kelas, ipk);
        return mhs;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        antrianMahasiswa sll = new antrianMahasiswa(null, null);
        int pilih;
        do { 
            menu();
            System.out.print("Pilih Menu\t: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    mahasiswa20 mhsAwal = inputMahasiswa(sc);
                    sll.addFirst(mhsAwal);
                    break;
                case 2:
                    mahasiswa20 mhsAkhir = inputMahasiswa(sc);
                    sll.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan nama setelah siapa ingin ditambahkan: ");
                    String keyNama = sc.nextLine();
                    mahasiswa20 mhsInsertAfter = inputMahasiswa(sc);
                    sll.insertAfter(keyNama, mhsInsertAfter);
                    break;
                case 4:
                    System.out.print("Masukkan indeks: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    mahasiswa20 mhsInsertAt = inputMahasiswa(sc);
                    sll.insertAt(index, mhsInsertAt);
                    break;
                case 5:
                    sll.print();
                    break;
                case 6:
                    sll.removeFirst();
                    System.out.println("Data Mahasiswa Awal Sudah Dihapus!");
                    sll.print();
                    break;
                case 7:
                    sll.removeLast();
                    System.out.println("Data Mahasiswa Akhir sudah dihapus!");
                    sll.print();
                    break;
                case 8:
                    System.out.print("Masukkan nama mahasiswa yang ingin dipanggil :");
                    String cari = sc.nextLine();
                    sll.remove(cari);
                    System.out.println("Data Mahasiswa Sudah dihapus!");
                    sll.print();
                    break;
                default:
                    System.out.println("Pilih Menu dengan benar !");
                    break;
            }
            
        } while (pilih !=0);
    }
}
