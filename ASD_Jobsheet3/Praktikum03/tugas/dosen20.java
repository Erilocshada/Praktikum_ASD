package Praktikum_ASD.ALSD_Jobsheet3.Praktikum03.tugas;

public class dosen20 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    public dosen20(String kode, String nama, Boolean jenisKelamin, int usia){
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }
    public void tampilkanData(){
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia          : " + usia);
        System.out.println("----------------------");
    }
}
