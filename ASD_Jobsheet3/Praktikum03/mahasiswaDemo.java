package Praktikum_ASD.ALSD_Jobsheet3.Praktikum03;
import java.util.Scanner;
public class mahasiswaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        mahasiswa[] arrayOfMahasiswa = new mahasiswa[3];
        arrayOfMahasiswa[0] = new mahasiswa();
        arrayOfMahasiswa[0].nim = "244107020064";
        arrayOfMahasiswa[0].nama = "Muhammad Pearl Ocshada";
        arrayOfMahasiswa[0].kelas = "TI 1E";
        arrayOfMahasiswa[0].ipk = (float)3.80;

        arrayOfMahasiswa[1] = new mahasiswa();
        arrayOfMahasiswa[1].nim = "244107020062";
        arrayOfMahasiswa[1].nama = "Muhammad Fauzi Rohman";
        arrayOfMahasiswa[1].kelas = "TI 1E";
        arrayOfMahasiswa[1].ipk = (float)3.76;

        arrayOfMahasiswa[2] = new mahasiswa();
        arrayOfMahasiswa[2].nim = "244107020064";
        arrayOfMahasiswa[2].nama = "Muhammad Fitra Adhim";
        arrayOfMahasiswa[2].kelas = "TI 1E";
        arrayOfMahasiswa[2].ipk = (float)3.50;


        
            System.out.println("Data Mahasiswa"+arrayOfMahasiswa[0]);
            System.out.println("NIM     : " + arrayOfMahasiswa[0].nim);
            System.out.println("Nama    : " + arrayOfMahasiswa[0].nama);
            System.out.println("Kelas   : " + arrayOfMahasiswa[0].kelas);
            System.out.println("IPK     : " + arrayOfMahasiswa[0].ipk);
            System.out.println("----------------------------------------");
            System.out.println("Data Mahasiswa"+arrayOfMahasiswa[1]);
            System.out.println("NIM     : " + arrayOfMahasiswa[1].nim);
            System.out.println("Nama    : " + arrayOfMahasiswa[1].nama);
            System.out.println("Kelas   : " + arrayOfMahasiswa[1].kelas);
            System.out.println("IPK     : " + arrayOfMahasiswa[1].ipk);
            System.out.println("----------------------------------------");
            System.out.println("Data Mahasiswa"+arrayOfMahasiswa[2]);
            System.out.println("NIM     : " + arrayOfMahasiswa[2].nim);
            System.out.println("Nama    : " + arrayOfMahasiswa[2].nama);
            System.out.println("Kelas   : " + arrayOfMahasiswa[2].kelas);
            System.out.println("IPK     : " + arrayOfMahasiswa[2].ipk);
            System.out.println("----------------------------------------");
        
    }
}