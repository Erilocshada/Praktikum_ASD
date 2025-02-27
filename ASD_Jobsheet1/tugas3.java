
import java.util.Scanner;

public class tugas3 {
    static Scanner sc = new Scanner(System.in);
    public static void tampilkanSeluruhJadwal(String mk[], int sks[], int smt[],String[]hari){
        System.out.println("\n Seluruh Jadwal Kuliah");
        for (int i = 0; i < mk.length; i++) {
            System.out.println(mk[i] + " | SKS: " + sks[i] + " | Semester: " + smt[i] + " | Hari: " + hari[i]);
        }
    }
    public static void jadwalKuliahPerHari(String mk[],int sks[],int smt[],String[]hari, String cariHari){
        System.out.println("\nJadwal Kuliah Berdasarkan Hari" + cariHari.toUpperCase());
        boolean ditemukan = false;
        for (int i = 0; i < mk.length; i++) {
            if (hari[i].equalsIgnoreCase(cariHari)) {
                System.out.println(mk[i] + " | SKS: " + sks[i] + " | Semester: " + smt[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah pada hari " + cariHari.toUpperCase());
        }
    }
    public static void jadwalKuliahPerSemester(String mk[],int sks[],int smt[],String[]hari,int cariSmt){
        System.out.println("\nJadwal Kuliah Berdasarkan Semester"+cariSmt);
        boolean ditemukan = false;
        for (int i = 0; i < mk.length; i++) {
            if (smt[i] == cariSmt) {
                System.out.println(mk[i] + " | SKS: " + sks[i] + " | Semester: " + smt[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah pada semester " + cariSmt);
        }
    }
    public static void mencariMK(String mk[],int sks[],int smt[],String [] hari, String cariMK){
        System.out.println("\nJadwal Mata Kuliah " + cariMK);
        boolean ditemukan = false;
        for (int i = 0; i < mk.length; i++) {
            if (mk[i].equalsIgnoreCase(cariMK)) {
                System.out.println("SKS: " + sks[i] + " | Semester: " + smt[i] + " | Hari: " + hari[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah " + cariMK + " tidak ditemukan");
        }
    }
    public static void main(String[] args) {
        System.out.print("Masukkan jumlah mata kuliah :");
        int n = sc.nextInt();
        sc.nextLine();
    String[] mk = new String[n];
    int [] sks=new int[n];
    int [] smt = new int[n];
    String [] hari = new String[n];

    for(int i=0; i<n; i++){
        System.out.print("Masukkan nama mata kuliah " + (i+1) + " : ");
        mk[i] = sc.nextLine();
        System.out.print("Masukkan sks mata kuliah " + (i+1) + " : ");
        sks[i] = sc.nextInt();
        System.out.print("Masukkan semester mata kuliah " + (i+1) + " : ");
        smt[i] = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan hari mata kuliah " + (i+1) + " : ");
        hari[i] = sc.nextLine();
        }
        while (true) {
        System.out.println("======================================================");
        System.out.println("===============JADWAL PERKULIAHAN=====================");
        System.out.println("======================================================");
        System.out.println("1. Menampilkan Seluruh Jadwal Kuliah");
        System.out.println("2. Menampilkan Jadwal Kuliah Berdasarkan Hari");
        System.out.println("3. Menampilkan Jadwal Kuliah Berdasarkan Semester");
        System.out.println("4. Mencari & Menampilkan Informasi Mata Kuliah");
        System.out.println("5. Keluar");
        System.out.print("Pilih Menu :");
        int menu = sc.nextInt();
        sc.nextLine();
        switch (menu) {
            case 1:
                tampilkanSeluruhJadwal(mk, sks, smt, hari);
                break;
            case 2:
            System.out.println("Masukkan hari yang ingin ditampilkan:");
            String cariHari = sc.nextLine();
                jadwalKuliahPerHari(mk, sks, smt, hari, cariHari);
                break;
            case 3:
            System.out.print("Masukkan Semester yang ingin ditampilkan:");
            int cariSmt = sc.nextInt();
            sc.nextLine();
                jadwalKuliahPerSemester(mk,sks,smt,hari,cariSmt);
                break;
            case 4:
                System.out.print("Masukkan Mata Kuliah yang ingin ditampilkan:");
                String cariMK = sc.nextLine();
                mencariMK(mk, sks, smt, hari, cariMK);
                break;
            case 5:
                System.out.println("Terima Kasih");
                break;
        
            default:
            System.out.println("Menu yang Anda Pilih Tidak Tersedia");
                break;
            }
            if (menu == 5) {
                break;
            }
        }
    }
}
