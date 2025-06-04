package ALSD_Jobsheet12;
public class Mahasiswa20 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa20(String nim, String nama, String kelas,double ipk) {
        this.nim = nim;
        this.kelas = kelas;
        this.nama = nama;
        this.ipk = ipk;
    }
    public void tampil(){
        System.out.println(nim + " " + nama + " "+ kelas +" "+ipk);
    }
}