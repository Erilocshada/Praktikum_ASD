package Praktikum_ASD.ALSD_Jobsheet6;

public class dosen {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;
    dosen(String kd, String name, boolean jk, int age){
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }
    void tampil(){
        System.out.println("Kode            :"+ kode);
        System.out.println("Nama            :"+ nama);
        System.out.println("Jenis Kelamin :"+(jenisKelamin ? "Laki- Laki" : "Perempuan"));
        System.out.println("Usia            :"+usia);
    }
}
