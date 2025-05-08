package ALSD_Jobsheet9;
import java.util.Scanner;
public class mahasiswaDemo {
    public static void main(String[] args) {
        stackMahasiswa20 stack = new stackMahasiswa20(5);
        Scanner sc = new Scanner(System.in);
        int pilih;
        
        do {
            System.out.println();
            System.out.println("Menu :");
            System.out.println("1. Mengumpulkan tugas");
            System.out.println("2. Menilai tugas");
            System.out.println("3. Melihat tugas teratas");
            System.out.println("4. Melihat tugas terbawah");
            System.out.println("5. Melihat daftar tugas");
            System.out.println("6. Melihat Jumlah tugas yang sudah dikumpulkan");
            System.out.print("Pilih Menu :");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama :");
                    String nama = sc.nextLine();
                    System.out.print("NIM :");
                    String nim = sc.nextLine();
                    System.out.print("Kelas :");
                    String kelas = sc.nextLine();
                    mahasiswa20 mhs = new mahasiswa20(nim,nama, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan", mhs.nama);
                    break;
                case 2:
                    mahasiswa20 dinilai = stack.pop();
                    if (dinilai != null) {
                    System.out.println("Menilai tugas dari "+ dinilai.nama);
                    System.out.print("Masukkan nilai (0-100): ");
                    int nilai = sc.nextInt();
                    dinilai.tugasDinilai(nilai);
                    System.out.printf("Nilai Tugas %s adalah %d \n", dinilai.nama, nilai);
                    String biner = stack.konversiDesimalKeBiner(nilai);
                    System.out.println("Nilai Biner tugas: "+biner);
                    }
                    break;
                case 3:
                    mahasiswa20 lihatTop = stack.peekTOP();
                    if (lihatTop != null) {
                    System.out.println("Tugas Terakhir dikumpulkan oleh " + lihatTop.nama);
                    }
                    break;
                case 4:
                    mahasiswa20 lihatBottom = stack.peekBOTTOM();
                    if (lihatBottom != null) {
                        System.out.println("Tugas Pertama dikumpulkan oleh "+ lihatBottom.nama);
                    }
                    break;
                case 5:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\t NIM \t Kelas");
                    stack.print();
                    break;
                case 6:
                    System.out.println("Jumlah tugas yang sudah dikumpulkan "+stack.jmlTugas());
                    break;
                default:
                System.out.println("Pilihan tidak Valid");
                    break;
            }
        } while (pilih >= 1 && pilih <= 6);
    }
}
