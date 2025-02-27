import java.util.Scanner;
public class tugas2 {
    static Scanner sc = new Scanner(System.in);
    public static void volume(){
        System.out.print("Masukkan sisi: ");
        int sisi = sc.nextInt();
        int volume = sisi * sisi * sisi;
        System.out.println("Volume Kubus : " + volume);
    }
    public static void luasPermukaan(){
        System.out.print("Masukkan sisi: ");
        int sisi = sc.nextInt();
        int luas = 6 * sisi * sisi;
        System.out.println("Luas Permukaan Kubus : " + luas);
    }
    public static void keliling(){
        System.out.print("Masukkan sisi: ");
        int sisi = sc.nextInt();
        int keliling = 12 * sisi;
        System.out.println("Keliling Kubus : " + keliling);
    }
    public static void main(String[] args) {
        System.out.println("=============");
        System.out.println("Operasi KUBUS");
        System.out.println("=============");
        while (true) { 
        System.out.println("1. Volume");
        System.out.println("2. Luas Permukaan");
        System.out.println("3. Keliling");
        System.out.println("4. Keluar");
        System.out.print("Pilih Menu :");
        int menu = sc.nextInt();
        switch (menu) {
            case 1:
                volume();
                break;
            case 2:
                luasPermukaan();
                break;
            case 3:
                keliling();
                break;
            case 4:
                System.out.println("Terima Kasih");
                break;
        
            default:
            System.out.println("Menu Tidak Tersedia,Coba lagi");
                break;
            }
            if (menu == 4) {
                break;
            }
        }

    }
}
