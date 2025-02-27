import java.util.Scanner;

public class perulangan {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan NIM :");
        long NIM = sc.nextLong();
        int n = (int) (NIM % 100);
        if (n < 10) {
            n+=10;
        }
        System.out.println("n = " + n);
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }else if (i % 2 == 1) {
                System.out.print("*");
            } else {
                System.out.print(i+"");
            }
        }
    }
}
