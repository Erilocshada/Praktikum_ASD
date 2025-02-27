import java.util.Scanner;
public class tugas1 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        char kode[] = { 'A', 'B', 'D', 'E', 'F','G', 'H', 'L', 'N','T'};
        String kota[] = { "BANTEN", "JAKARTA", "BANDUNG", "CIREBON", "BOGOR",
                          "PEKALONGAN", "SEMARANG", "SURABAYA", "MALANG", "TEGAL" };

        System.out.println("==========================");
        System.out.println("Kode Plat Berdasarkan KOTA");
        System.out.println("==========================");
        System.out.print("Masukkan kode : ");
        char input = Character.toUpperCase(sc.next().charAt(0));
        boolean ditemukan = false;
        for (int i = 0; i < kode.length; i++) {
            if (kode[i] == input) {
                System.out.println("Kode plat " + input + " berasal dari kota: " + kota[i]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan!");
        }
        

    }
}